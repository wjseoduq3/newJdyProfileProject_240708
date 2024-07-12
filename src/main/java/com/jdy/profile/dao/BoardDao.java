package com.jdy.profile.dao;

import java.util.ArrayList;

import com.jdy.profile.dto.BoardDto;
import com.jdy.profile.dto.Criteria;

public interface BoardDao {

	public void writeDao(String bid, String bname, String btitle, String bcontent); // 게시판 글쓰기
	public ArrayList<BoardDto> listDao(int amount, int pageNum); // 게시판 리스트 가져오기
	public BoardDto contentViewDao(String bnum); // 게시판 글 내용 보기
	public void contentModifyDao(String bnum, String btitle, String bcontent); // 게시판 글 수정하기
	public void contentDeleteDao(String bnum); // 게시판 글 삭제하기
	public int boardTotalCountDao();
	
	
	
}
