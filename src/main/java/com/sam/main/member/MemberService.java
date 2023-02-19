package com.sam.main.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.main.util.Pager;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public int setMemberDelete(MemberDTO memberDTO) {
		return memberDAO.setMemberDelete(memberDTO);
	}
	public MemberDTO setMemberLogin(MemberDTO memberDTO) {
		
		MemberDTO memberDTO2 = memberDAO.getMemberDetail(memberDTO);
		
		if(memberDTO2 != null && memberDTO2.getMemberPw().equals(memberDTO.getMemberPw())) {
			return memberDTO;
		}else {
			return null;
		}
	}
	public int setMemberUpdate(MemberDTO memberDTO) {
		return memberDAO.setMemberUpdate(memberDTO);
	}
	public MemberDTO getMemberDetail(MemberDTO memberDTO) {
		return memberDAO.getMemberDetail(memberDTO);
	}
	
	public int setMemberAdd(MemberDTO memberDTO) {
		return memberDAO.setMemberAdd(memberDTO);
	}
	
	public List<MemberDTO> getMemberList(Pager pager){
		pager.setTotalDataCount(memberDAO.getMemberCount(pager));
		pager.setBlockRange();
		pager.setDbRowRange();
		
		return memberDAO.getMemberList(pager);
	}
	
}
