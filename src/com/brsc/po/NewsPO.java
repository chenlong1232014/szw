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
	/** ���  */
	private Integer id;
	/** ����  */
	private String title;
	/** ����  */
	private String content;
	/** ��ʾ����  */
	private Date displayDate;
	/** ��������  */
	private Date issuedDate;
	/** ��ĿID  */
	private Integer banner_id;
	/** СͼƬURL */
	private String smallPicUrl;
	/** ��ͼƬURL */
	private String bigPicUrl;
	/** ���� */
	private String author;
	/** ����� */
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
