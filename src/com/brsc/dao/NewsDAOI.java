/**
 * 
 */
package com.brsc.dao;

import java.util.List;

import com.brsc.po.NewsPO;

/**
 * 新闻数据库访问对象接口
 * @author Administrator
 *
 */
public interface NewsDAOI extends GenericDAOI<NewsPO, Integer> {
	
	/**
	 * 根据栏目ID获取新闻集合
	 * @param id 栏目ID
	 * @return 新闻集合
	 */
	 List<NewsPO> getNewsByBannerId(Integer bid);
}
