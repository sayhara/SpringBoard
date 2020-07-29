package com.myboard.service;

import java.util.List;

import com.myboard.vo.MyBoardVo;

public interface MyBoardService {
	
	public List<MyBoardVo> getList();			//Mapper의 getList
	
	public void register(MyBoardVo board);		//Mapper의 insert
	
	public MyBoardVo get(String id);			//Mapper의 read
	
	public boolean remove(String id);			//Mapper의 delete
	
	public boolean modify(MyBoardVo board);		//Mapper의 update

}
