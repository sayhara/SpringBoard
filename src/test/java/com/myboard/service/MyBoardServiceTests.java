package com.myboard.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myboard.vo.MyBoardVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class MyBoardServiceTests {

	private Logger log = Logger.getLogger(MyBoardServiceTests.class);

	@Autowired
	private MyBoardService service;
	// MyBoardService가 MyBoardServiceImpl의 상위개념이므로 다음과 같이 사용가능

	@Test
	public void testGetList() {
		for (MyBoardVo board : service.getList()) {
			log.info(board);
		}
	}

}
