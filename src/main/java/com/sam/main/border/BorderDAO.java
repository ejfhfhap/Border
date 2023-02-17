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
	
	public List<BorderDTO> getBorderList(Pager pager) {
		return sqlSession.selectList(NAMESPACE + "getBorderList",pager);
	}
	public int getBorderCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE + "getBorderCount",pager);
	}
}
