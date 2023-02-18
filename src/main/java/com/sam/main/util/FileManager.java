package com.sam.main.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	public String saveFile(String realPath,MultipartFile multipartFile) throws Exception {
		
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		String fileName = UUID.randomUUID().toString() + multipartFile.getOriginalFilename();
		file = new File(file, fileName);
		
		multipartFile.transferTo(file);
		return fileName;
	}
}
