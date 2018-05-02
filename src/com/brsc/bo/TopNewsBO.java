/**
 * 
 */
package com.brsc.bo;

/**
 * 热点新闻
 * @author Administrator
 *
 */
public class TopNewsBO implements Comparable<TopNewsBO>{

	private Integer id;
	private String title;
	private Integer clickNum;
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
	@Override
	public int compareTo(TopNewsBO o) {
		int result = this.clickNum.compareTo(o.clickNum);
		return -1*(result==0?1:result);
	}
	
}
