/**
 * 
 */
package com.brsc.po.wrapper;

import java.sql.ResultSet;
import java.util.List;

/**
 * ��װ��ӿ�
 * @author Administrator
 *
 */
public interface POWrapper {
 
	/**
	 * ���������װ��һ�����󼯺�
	 * @param rs ���������
	 * @return ���󼯺�
	 */
	List<Object> wrap(ResultSet rs);
}
