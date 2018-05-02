/**
 * 
 */
package com.brsc.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import redis.clients.jedis.Jedis;

import com.brsc.bo.DetailNewsBO;
import com.brsc.bo.ListBannerNewsBO;
import com.brsc.bo.ListNewsBO;
import com.brsc.bo.PicNewsBO;
import com.brsc.bo.TeacherNewsBO;
import com.brsc.bo.TopNewsBO;
import com.brsc.dao.BannerDAOI;
import com.brsc.dao.NewsDAOI;
import com.brsc.dao.impl.BannerDAOImpl;
import com.brsc.dao.impl.NewsDAOImpl;
import com.brsc.po.BannerPO;
import com.brsc.po.NewsPO;
import com.brsc.service.NewsServiceI;
import com.brsc.util.BannerType;

/**
 * @author Administrator
 *
 */
public class NewsServiceImpl implements NewsServiceI {

	private NewsDAOI newsDAO = null;
	private BannerDAOI bannerDAO = null;
	Jedis js = null;
	private Integer max = 5;//限制量
	public NewsServiceImpl() {
		js = new Jedis("localhost",6379);
		this.newsDAO = new NewsDAOImpl();
		this.bannerDAO = new BannerDAOImpl();
	}

	@Override
	public List<ListNewsBO> getListNews(Integer bid) {
		
		List<NewsPO> newsPOs = newsDAO.getNewsByBannerId(bid);
		List<ListNewsBO> listNewsBOs = new ArrayList<ListNewsBO>();
		ListNewsBO listNewsBO = null;
		
		for(NewsPO newsPO : newsPOs){
			listNewsBO = new ListNewsBO();
			
			listNewsBO.setId(newsPO.getId());
			listNewsBO.setTitle(newsPO.getTitle());
			
			listNewsBOs.add(listNewsBO);
		}
		
		return listNewsBOs;
	}

	@Override
	public DetailNewsBO getDetailNewsById(Integer id) {
		NewsPO newsPO = newsDAO.getObjById(id);
		BannerPO bannerPO = bannerDAO.getObjById(newsPO.getBanner_id());
		DetailNewsBO detailNewsBO = new DetailNewsBO();
		
		detailNewsBO.setTitle(newsPO.getTitle());
		detailNewsBO.setContent(newsPO.getContent());
		detailNewsBO.setIssuedDate(newsPO.getDisplayDate());
		detailNewsBO.setAuthor(newsPO.getAuthor());
		detailNewsBO.setClickNum(newsPO.getClickNum());
		detailNewsBO.setPicUrl(newsPO.getBigPicUrl());
		detailNewsBO.setBanner(bannerPO.getName());
		detailNewsBO.setBid(newsPO.getBanner_id());
			
		return detailNewsBO;
	}

	@Override
	public List<PicNewsBO> getPicNews(Integer bid) {
		List<NewsPO> newsPOs = newsDAO.getNewsByBannerId(bid);
		List<PicNewsBO> picNewsBOs = new ArrayList<PicNewsBO>();
		PicNewsBO picNewsBO = null;
		
		for(NewsPO newsPO : newsPOs){
			picNewsBO = new PicNewsBO();
			
			picNewsBO.setId(newsPO.getId());
			picNewsBO.setTitle(newsPO.getTitle());
			picNewsBO.setBigPicUrl(newsPO.getBigPicUrl());
			
			picNewsBOs.add(picNewsBO);
		}
		
		return picNewsBOs;
	}

	@Override
	public TeacherNewsBO getTeacherNews() {

		List<NewsPO> newsPOs = newsDAO.getNewsByBannerId(BannerType.TEACHER_STYLE);
		NewsPO newsPO = newsPOs.get(0);
		TeacherNewsBO teacherNews = new TeacherNewsBO();
		teacherNews.setId(newsPO.getId());
		teacherNews.setPicUrl(newsPO.getSmallPicUrl());
		teacherNews.setContent(newsPO.getContent());
		return teacherNews;
	}

	@Override
	public List<ListBannerNewsBO> getBannerNews(Integer bid) {

		List<NewsPO> newsPOs = newsDAO.getNewsByBannerId(bid);
		List<ListBannerNewsBO> listBannerNewsBOs = new ArrayList<ListBannerNewsBO>();
		ListBannerNewsBO listBannerNewsBO = null;
		
		for(NewsPO newsPO : newsPOs){
			listBannerNewsBO = new ListBannerNewsBO();
			
			listBannerNewsBO.setId(newsPO.getId());
			listBannerNewsBO.setTitle(newsPO.getTitle());
			listBannerNewsBO.setContent(newsPO.getContent());
			listBannerNewsBO.setDisplayDate(newsPO.getDisplayDate());
			
			listBannerNewsBOs.add(listBannerNewsBO);
		}
		
		
		return listBannerNewsBOs;
	}

	@Override
	public Set<TopNewsBO> getTopNews() {
		List<NewsPO> newsPOs = newsDAO.getObjs();
		Set<TopNewsBO> topNewsBOs = new TreeSet<TopNewsBO>();
		TopNewsBO topNewsBO = null;
		for(NewsPO newsPO : newsPOs){
			topNewsBO = new TopNewsBO();
			topNewsBO.setId(newsPO.getId());
			topNewsBO.setTitle(newsPO.getTitle());
			topNewsBO.setClickNum(newsPO.getClickNum());
			
			topNewsBOs.add(topNewsBO);
		}
		return topNewsBOs;
	}

	@Override
	public List<ListNewsBO> getRelateNews(Integer bid, Integer id) {
		List<ListNewsBO> listNewsBOs = getListNews(bid);
		for(ListNewsBO newsBO : listNewsBOs){
			if(newsBO.getId()==id){
				listNewsBOs.remove(newsBO);
				break;
			}
		}
		return listNewsBOs;
	}

	@Override
	public void uptNewsClickRate(Integer id) {
		
		NewsPO news = newsDAO.getObjById(id);
		
		if(js.exists("news"+id)){
			//存在key 取出刷新次数判断是否达到最大值
			String value = js.get("news"+id);
			int oldCount = Integer.parseInt(value.split(",")[0]);//起始点击量
			//System.out.println(oldCount);
			int refCount = Integer.parseInt(value.split(",")[1]);//刷新次数
			refCount++;
			//System.out.println(refCount);
			if(refCount>=max)//超过最大刷新次数
			{
				news.setClickNum(oldCount+refCount);
				newsDAO.uptObj(news);
				js.set("news"+id, String.valueOf(oldCount+refCount)+","+"0");//清零
			}
			else{
				js.set("news"+id, String.valueOf(oldCount)+","+refCount);//累加
			}
		}
		else{
			//不存在key
			int oldCount = news.getClickNum();
			
			js.set("news"+id, String.valueOf(oldCount)+","+"1");//初始化			
			
		}
	}
	

}
