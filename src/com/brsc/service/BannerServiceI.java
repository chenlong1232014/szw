/**
 * 
 */
package com.brsc.service;

import java.util.List;

import com.brsc.bo.BannerBO;

/**
 * 栏目业务处理逻辑类
 * @author Administrator
 *
 */
public interface BannerServiceI {

	/**
	 * 获取列表栏目集合
	 * @return
	 */
	List<BannerBO> getListBanner();
	/**
	 * 获得栏目
	 * @param bid 栏目ID
	 * @return
	 */
	BannerBO getBanner(Integer bid);
}
