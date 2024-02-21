package com.fna.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.FileUploads;


public interface FileRepository extends JpaRepository<FileUploads, Integer> {

	@Query(value = "SELECT * from fileuploads where moduleid= :moduleid", nativeQuery = true)
	List<FileUploads> findFilesBasedOnId(@Param("moduleid") int moduleid);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE from fileuploads where filegeneratedname = :filegeneratedname", nativeQuery = true)
	 void deleteFile(@Param("filegeneratedname") String filegeneratedname); 

	
	@Modifying
	@Query(value="update fileuploads set moduleid=:id where fileuploadid=:fileId",nativeQuery=true)
	int update(@Param("id") int id,@Param("fileId") int fileId);
	
	@Query(value="select fileuploadid from fileuploads where moduleid=:moduleId",nativeQuery=true)
	int[] getByModuleId(@Param("moduleId") int moduleId);
} 
