package com.jdy.profile.dto;

public class Criteria {

	private int amount = 10; // 한 페이지당 출력 글 갯수
	private int pageNum = 1; // 클릭한 페이지 번호
	private int startNum; // 특정 페이지를 클릭했을 때, 해당하는 글의 시작번호(row number, 끝번호는 시작번호 + (amount-1))
	
	public Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Criteria(int amount, int pageNum, int startNum) {
		super();
		this.amount = amount;
		this.pageNum = pageNum;
		this.startNum = startNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
		
}
