/**
 * 
 */
package com.brsc.service;

import java.util.List;

import com.brsc.bo.BannerBO;

/**
 * ��Ŀҵ�����߼���
 * @author Administrator
 *
 */
public interface BannerServiceI {

	/**
	 * ��ȡ�б���Ŀ����
	 * @return
	 */
	List<BannerBO> getListBanner();
	/**
	 * �����Ŀ
	 * @param bid ��ĿID
	 * @return
	 */
	BannerBO getBanner(Integer bid);
}
