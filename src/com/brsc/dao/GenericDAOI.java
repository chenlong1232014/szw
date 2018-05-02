/**
 * 
 */
package com.brsc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * ͨ�����ݿ���ʶ���ӿ�
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
