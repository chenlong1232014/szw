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
    
    <title>思政网-${bannerBO.name }</title>
    
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
		padding: 0px;
		margin: 0px;
		font-family: "微软雅黑";
	}
	ul{
		list-style: none;
	}
	#header{
		width: 100%;
		height: auto;
		background: url(images/header.png) repeat-x;
		padding-top: 15px;
		border-bottom: 3px solid #c9231d;
	}
	#nav{
		width: 1000px;
		height: 100px;
		margin: 0px auto;
		clear: both;
	}
	#nav_left{
		width: 165px;
		height: 70px;
		margin: 15px 0 0 15px;
		float: left;
		background: url(images/szw.png) no-repeat;
	}
	#nav_right{
		width: 810px;
		height: 86px;
		margin-top: 0px;
		line-height: 20px;
	}
	#nav_list{
		height: 16px;
		font-size: 12px;
		margin: 15px 0;
		line-height: 16px;
	}
	#nav_list>ul>li{
		float: left;
		height: 16px;
		padding: 0 20px;
		border-left: 1px solid #ddd;
	}
	#nav_list>ul>li>a{
		text-decoration: none;
		color: #242424;
	}
	#nav_list>ul>li>a:hover{
		color: red;
	}
	#banner_title{
		height: 40px;
		width: 200px;
		margin-left: 180px;
		background: #c9231d;
		background-size: cover;
		color: white;
	}
	#banner_title>span{
		display: inline-block;
		line-height: 40px;
		font-weight: bold;
		width: 200px;
		font-size: 30px;
		letter-spacing: 5px;
		font-family: "宋体";
		text-align: center;
	}
	#main{
		width: 1000px;
		overflow: hidden;
		margin: 0 auto 30px;
	}
	#content_left{
		min-height: 1485px;
		width: 578px;
		border: 1px solid #eee;
		padding: 10px 20px;
		margin-bottom: 30px;
		float: left;
	}
	#list>ul>li{
		background: url(images/hx.gif) repeat-x left bottom;
		margin-bottom: 15px;
		clear: both;
		padding-bottom: 10px;
	}
	#list>ul>li>.title{
		line-height: 30px;
		font-size: 21px;
		margin-bottom: 15px;
		padding: 0;
		background: none;
	}
	.title>a{
		text-decoration: none;
		color: #242424;
	}
	.title>a:hover{
		color: red;
	}
	.content{
		line-height: 24px;
		font-size: 14px;
		color: #767676;
		overflow:hidden; 
		text-overflow:ellipsis;
		display:-webkit-box; 
		-webkit-box-orient:vertical;
		-webkit-line-clamp:2; 
	}
	#list>ul>li>a{
		display: block;
		margin-top: 5px;
		text-decoration: none;
		font-size: 14px;
		color: #c9231d;
		margin-left: 510px;
		margin-top: 10px;
	}
	#content_right{
		float: right;
		width: 375px;
		min-height: 1700px;
		margin-top: 40px;
		/*border: 1px solid black;*/
	}
	#top_news{
		padding: 10px 15px 20px 15px;
		background:#fff;
		margin-bottom: 10px;
	}
	#top_title{
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
	#top_list>ol>ul>li{
		padding-left: 30px;
		line-height: 30px;
		background: none;
		height: 30px;
		overflow: hidden;
		white-space: nowrap;
		text-overflow: ellipsis;
	}
	#top_list>ol>ul>li>a{
		text-decoration: none;
		color: #242424;
	}
	#top_list>ol>ul>li>a:hover{
		color: red;
	}
	#time{
		background: url(images/time.gif) no-repeat left center;
		float: left;
		font-size: 10px;
		color: #a6a6a6;
		padding-left: 20px;
		margin-top: 10px;
	}	
	#footer{
		width: 100%;
		border-top: 3px solid #c9231d;
		height: 100px;
	}
</style>
  </head>
  
  <body>
	<div id="header">
		<div id="nav">
			<div id="nav_left"></div>
			<div id="nav_right">
				<div id="nav_list">
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
				<div id="banner_title"><span>${bannerBO.name }</span></div>
			</div>
		</div>
	</div>
	<div id="container">
		<div id="main">
			<div id="content_left">
				<div id="list">
					<ul>
						<c:forEach var="news" items="${listBannerNews }">
							<li>
								<div class="title"><a href="news?opt=gets&id=${news.id }">${news.title }</a></div>
								<div class="content">${news.content }</div>
	  							<div id="time">${news.displayDate }</div>
	  							<a href="news?opt=gets&id=${news.id }">【全文】</a>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div id="content_right">
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
			</div>
		</div>
	</div>
	<div id="footer">
	</div>
  </body>
</html>
