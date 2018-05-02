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
 * ����ҵ���߼�������
 * @author Administrator
 *
 */
public interface NewsServiceI {

	/**
	 * ��ȡ��Ŀ�б����ż���
	 * @param bid ��ĿID
	 * @return ���ż���
	 */
	List<ListNewsBO> getListNews(Integer bid);
	/**
	 * ��þ������Ŷ���
	 * @param id ����ID
	 * @return �������Ŷ���
	 */
	DetailNewsBO getDetailNewsById(Integer id);
	/**
	 * ���ͼƬ���ż���
	 * @param bid ��ĿID
	 * @return ͼƬ���ż���
	 */
	List<PicNewsBO> getPicNews(Integer bid);
	/**
	 * ��ý�ʦ�������
	 * @return
	 */
	TeacherNewsBO getTeacherNews();
	/**
	 * ������Ŀ�����б�
	 * @param bid ��ĿID
	 * @return
	 */
	List<ListBannerNewsBO> getBannerNews(Integer bid);
	/**
	 * ����ȵ�����
	 * @return
	 */
	Set<TopNewsBO> getTopNews();
	List<ListNewsBO> getRelateNews(Integer bid,Integer id);
	/**
	 * �������ŵ����
	 * @param id
	 * @return
	 */
	void uptNewsClickRate(Integer id);
}
