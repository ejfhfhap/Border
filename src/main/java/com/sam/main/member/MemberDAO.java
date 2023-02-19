package com.sam.main.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.main.util.Pager;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.sam.main.member.";
	
	public int setMemberDelete(MemberDTO memberDTO) {
		return sqlSession.delete(NAMESPACE + "setMemberDelete",memberDTO);
	}
	public int setMemberUpdate(MemberDTO memberDTO) {
		return sqlSession.update(NAMESPACE + "setMemberUpdate", memberDTO);
	}
	public MemberDTO getMemberDetail(MemberDTO memberDTO) {
		return sqlSession.selectOne(NAMESPACE + "getMemberDetail", memberDTO);
	}
	public int setMemberAdd(MemberDTO memberDTO) {
		return sqlSession.insert(NAMESPACE + "setMemberAdd", memberDTO);
	}
	public List<MemberDTO> getMemberList(Pager pager){
		return sqlSession.selectList(NAMESPACE + "getMemberList", pager);
	}
	public int getMemberCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE + "getMemberCount", pager);
	}
}
