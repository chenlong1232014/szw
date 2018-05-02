/**
 * 
 */
package com.brsc.bo;

/**
 * 图片新闻类
 * @author Administrator
 *
 */
public class PicNewsBO {

	/** 新闻ID */
	private Integer id;
	/** 新闻标题 */
	private String title;
	/** 新闻图片地址 */
	private String bigPicUrl;
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
	public String getBigPicUrl() {
		return bigPicUrl;
	}
	public void setBigPicUrl(String bigPicUrl) {
		this.bigPicUrl = bigPicUrl;
	}

}
