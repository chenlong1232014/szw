<%@ page language="java"  import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
		<style type="text/css">
		body,div,*{
			margin: 0px;
			padding: 0px;
			font-family: "微软雅黑";
		}
		#header{
			width: 500px;
			height: 200px;
			border:2px solid black;
			background: black;
		}

		#top{
			
		}

		.teacher{
			width: 340px;
			height: 255px;
			/*border: 1px solid black;*/
			position: relative;
		}
		#teacher_title{
			width: 300px;
			height: 55px;
			background: url(images/素材2.png) left center no-repeat;
		}
		#teacher_more{
			text-decoration: none;
			color: black;
			display: inline-block;
			position: absolute;
			right: 0px;
			top: 35px;
			font-size: 13px;
		}
		#teacher_content{
			border-top: 2px solid black; 
			width: 340px;
			height: 200px;
			background: url(images/teacher_bg.png) left top no-repeat;
			background-size: contain;
		}
		#teacher_pic{
			height: 155px;
			width: 115px;
			/*border: 1px solid red;*/
			margin: 18px 15px;
		}
		#teacher_description{
			height: 135px;
			width: 175px;
			/*border: 1px solid red;*/
			overflow: hidden;
			position: absolute;
			right: 25px;
			top: 75px;
			font-size: 13px;
			font-weight: bold;
			text-shadow: 1px 1px #FFF;
		}

		#education{
			width: 780px;
			height: 400px;
			/*border:1px solid red;*/
			position: absolute;
		}
		#edu_title{
			width: 780px;
			height: 55px;
			background: url(images/素材4.png) left center no-repeat;
			border-bottom: 2px solid black;
		}
		#content1{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			left: 35px;
			top: 55px;
		}
		#content2{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			right: 0px;
			top: 55px;
		}
		#content3{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			left: 35px;
			top: 230px;
		}
		#content4{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			right: 0px;
			top: 230px;
		}
		.news_pic{
			position: absolute;
			right: 0px;
			bottom: 0px;
		}
		.content{
			position: relative;
		}
		.content>ul{
			list-style: none;
			position: absolute;
			z-index: 2;	
		}
		.news_pic{
			position: absolute;
			width: 370px;
			height: 170px;
			z-index: 1;
			right: 0px;
			bottom: 0px;
		}
		.content>ul>li{
			line-height: 30px;
			background: url(images/素材120	.png) no-repeat left;
			padding-left: 30px;
		}
		.content>ul>li>a{
			text-decoration: none;
			color: black;
			font-size: 13px;
		}
	</style>
  </head>
  
  <body>
<!-- 标题栏 -->
	<div class="header">
		<div class="top">
				<div class="title">大学生思想政治教育网</div>
				<div class="developer">马克思学院思政教研部</div>
		</div>
<!-- 导航栏 -->
		<div id="nav_wrapper">
			<div class="nav"></div>

			<div class="search"></div>


		</div>
	</div>



<!-- 中间部分 -->
	<div class="container">

	<!-- 图片新闻，部门动态 -->
		<div class="main">
			<div class="picturesnews"></div>
			<div class="department"></div>
		</div>
<!-- 教师风采，社会实践 -->
		<div id="middleblock">
			<div class="teacher">
				<div id="teacher_header">
					<div id="teacher_title"></div>
					<a id="teacher_more" href="#">更多...</a>
				</div>
				<div id="teacher_content">
					<div id="teacher_pic">
						<img src="<%=news.getBigPicUrl() %>" alt="" style="width: 100%;height: 100%;">
					</div>
					<div id="teacher_description" style="text-indent: 2em;">
						<p style="line-height: 15px;text-overflow: hidden;"><%=news.getContent() %></p>
					</div>
				</div>
			</div>
			<div class="social"></div>

		</div>

	<!-- 教育专题 -->

		<div id="education">
			<div id="edu_title"></div>
			<div id="edu_news">
				<div id="content1">
					<div class="content">
						<ul>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材6.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content2">
					<div class="content">
						<ul>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材7.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content3">
					<div class="content">
						<ul>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材13.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content4">
					<div class="content">
						<ul>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材8.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>

			</div>
		</div>
	</div>


<!-- 页脚,版权信息等 -->
	<div id="footer"></div>
  </body>
</html>
