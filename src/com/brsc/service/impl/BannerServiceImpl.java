/**
 * 
 */
package com.brsc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.brsc.bo.BannerBO;
import com.brsc.dao.BannerDAOI;
import com.brsc.dao.impl.BannerDAOImpl;
import com.brsc.po.BannerPO;
import com.brsc.service.BannerServiceI;

/**
 * @author Administrator
 *
 */
public class BannerServiceImpl implements BannerServiceI {
	
	private BannerDAOI bannerDAO;
	
	public BannerServiceImpl() {
		
		this.bannerDAO = new BannerDAOImpl();
	}

	@Override
	public List<BannerBO> getListBanner() {
		List<BannerPO> BannerPOs = bannerDAO.getObjs();
		List<BannerBO> listBannerBOs = new ArrayList<BannerBO>();
		BannerBO listBannerBO = null;
		
		for(BannerPO BannerPO : BannerPOs){
			listBannerBO = new BannerBO();
			
			listBannerBO.setId(BannerPO.getId());
			listBannerBO.setName(BannerPO.getName());
			
			listBannerBOs.add(listBannerBO);
		}
		
		return listBannerBOs;
	}

	@Override
	public BannerBO getBanner(Integer bid) {
		BannerPO bannerPO = bannerDAO.getObjById(bid);
		BannerBO bannerBO = new BannerBO();
		bannerBO.setId(bannerPO.getId());
		bannerBO.setName(bannerPO.getName());
		
		return bannerBO;
	}

}
