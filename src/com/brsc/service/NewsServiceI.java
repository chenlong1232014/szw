/**
 * 
 */
package com.brsc.service;

import java.util.List;
import java.util.Set;

import com.brsc.bo.DetailNewsBO;
import com.brsc.bo.ListBannerNewsBO;
import com.brsc.bo.TeacherNewsBO;
import com.brsc.bo.ListNewsBO;
import com.brsc.bo.PicNewsBO;
import com.brsc.bo.TopNewsBO;

/**
 * 新闻业务逻辑处理类
 * @author Administrator
 *
 */
public interface NewsServiceI {

	/**
	 * 获取栏目列表新闻集合
	 * @param bid 栏目ID
	 * @return 新闻集合
	 */
	List<ListNewsBO> getListNews(Integer bid);
	/**
	 * 获得具体新闻对象
	 * @param id 新闻ID
	 * @return 具体新闻对象
	 */
	DetailNewsBO getDetailNewsById(Integer id);
	/**
	 * 获得图片新闻集合
	 * @param bid 栏目ID
	 * @return 图片新闻集合
	 */
	List<PicNewsBO> getPicNews(Integer bid);
	/**
	 * 获得教师风采新闻
	 * @return
	 */
	TeacherNewsBO getTeacherNews();
	/**
	 * 具体栏目新闻列表
	 * @param bid 栏目ID
	 * @return
	 */
	List<ListBannerNewsBO> getBannerNews(Integer bid);
	/**
	 * 获得热点新闻
	 * @return
	 */
	Set<TopNewsBO> getTopNews();
	List<ListNewsBO> getRelateNews(Integer bid,Integer id);
	/**
	 * 更新新闻点击量
	 * @param id
	 * @return
	 */
	void uptNewsClickRate(Integer id);
}
