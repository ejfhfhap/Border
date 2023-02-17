package com.sam.main.border;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.main.util.Pager;

@Service
public class BorderService {

	@Autowired
	BorderDAO borderDAO;
	
	public List<BorderDTO> getBorderList(Pager pager){
		
		pager.setTotalDataCount(borderDAO.getBorderCount(pager));
		pager.setBlockRange();
		pager.setDbRowRange();
		
		return borderDAO.getBorderList(pager);
	}
}
