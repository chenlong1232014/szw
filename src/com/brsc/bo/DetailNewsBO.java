/**
 * 
 */
package com.brsc.bo;

import java.util.Date;

/**
 * ����������
 * @author Administrator
 *
 */
public class DetailNewsBO {

	/** ���ű��� */
	private String title;
	/** �������� */
	private String content;
	/** ���ŷ������� */
	private Date issuedDate;
	/** ���� */
	private String author;
	/** ����� */ 
	private Integer clickNum;
	/** ��ͼ */
	private String picUrl;
	/** ������Ŀ */
	private String banner;
	/** ��ĿID */
	private Integer bid;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getClickNum() {
		return clickNum;
	}
	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	
}
