package com.myboard.mapper;

import java.util.List;
import com.myboard.vo.MyBoardVo;

public interface MyBoardMapper {
	
	//@Select("SELECT * FROM MYBOARD")
	public List<MyBoardVo> getList();
	
	public void insert(MyBoardVo board);
	
	public MyBoardVo read(String id);
	
	public int delete(String id);
	
	public int update(MyBoardVo board);
	
	

}
