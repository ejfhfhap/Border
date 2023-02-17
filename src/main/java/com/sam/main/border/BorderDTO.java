package com.sam.main.border;

import java.sql.Date;

public class BorderDTO {
	private Integer borderId;
	private String memberId;
	private String borderTitle;
	private String borderDetail;
	private Date borderDate;
	private Integer borderCount;
	
	public Integer getBorderId() {
		return borderId;
	}
	public void setBorderId(Integer borderId) {
		this.borderId = borderId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBorderTitle() {
		return borderTitle;
	}
	public void setBorderTitle(String borderTitle) {
		this.borderTitle = borderTitle;
	}
	public String getBorderDetail() {
		return borderDetail;
	}
	public void setBorderDetail(String borderDetail) {
		this.borderDetail = borderDetail;
	}
	public Date getBorderDate() {
		return borderDate;
	}
	public void setBorderDate(Date borderDate) {
		this.borderDate = borderDate;
	}
	public Integer getBorderCount() {
		return borderCount;
	}
	public void setBorderCount(Integer borderCount) {
		this.borderCount = borderCount;
	}
	
}
