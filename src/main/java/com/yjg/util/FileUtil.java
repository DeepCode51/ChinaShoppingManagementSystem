package com.yjg.util;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	public static String shangc(MultipartFile file) throws Exception{
		  	String pic_path = "F:\\picture\\";  
	       System.out.println("real path: " + pic_path);  
	       String fileName = file.getOriginalFilename(); 
	       
	       System.out.println("file name: " + fileName);  
	       File targetFile = new File(pic_path, fileName);  
	       if (!targetFile.exists()) {  
	           targetFile.mkdirs();  
	       }  
	       file.transferTo(targetFile);  
	       String fileUrl = fileName;  
	       return fileUrl;  
	}
}
