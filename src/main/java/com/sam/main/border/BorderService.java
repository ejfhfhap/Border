package com.sam.main.border;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sam.main.util.FileManager;
import com.sam.main.util.Pager;

@Service
public class BorderService {

	@Autowired
	BorderDAO borderDAO;
	@Autowired
	ServletContext servletContext;
	@Autowired
	FileManager fileManager;
	
	public int setBorderUpdate(BorderDTO borderDTO,MultipartFile multipartFile) throws Exception {
		
		if(multipartFile.getSize() != 0) {
			borderDAO.setBorderImgDelete(borderDTO);
			
			String realPath = servletContext.getRealPath("/resources/upload/border");
			String fileName = fileManager.saveFile(realPath, multipartFile);
			
			BorderImgDTO borderImgDTO = new BorderImgDTO();
			borderImgDTO.setBorderId(borderDTO.getBorderId());
			borderImgDTO.setImgName(fileName);
			borderImgDTO.setImgOriName(multipartFile.getOriginalFilename());

			int result = borderDAO.setBorderImgAdd(borderImgDTO);
		}
		
		return borderDAO.setBorderUpdate(borderDTO);
	}
	public int setBorderDelete(BorderDTO borderDTO) {
		int result = borderDAO.setBorderDelete(borderDTO);
		return borderDAO.setBorderImgDelete(borderDTO);
	}
	
	public BorderDTO getBorderDetail(BorderDTO borderDTO) {
		borderDAO.setBorderCountAdd(borderDTO);
		return borderDAO.getBorderDetail(borderDTO);
	}
	
	public int setBorderAdd(BorderDTO borderDTO,MultipartFile multipartFile) throws Exception {
		
		int result = borderDAO.setBorderAdd(borderDTO);
		
		if(multipartFile.getSize() != 0) {
			String realPath = servletContext.getRealPath("/resources/upload/border");
			String fileName = fileManager.saveFile(realPath, multipartFile);
			System.out.println("realPath: " + realPath);
			
			BorderImgDTO borderImgDTO = new BorderImgDTO();
			borderImgDTO.setBorderId(borderDTO.getBorderId());
			borderImgDTO.setImgOriName(multipartFile.getOriginalFilename());
			borderImgDTO.setImgName(fileName);
			
			result = borderDAO.setBorderImgAdd(borderImgDTO);
		}
		
		return result;
	}
	public List<BorderDTO> getBorderList(Pager pager){
		
		pager.setTotalDataCount(borderDAO.getBorderCount(pager));
		pager.setBlockRange();
		pager.setDbRowRange();
		
		return borderDAO.getBorderList(pager);
	}
}
