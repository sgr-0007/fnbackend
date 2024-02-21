package com.fna;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.fna.service.FileService;

@SpringBootApplication
public class FnaApplication extends SpringBootServletInitializer {

	@Resource
	  FileService storageService;
	public static void main(String[] args) {
		SpringApplication.run(FnaApplication.class, args);
	}

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(FnaApplication.class);
	 }
}
