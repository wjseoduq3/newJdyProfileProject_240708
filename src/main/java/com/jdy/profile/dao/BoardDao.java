package com.jdy.profile.dao;

import java.util.ArrayList;

import com.jdy.profile.dto.BoardDto;

public interface BoardDao {

	public void writeDao(String bid, String bname, String btitle, String bcontent);
	public ArrayList<BoardDto> listDao();
	public BoardDto contentViewDao(String bnum);
	public void contentModifyDao(String bnum, String btitle, String bcontent);
	public BoardDto contentDeleteDao(String bnum);
		
	
	
	
	
	
}
