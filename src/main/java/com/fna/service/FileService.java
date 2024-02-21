package com.fna.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fna.common.ExcelHelper;
import com.fna.model.FileUploads;
import com.fna.model.PaymentFailure;
import com.fna.repository.FileRepository;
import com.fna.repository.PaymentFailureRepo;

@Service
public class FileService {
	private final Path root = Paths.get("C:/fnafiles");
	@Autowired
	private FileRepository filerepository;

	@Autowired
	private PaymentFailureRepo pfrepository;

	public void save(MultipartFile file) {
		try {

			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
		}
	}

	public void savePf(MultipartFile file) {
		try {
			List<PaymentFailure> pf = ExcelHelper.excelToPayment(file.getInputStream());
			pfrepository.saveAll(pf);
		} catch (IOException e) {
			throw new RuntimeException("fail to store excel data: " + e.getMessage());
		}
	}

	@Value("${savefileendpoint}")
	private String filesaveendpointurl;

	public String saveLocalStorage(MultipartFile file) {
		try {
			String name = getGeneratedFileName(file.getOriginalFilename());
			System.out.println("name" + name);
			Files.copy(file.getInputStream(), this.root.resolve(name));
			return name;
		} catch (Exception e) {
			throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
		}
	}

	public String getGeneratedFileName(String name) {
		LocalDateTime date = LocalDateTime.now();
		Random rd = new Random();
		int randvalu = rd.nextInt(100000);
		System.out.println(randvalu);
		String randValue = Integer.toString(randvalu);
		String modDate = date.toString().replace("-", "").replace(":", "").replace(".", "");
		String genName = modDate + randValue + name;
		System.out.println(date);
		return genName;
	}

	public ResponseEntity<FileUploads> saveFilesInfoToDb(FileUploads fileupload) {
		try {
			fileupload.setUrl(filesaveendpointurl + fileupload.getFilegeneratedname());
			filerepository.save(fileupload);
			return new ResponseEntity<>(fileupload, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public Resource load(String filename) {
		try {
			Path file = root.resolve(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("Could not read the file!");
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}
	}

	public ResponseEntity<List<FileUploads>> getFiles(int moduleid) {
		try {
			List<FileUploads> fileinfo = new ArrayList<FileUploads>();
			filerepository.findFilesBasedOnId(moduleid).forEach(fileinfo::add);
			if (fileinfo.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(fileinfo, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<FileUploads> getFilesByid(int fileid) {
		Optional<FileUploads> fileData = filerepository.findById(fileid);
		if (fileData.isPresent()) {

			System.out.println(fileData.get());
			return new ResponseEntity<>(fileData.get(), HttpStatus.ACCEPTED);

		} else {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}

	}

	public ResponseEntity<Resource> deleteFile(String filename) {
		try {
			FileSystemUtils.deleteRecursively(root.resolve(filename));
			filerepository.deleteFile(filename);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (IOException e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
