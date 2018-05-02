/**
 * 
 */
package com.brsc.dao.test;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

import com.brsc.dao.BannerDAOI;
import com.brsc.dao.NewsDAOI;
import com.brsc.dao.impl.BannerDAOImpl;
import com.brsc.dao.impl.NewsDAOImpl;
import com.brsc.po.NewsPO;
import com.brsc.service.BannerServiceI;
import com.brsc.service.impl.BannerServiceImpl;
import com.brsc.util.DBUtil;

/**
 * @author Administrator
 *
 */
public class DBTest {

	private Connection conn = DBUtil.getConnection();
	
	@Test
	public void testConn(){
		System.out.println(conn);
	}
	@Test
	public void testGetNews(){
		NewsDAOI newsDAO = new NewsDAOImpl();
		List<NewsPO> newsPOs = newsDAO.getObjs();
		System.out.println(newsPOs.get(1));
	}
	@Test
	public void testBannerDAO(){
		BannerDAOI bannerDAO = new BannerDAOImpl();
		System.out.println(bannerDAO.getObjs().size());
	}
	@Test
	public void testBannerService(){
		BannerServiceI bannerService = new BannerServiceImpl();
		System.out.println(bannerService.getListBanner().get(0));
	}
}
