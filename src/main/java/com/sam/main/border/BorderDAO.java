package com.sam.main.border;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.main.util.Pager;

@Repository
public class BorderDAO {
	
	@Autowired
	SqlSession sqlSession;
	final String NAMESPACE = "com.sam.main.border.";
	
	public int setBorderCountAdd(BorderDTO borderDTO) {
		return sqlSession.update(NAMESPACE + "setBorderCountAdd", borderDTO);
	}
	public int setBorderUpdate(BorderDTO borderDTO) {
		return sqlSession.update(NAMESPACE+"setBorderUpdate", borderDTO);
	}
	public int setBorderDelete(BorderDTO borderDTO) {
		return sqlSession.delete(NAMESPACE + "setBorderDelete", borderDTO);
	}
	public int setBorderImgDelete(BorderDTO borderDTO) {
		return sqlSession.delete(NAMESPACE+"setBorderImgDelete",borderDTO);
	}
	public BorderDTO getBorderDetail(BorderDTO borderDTO) {
		return sqlSession.selectOne(NAMESPACE + "getBorderDetail", borderDTO);
	}
	public int setBorderImgAdd(BorderImgDTO borderImgDTO) {
		return sqlSession.insert(NAMESPACE + "setBorderImgAdd", borderImgDTO);
	}
	public int setBorderAdd(BorderDTO borderDTO) {
		return sqlSession.insert(NAMESPACE+"setBorderAdd", borderDTO);
	}
	public List<BorderDTO> getBorderList(Pager pager) {
		return sqlSession.selectList(NAMESPACE + "getBorderList",pager);
	}
	public int getBorderCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE + "getBorderCount",pager);
	}
}
