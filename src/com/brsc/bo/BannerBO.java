/**
 * 
 */
package com.brsc.bo;

/**
 * 列表栏目类
 * @author Administrator
 *
 */
public class BannerBO {

	/**  栏目ID */
	private Integer id;
	/**  栏目名称 */
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ListBannerBO [id=" + id + ", name=" + name + "]";
	}	
}
