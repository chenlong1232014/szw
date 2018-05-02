/**
 * 
 */
package com.brsc.po.wrapper;

import java.sql.ResultSet;
import java.util.List;

/**
 * 包装类接口
 * @author Administrator
 *
 */
public interface POWrapper {
 
	/**
	 * 将结果集包装个一个对象集合
	 * @param rs 结果集对象
	 * @return 对象集合
	 */
	List<Object> wrap(ResultSet rs);
}
