/**
 * 
 */
package com.brsc.po;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class BannerPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** 栏目ID */
	private Integer Id;
	/** 栏目名称 */
	private String name;
	/** 栏目备注 */
	private String memo;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public BannerPO() {
	}
	public BannerPO(Integer id, String name, String memo) {
		this();
		Id = id;
		this.name = name;
		this.memo = memo;
	}
	
	
	

}
