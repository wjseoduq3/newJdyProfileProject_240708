package com.jdy.profile.dao;

import java.util.ArrayList;

import com.jdy.profile.dto.BoardDto;

public interface BoardDao {

	public void writeDao(String bid, String bname, String btitle, String bcontent);
	public ArrayList<BoardDto> listDao();
	
	
	
	
}
