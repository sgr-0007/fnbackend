package com.fna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

import com.fna.common.ExcelHelper;
import com.fna.message.ResponseMessage;
import com.fna.model.FileUploads;
import com.fna.service.FileService;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FileController {

	
	 @Autowired
	  FileService storageService;
	 @PostMapping("/upload")
	 public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
		    String message = "";
		    try {
		    	System.out.println(file.getName());
		      storageService.save(file);
		      message = "Uploaded the file successfully: " + file.getOriginalFilename();
		      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		    } catch (Exception e) {
		      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
		      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		    }
		  }
	 
	 @PostMapping("/fileinfo")
	    public ResponseEntity<FileUploads> addFile(@RequestBody FileUploads fileupload) {
	        return storageService.saveFilesInfoToDb(fileupload); 
	    }  
	 
	 @PostMapping("/files/upload")
	 public ResponseEntity<FileUploads> addFiles(@RequestParam("file") MultipartFile file ,@RequestParam(value="moduleType") int moduleType) {
		 
			 String name=storageService.saveLocalStorage(file);
			 FileUploads fileupload=new FileUploads();
			 fileupload.setfiledisplayname(file.getOriginalFilename());
			 fileupload.setFilegeneratedname(name);
			 fileupload.setFilemoduletype(moduleType);
			 
			 return storageService.saveFilesInfoToDb(fileupload); 
	    }  
	 
	 @GetMapping("/fileslist/{id}")
	  public ResponseEntity<List<FileUploads>> getListFiles(@PathVariable(value = "id") int moduleid) {
	    var files = storageService.getFiles(moduleid);
	    return files; 
	    
	  }
	 
	 @GetMapping("/currentfileslist/{id}")
	  public ResponseEntity<FileUploads> getCurrentListFiles(@PathVariable(value = "id") int fileid) {
	    var files = storageService.getFilesByid(fileid);
	    return files; 
	    
	  }
	 
	 
	 @GetMapping("/files/{filename:.+}")
	  @ResponseBody
	  public ResponseEntity<Resource> getFile(@PathVariable String filename) {
	    Resource file = storageService.load(filename);
	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	  }
	 
		
		  @DeleteMapping("/deletefiles/{id}")
		  
		  @ResponseBody public ResponseEntity<Resource> deleteFile(@PathVariable(value
		  = "id") String filegeneratedname) {
		 
		 return storageService.deleteFile(filegeneratedname);
		  
		   }
		  
		  @PostMapping("/uploadpaymentfailurefile")
		  public ResponseEntity<ResponseMessage> uploadFilePf(@RequestParam("file") MultipartFile file) {
		    String message = ""; 

		    if (ExcelHelper.hasExcelFormat(file)) {
		      try {
		    	  storageService.savePf(file);

		        message = "Uploaded the file successfully: " + file.getOriginalFilename();
		        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		      } catch (Exception e) {
		        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
		        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		      }
		    } 

		    message = "Please upload an excel file!";
		    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
		  }	  
	 
}
