package com.test.sa1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sam.main.border.BorderDAO;
import com.sam.main.border.BorderDTO;
import com.sam.main.member.MemberDAO;
import com.sam.main.member.MemberDTO;

public class test extends Mytest {
	
	@Autowired
	BorderDAO borderDAO;
	@Autowired
	MemberDAO memberDAO;
	
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
	
	@Test
	public void insertMember() {
		for(int i = 0;i<30;i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setMemberAddress("인천");
			memberDTO.setMemberEmail("admin@gmail.com");
			memberDTO.setMemberName("사람");
			memberDTO.setMemberPhone("010-8964-11635");
			memberDTO.setMemberPw("sdffds");
		}
	}
}
