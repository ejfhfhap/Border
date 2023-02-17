package com.sam.main.util;

public class Pager {
	
	// page랑 totaldatacount는 밖에서 가져와야함
	private Integer perBlock;
	private Integer minBlock;
	private Integer maxBlock;
	private Integer totalDataCount;
	private Boolean pre = true;
	private Boolean next = true;

	
	public void setBlockRange() {
		System.out.println("totalDataCount " + totalDataCount);

		int curBlock = getPage() / getPerBlock();
		if(getPage() % getPerBlock() != 0) {
			curBlock++;
		}

		minBlock = ((curBlock - 1) * getPerBlock()) + 1;
		maxBlock = curBlock * getPerBlock();
		
		int maxPage = totalDataCount / getPerPage();
		if(totalDataCount % getPerPage() != 0) {
			maxPage++;
		}
		if(page > maxPage) {
			page = maxPage;
		}
		if(maxBlock > maxPage) {
			maxBlock = maxPage;
		}
		System.out.println("block " + page);
		
		// ------ 다음으로 가는 페이지 활성화 비활성화
		if(curBlock == maxBlock) {
			next = false;
		}
		if(curBlock == 1) {
			pre = false;
		}
	}
	
	public Boolean getPre() {
		return pre;
	}
	public void setPre(Boolean pre) {
		this.pre = pre;
	}
	public Boolean getNext() {
		return next;
	}
	public void setNext(Boolean next) {
		this.next = next;
	}
	
	public Integer getTotalDataCount() {
		return totalDataCount;
	}
	public void setTotalDataCount(Integer totalDataCount) {
		this.totalDataCount = totalDataCount;
	}
	public Integer getMinBlock() {
		return minBlock;
	}
	public void setMinBlock(Integer minBlock) {
		this.minBlock = minBlock;
	}
	public Integer getMaxBlock() {
		return maxBlock;
	}
	public void setMaxBlock(Integer maxBlock) {
		this.maxBlock = maxBlock;
	}

	public Integer getPerBlock() {
		if(perBlock == null || perBlock < 1) {
			perBlock = 5;
		}
		return perBlock;
	}


	public void setPerBlock(Integer perBlock) {
		this.perBlock = perBlock;
	}




	// ------------------ db에서의 데이터 범위 구하기 ----------------
	private Integer page;
	private Integer perPage;
	private Integer minRow;
	private Integer maxRow;
	
	public void setDbRowRange() {
		minRow = ((this.getPage()-1) * this.getPerPage()) + 1;
		maxRow = (this.getPage() * this.getPerPage());
	}
	
	
	public Integer getPage() {
		if(page == null || page < 1) {
			page = 1;
		}
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPerPage() {
		if(perPage == null || perPage < 1) {
			perPage = 5;
		}
		return perPage;
	}
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
	public Integer getMinRow() {
		return minRow;
	}
	public void setMinRow(Integer minRow) {
		this.minRow = minRow;
	}
	public Integer getMaxRow() {
		return maxRow;
	}
	public void setMaxRow(Integer maxRow) {
		this.maxRow = maxRow;
	}


	// -------------------- 검색 관련 ----------------------
	
	
	private String searchKind;
	private String searchDetail;
	public String getSearchKind() {
		if(searchKind == null) {
			searchKind = "member";
		}
		return searchKind;
	}
	public void setSearchKind(String searchKind) {
		this.searchKind = searchKind;
	}
	public String getSearchDetail() {
		if(searchDetail == null) {
			searchDetail = "";
		}
		return searchDetail;
	}
	public void setSearchDetail(String searchDetail) {
		this.searchDetail = searchDetail;
	}
	
}
