/**
 * 
 */
package com.brsc.bo;

/**
 * 列表新闻类（只有ID和标题）
 * @author Administrator
 *
 */
public class ListNewsBO {

	/** 新闻ID */
	private Integer id;
	/** 新闻标题 */
	private String title;
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
	
}
