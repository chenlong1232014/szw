/**
 * 
 */
package com.brsc.bo;

import java.util.Date;

/**
 * 栏目列表新闻
 * @author Administrator
 *
 */
public class ListBannerNewsBO {

	private Integer id;
	private String title;
	private String content;
	private Date displayDate;
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
	
}
