/**
 * 
 */
package com.brsc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 通用数据库访问对象接口
 * @author Administrator
 *
 */
public interface GenericDAOI <T extends Serializable,Id>{

	boolean addObj(T obj);
	boolean delObj(Id id);
	boolean uptObj(T obj);
	T getObjById(Id id);
	List<T> getObjs();
}
