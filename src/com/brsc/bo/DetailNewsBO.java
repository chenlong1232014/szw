/**
 * 
 */
package com.brsc.bo;

import java.util.Date;

/**
 * 具体新闻类
 * @author Administrator
 *
 */
public class DetailNewsBO {

	/** 新闻标题 */
	private String title;
	/** 新闻内容 */
	private String content;
	/** 新闻发布日期 */
	private Date issuedDate;
	/** 作者 */
	private String author;
	/** 点击量 */ 
	private Integer clickNum;
	/** 配图 */
	private String picUrl;
	/** 所属栏目 */
	private String banner;
	/** 栏目ID */
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
