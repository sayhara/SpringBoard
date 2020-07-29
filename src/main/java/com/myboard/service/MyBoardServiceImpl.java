package com.myboard.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboard.mapper.MyBoardMapper;
import com.myboard.vo.MyBoardVo;


@Service
public class MyBoardServiceImpl implements MyBoardService {
	
	@Autowired
	private MyBoardMapper mapper;
	
	private Logger log=Logger.getLogger(MyBoardServiceImpl.class);

	@Override
	public List<MyBoardVo> getList() {
		log.info("글 목록");
		return mapper.getList();
	}

	@Override
	public void register(MyBoardVo board) {
		log.info("새 글 등록: " +board);
		mapper.insert(board);
		
	}

	@Override
	public MyBoardVo get(String id) {
		log.info("글 보기: "+id);
		return mapper.read(id);
	}

	@Override
	public boolean remove(String id) {
		log.info("글 삭제: "+id);
		return mapper.delete(id)==1;	//결과가 1이면 True, 0이면 False
	}

	@Override
	public boolean modify(MyBoardVo board) {
		log.info("글 수정: "+board);
		return mapper.update(board)==1;
	}

}
