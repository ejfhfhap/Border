package com.sam.main.border;

import java.sql.Date;

public class BorderDTO {
	private Integer borderId;
	private String memberId;
	private String borderTitle;
	private String borderDetail;
	private Date borderDate;
	private Integer borderCount;
	private BorderImgDTO borderImgDTO;
	
	
	public BorderImgDTO getBorderImgDTO() {
		return borderImgDTO;
	}
	public void setBorderImgDTO(BorderImgDTO borderImgDTO) {
		this.borderImgDTO = borderImgDTO;
	}
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
		//if(borderTitle == "")return null;
		return borderTitle;
	}
	public void setBorderTitle(String borderTitle) {
		this.borderTitle = borderTitle;
	}
	public String getBorderDetail() {
		//if(borderDetail == "")return null;
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
		 if(borderCount == null) {
			 borderCount = 0;
		 }
		return borderCount;
	}
	public void setBorderCount(Integer borderCount) {
		this.borderCount = borderCount;
	}
	
}
