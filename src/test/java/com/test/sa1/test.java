package com.test.sa1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sam.main.border.BorderDAO;
import com.sam.main.border.BorderDTO;

public class test extends Mytest {
	
	BorderDAO borderDAO = new BorderDAO();
	
	
	@Test
	public void insertBorder() {
		for(int i = 0;i<30;i++) {
			BorderDTO borderDTO = new BorderDTO();
			borderDTO.setBorderCount(1);
			borderDTO.setBorderDetail("sdf");
			borderDTO.setMemberId("강한나");
			borderDTO.setBorderTitle("dfsdf");
			borderDTO.setBorderId(i);
			borderDAO.setBorderAdd(borderDTO);
		}
	}
}
