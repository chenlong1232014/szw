/**
 * 
 */
package com.brsc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class NewsPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 编号  */
	private Integer id;
	/** 标题  */
	private String title;
	/** 内容  */
	private String content;
	/** 显示日期  */
	private Date displayDate;
	/** 发布日期  */
	private Date issuedDate;
	/** 栏目ID  */
	private Integer banner_id;
	/** 小图片URL */
	private String smallPicUrl;
	/** 大图片URL */
	private String bigPicUrl;
	/** 作者 */
	private String author;
	/** 点击量 */
	private Integer clickNum;
	
	
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getDisplayDate() {
		return displayDate;
	}
	public void setDisplayDate(Date displayDate) {
		this.displayDate = displayDate;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getSmallPicUrl() {
		return smallPicUrl;
	}
	public void setSmallPicUrl(String smallPicUrl) {
		this.smallPicUrl = smallPicUrl;
	}
	public String getBigPicUrl() {
		return bigPicUrl;
	}
	public void setBigPicUrl(String bigPicUrl) {
		this.bigPicUrl = bigPicUrl;
	}
	public Integer getBanner_id() {
		return banner_id;
	}
	public void setBanner_id(Integer banner_id) {
		this.banner_id = banner_id;
	}
	public NewsPO() {
	}
	
}
