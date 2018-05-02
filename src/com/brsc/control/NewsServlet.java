package com.brsc.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brsc.bo.BannerBO;
import com.brsc.bo.DetailNewsBO;
import com.brsc.bo.ListBannerNewsBO;
import com.brsc.bo.ListNewsBO;
import com.brsc.bo.PicNewsBO;
import com.brsc.bo.TeacherNewsBO;
import com.brsc.bo.TopNewsBO;
import com.brsc.service.BannerServiceI;
import com.brsc.service.NewsServiceI;
import com.brsc.service.impl.BannerServiceImpl;
import com.brsc.service.impl.NewsServiceImpl;
import com.brsc.util.BannerType;

public class NewsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String page = "";//跳转页面地址
		String opt = request.getParameter("opt");
		opt = (opt==null)?"gets":opt;
		
		NewsServiceI newsService = new NewsServiceImpl();
		BannerServiceI bannerService = new BannerServiceImpl();
		
		if("add".equals(opt)){
			//处理增加
		}
		else if("del".equals(opt)){
			//处理删除
		}
		else if("upt".equals(opt)){
			//处理更新
		}
		else if("get".equals(opt)){
			//处理查询栏目全部新闻
			int bid = Integer.parseInt(request.getParameter("bid"));
			
			List<ListBannerNewsBO> listBannerNews = newsService.getBannerNews(bid);
			
			BannerBO bannerBO = bannerService.getBanner(bid);
			
			List<TopNewsBO> topNewsList = new ArrayList<TopNewsBO>(newsService.getTopNews());
			while(topNewsList.size()>10){
				topNewsList.remove(topNewsList.size()-1);
			}

			request.setAttribute("listBannerNews", listBannerNews);
			request.setAttribute("bannerBO", bannerBO);
			request.setAttribute("topNewsList", topNewsList);
			
			page = "html/bannerNews.jsp";
		}
		else if("gets".equals(opt)){
			//处理查询一个
			int id = Integer.parseInt(request.getParameter("id"));
			DetailNewsBO detailNews = newsService.getDetailNewsById(id);
			request.setAttribute("detailNews", detailNews);
			
			List<TopNewsBO> topNewsList = new ArrayList<TopNewsBO>(newsService.getTopNews());
			while(topNewsList.size()>10){
				topNewsList.remove(topNewsList.size()-1);
			}
			
			List<ListNewsBO> relateNewsBOs = newsService.getRelateNews(detailNews.getBid(), id);
			while(relateNewsBOs.size()>6){
				relateNewsBOs.remove(relateNewsBOs.size()-1);
			}
			
			request.setAttribute("topNewsList", topNewsList);
			
			request.setAttribute("relateNewsBOs", relateNewsBOs);
			
			//更新点击量
			newsService.uptNewsClickRate(id);
			
			page = "html/detailNews.jsp";
		}
		else if("loadAll".equals(opt)){
			//加载首页数据
			//本部概况(图片新闻)
			List<PicNewsBO> generalNews = newsService.getPicNews(BannerType.DEPT);
			while(generalNews.size()>4){
				generalNews.remove(generalNews.size()-1);
			}
			request.setAttribute("generalNews", generalNews);
			//部门动态(列表新闻)
			List<ListNewsBO> depListNews = newsService.getListNews(BannerType.DEPT);
			while(depListNews.size()>9){
				depListNews.remove(depListNews.size()-1);
			}
			request.setAttribute("depListNews", depListNews);
			//教师风采(图片新闻)
			TeacherNewsBO teacherNews = newsService.getTeacherNews();
			request.setAttribute("teacherNews", teacherNews);
			//社会实践
			List<PicNewsBO> socialPracticeNews = newsService.getPicNews(BannerType.SOCIAL_PRACTICE);
			while(socialPracticeNews.size()>3){
				socialPracticeNews.remove(socialPracticeNews.size()-1);
			}
			request.setAttribute("socialPracticeNews",socialPracticeNews);
			//时政要闻
			List<ListNewsBO> politicalNews = newsService.getListNews(BannerType.POLITIC);
			while(politicalNews.size()>4){
				politicalNews.remove(politicalNews.size()-1);
			}
			request.setAttribute("politicalNews", politicalNews);
			//社会观点
			List<ListNewsBO> socialPrecspectiveNews = newsService.getListNews(BannerType.SOCIAL_PRECSPECTIVE);
			while(socialPrecspectiveNews.size()>4){
				socialPrecspectiveNews.remove(socialPrecspectiveNews.size()-1);
			}
			request.setAttribute("socialPrecspectiveNews", socialPrecspectiveNews);	
			//法制园地
			List<ListNewsBO> legalNews = newsService.getListNews(BannerType.LEGALITY);
			while(legalNews.size()>4){
				legalNews.remove(legalNews.size()-1);
			}
			request.setAttribute("legalNews", legalNews);
			//思想政治
			List<ListNewsBO> eduNews = newsService.getListNews(BannerType.EDU_THINKING);
			while(eduNews.size()>4){
				eduNews.remove(eduNews.size()-1);
			}
			request.setAttribute("eduNews", eduNews);	
			
			page = "html/home.jsp";
		
		}
		
		request.getRequestDispatcher(page).forward(request, response);
		

	}

}
