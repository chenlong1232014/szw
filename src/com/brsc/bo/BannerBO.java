/**
 * 
 */
package com.brsc.bo;

/**
 * �б���Ŀ��
 * @author Administrator
 *
 */
public class BannerBO {

	/**  ��ĿID */
	private Integer id;
	/**  ��Ŀ���� */
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
