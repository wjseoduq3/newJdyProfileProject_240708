package com.jdy.profile.dto;

public class PageDto {
	
	private int startPage; // ">or <"를 클릭했을 때 화면에 보여지는 페이지 번호 중 처음 보이는 페이지 번호
	private int endPage; // ">or <"를 클릭했을 때 화면에 보여지는 페이지 번호 중 마지막 보이는 페이지 번호
	private boolean next; 
	private boolean prev;
	private int total; // 총 글의 갯수
	private Criteria criteria;
	
	public PageDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageDto(int startPage, int endPage, boolean next, boolean prev, int total, Criteria criteria) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.next = next;
		this.prev = prev;
		this.total = total;
		this.criteria = criteria;
	}

	public PageDto(int total, Criteria criteria) {
		
		this.total = total;
		this.criteria = criteria;
		
		this.endPage = (int) ((Math.ceil(criteria.getPageNum()/10.0))*10); // 10은 한 화면에 보여질 페이지 수
		this.startPage = this.endPage - 9;	
		
		int realEndPage = (int) Math.ceil(total*1.0 / criteria.getAmount());
		
		if (realEndPage < this.endPage) {
			this.endPage = realEndPage;
		}
	}
	
	

}
