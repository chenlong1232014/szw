/**
 * 
 */
package com.brsc.dao;

import java.util.List;

import com.brsc.po.NewsPO;

/**
 * �������ݿ���ʶ���ӿ�
 * @author Administrator
 *
 */
public interface NewsDAOI extends GenericDAOI<NewsPO, Integer> {
	
	/**
	 * ������ĿID��ȡ���ż���
	 * @param id ��ĿID
	 * @return ���ż���
	 */
	 List<NewsPO> getNewsByBannerId(Integer bid);
}
