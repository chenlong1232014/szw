<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${detailNews.title}</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;
		font-family: "微软雅黑";
	}
	ul{
		list-style: none;
	}
	#detailheader{
		width: 100%;
		height: 50px;
		line-height: 50px;
		font-size: 14px;
		position: fixed;
		background-color: #fff;
		top: 0px;
		z-index: 9999;
		border-bottom: 3px solid #c9231d;
	}
	#detailnav{
		width: 1200px;
		height: 50px;
		margin: 0px auto;
		background:url(images/szw.png) no-repeat 0px 3px;
		/*border: 1px solid blue;*/
	}
	#detailnav>ul{
		float: left;
		width: 700px;
		margin-left: 200px;
	}
	#detailnav>ul>li{
		float: left;
		height: 16px;
		line-height: 16px;
		margin-top: 16px;
		border-left: 1px solid #ddd;
	}
	#detailnav>ul>li>a{
		display: block;
		padding: 0px 15px;
		text-decoration: none;
		color: #242424;
	}
	#detailnav>ul>li>a:hover{
		color:red;
	}
	#main{
		width: 1000px;
		overflow: hidden;
		margin: 0px auto 30px;
	}
	#detail{
		width: 650px;
		min-height: 1723px;
		float: left;
		padding: 20px 35px 20px 20px;
		margin-top: 40px;
		border-right: 1px solid #eee;
	}
	#address{
		height: 30px;
		line-height: 30px;
		font-size: 12px;
		margin: 45px 0px 20px 0px;
		font-family: "SimSun","宋体";
		/*border:1px solid red;*/
	}
	#address>a{
		padding: 0px 10px;
		font-size: 16px;
		color: #c9231d;
		text-decoration: none;
	}
	#detail_title{
		font-size: 26px;
		line-height: 1.6;
		margin: 10px 0px;
		text-align: center;
		/*border: 1px solid red;*/
	}
	#detail_time{
		font-size: 12px;
		text-align: center;
		color: #969696;
		padding: 20px 0 10px 0;
		border-bottom: 1px solid #ddd;
		margin: 0 auto 30px auto;
	}
	#author{
		margin-left: 20px;
		letter-spacing: 6px;
	}
	#detail_image{
		width: 600px;
		height: auto;
		margin: 0 auto 30px auto;
	}
	#detail_content{
		font-size: 16px;
		line-height: 2.0;
		margin: 70px 0 60px;
	}
	#footer{
		width: 100%;
		border-top: 3px solid #c9231d;
		height: 100px;
	}
	#right{
		float: right;
		width: 278px;
		min-height: 1700px;
		margin-top: 60px;
		/*border: 1px solid black;*/
	}
	#top_news,#relate_news{
		padding: 10px 15px 20px 15px;
		background:#fff;
		margin-bottom: 10px;
	}
	#top_title,#relate_title{
		width: 100%;
		height: 40px;
		font-size: 18px!important;
		color: #c9231d;
		line-height: 40px;
		margin-bottom: 15px;
		border-bottom: 1px solid #eee;
	}
	#top_list>ol>ul{
		overflow: hidden;
		background: url(images/ol.png) no-repeat 0px 7px;
	}
	#top_list>ol>ul>li,#relate_list>ul>li{
		padding-left: 30px;
		line-height: 30px;
		background: none;
		height: 30px;
		overflow: hidden;
		white-space: nowrap;
		text-overflow: ellipsis;
	}
	#relate_list>ul>li{
		background: url(images/li.gif) no-repeat left center;
		padding-left: 13px;
	}
	#top_list>ol>ul>li>a,#relate_list>ul>li>a{
		text-decoration: none;
		color: #242424;
	}
	#top_list>ol>ul>li>a:hover,#relate_list>ul>li>a:hover{
		color: red;
	}
</style>
  </head>
  
  <body>
	<div id="detailheader">
		<div id="detailnav">
			<ul>
				<li><a href="index.jsp">首页</a></li>
				<li><a href="news?opt=get&bid=8">本部概况</a></li>
				<li><a href="news?opt=get&bid=1">部门动态</a></li>
				<li><a href="news?opt=get&bid=9">通知公告</a></li>
				<li><a href="news?opt=get&bid=10">课程建设</a></li>
				<li><a href="news?opt=get&bid=11">教研科研</a></li>
				<li><a href="#">教育专题</a></li>
			</ul>
		</div>
	</div>
	<div id="container">
		<div id="main">
			<div id="detail">
				<div id="address">
					<a href="index.jsp">首页</a>>
					<a href="news?opt=get&bid=${detailNews.bid }">${detailNews.banner }</a>
				</div>
				<div id="detail_title">${detailNews.title }</div>
				<div id="detail_time">
					<span id="time">${detailNews.issuedDate }</span>
					<span id="author">作者:${detailNews.author }</span>
				</div>
				<div id="detail_image">
					<img src="${detailNews.picUrl }" alt="" width="100%">
				</div>
				<div id="detail_content">${detailNews.content }</div>
			</div>
			<div id="right">
				<div id="top_news">
					<div id="top_title">点击排行</div>
					<div id="top_list"> 
						<ol>
							<ul>
								<c:forEach var="news" items="${topNewsList }">
									<li><a href="news?opt=gets&id=${news.id }">${news.title }</a></li>
								</c:forEach>
							</ul>
						</ol> 
					</div>
				</div>
				<div id="relate_news">
					<div id="relate_title">相关新闻</div>
					<div id="relate_list">
						<ul>
							<c:forEach var="news" items="${relateNewsBOs }">
								<li><a href="news?opt=gets&id=${news.id }">${news.title }</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>

	</div>
	<div id="footer"></div>
  </body>
</html>
