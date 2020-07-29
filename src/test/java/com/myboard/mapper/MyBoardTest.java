package com.myboard.mapper;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myboard.vo.MyBoardVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class MyBoardTest {
	
	private Logger log=Logger.getLogger(MyBoardTest.class);
	
	@Autowired
	private MyBoardMapper mapper;
	
	@Test
	public void testGetList() {
		for(MyBoardVo board:mapper.getList()) {
			log.info(board);
		}
	}
	

}
