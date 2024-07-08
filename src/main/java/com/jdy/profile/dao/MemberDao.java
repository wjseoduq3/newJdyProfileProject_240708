package com.jdy.profile.dao;

import java.util.ArrayList;

import com.jdy.profile.dto.MemberDto;

public interface MemberDao {
	
	public void joinDao(String mid, String mpw, String mname, String memail); //회원 가입
	public int idCheckDao(String mid); //아이디 존재여부 반환
	public int loginCheckDao(String mid, String mpw); //로그인 체크
	public MemberDto getMemberInfoDao(String mid); //아이디로 검색해서 회원정보 가져오기
	
	
}
