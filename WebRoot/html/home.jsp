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
    
    <title>首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/common.js"></script>
	<link rel="stylesheet" type="text/css" href="css/pgwslideshow.css">
	<style type="text/css">

	/*导航栏*/
		body,div{
			margin: 0px;
			padding: 0px;
			font-family: "微软雅黑";
		}
		.header{
			width: 100%;
			height: 150px;
		}
		.header>img{
			width: 100%;
			height: 100%;
		}


		#nav{
			width: 980px;
			height: 30px;
			position: absolute;
			left: 50%;
			margin-left: -480px;
			margin-top: -43px;
		}
		
		#nav>ul{
			margin: 0px;
			padding: 0px;
			list-style: none;
		}
		#nav>ul>li{
			width: 90px;
			height: 40px;
			line-height: 40px;
			float: left;
			color: white;
			text-align: center;
			cursor: pointer;
			background: #AF0002;
			margin-left: 2px;
			border-radius: 5px;
		}
		#nav>ul>li:hover{
			background: #340101;
		}
		#nav>ul>li>a{
			text-decoration: none;
			color: white;
		}
		#search{
			position: absolute;
			right: 0px;
			top: 10px;
		}
		#container{
			width: 1000px;
			height: 1100px;
			position: absolute;
			left: 50%;
			margin-left: -500px;
			margin-top: 5px;
			border-left: 1px solid #eee;
			border-right: 1px solid #eee;
			min-height: 1000px;
			display: block;
		}

		#main{
			width: 100%;
			height: 340px;
			position: relative;
		}


		/*部门动态*/
		#department{
			width: 400px;
			height: 420px;
			position: absolute;
			left: 600px;
			top: 20px;
		}
		#bar{
			width: 400px;
			height: 55px;
			background: url(images/素材1.png) no-repeat left;
			border-bottom: 1px solid #ddd;
		}

		#list>ul>li{
			line-height:30px;
			width:270px;		
			white-space: nowrap;
			background: url(images/素材12.png) no-repeat left;
			text-overflow: ellipsis;
			overflow: hidden;
			text-decoration: none;	
						
			margin: 5px;
			padding-left: 20px;

		}


		#list>ul>li>a{
			 text-decoration: none;
			 color: black;
			 font-size: 15px;
		}

		#list>ul>li>a:hover{
			 text-decoration:underline;
			 color: red;
		}

		#more{
			position: absolute;
			right: 0px;
			top: 35px;
			font-size: 13px;	
		}

		#more>a{
			cursor: pointer;
			text-decoration: none;
		}

		#more>a:hover{
			text-decoration:underline;
			color:red;
		}

		/*<!-- 教师风采，社会实践 -->*/

	
		#middleblock{
			margin-top: 100px;
			
		}
		
		.teacher{
			width: 360px;
			height: 255px;
			/*border: 1px solid black;*/
			position: relative;
		}
		#teacher_title{
			width: 360px;
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
			border-top: 1px solid #ddd; 
			width: 360px;
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
			text-indent: 2em;
		}
		#teacher_description>p{
			text-overflow: hidden;
			line-height: 15px;
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
			border-bottom: 1px solid #ddd;
		}
		#content1{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			left: 35px;
			top: 60px;
		}
		#content2{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			right: 0px;
			top: 60px;
		}
		#content3{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			left: 35px;
			top: 235px;
		}
		#content4{
			/*border: 1px solid black;*/
			width: 370px;
			height: 170px;
			position: absolute;
			right: 0px;
			top: 235px;
		}
		.news_pic{
			position: absolute;
			right: 0px;
			bottom: 0px;
		}
		.content{
			position: realtive;
		}
		.content>ul{
			list-style: none;
			margin: 0px;
			padding: 0px;
			padding-top: 10px;
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
			line-height: 27px;
			background: url(images/素材12.png) no-repeat left;
			width: 245px;
			white-space: nowrap;
			text-overflow:ellipsis;
			overflow: hidden;
			padding-left: 20px;
		}
		.content>ul>li>a{
			text-decoration: none;
			color: black;
			font-size: 11px;
		}
		.content>ul>li>a:hover{
			text-decoration:underline;
			color: red;
		}



		#middleblock{
			width: 1000px;
			height: 255px;
			position: relative;
			/*border: 1px solid red;*/
		}
		
		#social{
			display: inline-block;
			width: 600px;
			height: 255px;
			position: absolute;
			left: 380px;
			top: 0px;

		}
		#social_title{
			width: 100%;
			height: 55px;
			background: url(images/素材3.png) left center no-repeat;
			border-bottom: 1px solid #ddd;
		}
		#social_header>a{
			display: inline-block;
			font-size: 13px;
			color: black;
			text-decoration: none;
			position: absolute;
			right: 0px;
			top: 35px;

		}
		#social_header>a:hover{
			text-decoration:underline;
			color: red;		
		}
		#social_content{
			width: 600px;
			height: 200px;
			/*border:1px solid black;*/
		}
		#social_content>ul{
			/*border: 1px solid red;*/
			list-style: none;
		}
		#social_content>ul>li{
			width: 180px;
			height: 170px;
			float: left;
			margin-left: 5px;
			overflow: hidden;
		}
		#social_content>ul>li>a>img{
			width: 100%;
			height: 100%;
		}
	

		/*页脚footer*/
		#footer{
			display: inline-block;
			width: 100%;
			height: 100px;
			background-color:#D31111;
			margin-top: 1110px;
			color: white;
			font-size: 13px;
			letter-spacing: 3px;
		}

		#first{
			position: absolute;
			left: 25%;
			text-align: left;
			margin-top:10px;
		}

		#second{
			position: absolute;
			left: 25%;
			text-align: left;
			margin-top:40px;
		}

		#third{
			position: absolute;
			left: 25%;
			text-align: left;
			margin-top:70px;
		}
	
	</style>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/pgwslideshow.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
		    $('.pgwSlideshow').pgwSlideshow({
		    	transitionEffect:'fading',
		    	autoSlide:true
		    });
		});
	</script>
  </head>
<!-- 头部 -->
<body>
<!-- 标题栏 -->
	<div class="header">
		<img src="images/素材10.png">
<!-- 导航栏 -->
		
		<div id="nav">
			<ul>
				<li><a href="index.jsp">首页</a></li>
				<li><a href="news?opt=get&bid=8">本部概况</a></li>
				<li><a href="news?opt=get&bid=1">部门动态</a></li>
				<li><a href="news?opt=get&bid=9">通知公告</a></li>
				<li><a href="news?opt=get&bid=10">课程建设</a></li>
				<li><a href="news?opt=get&bid=11">教研科研</a></li>
				<li><a href="#">教育专题</a></li>
			</ul>
			<span id="search">
					<form action="" method="post">
        				<input type="text" class="search_key" value="站内搜索" />
        				<input type="submit" class="submit" value="搜索"/>
					</form>
			</span>
		</div>
	</div>

			

	</div>


	
<!-- 中间部分 -->
	<div id="container">

	<!-- 图片新闻，部门动态 -->
		<div id="main">
		<!-- 图片新闻 -->
			<div class="jq22-container">
				<div class="jq22-content bgcolor-3">
					<ul class="pgwSlideshow">
						<c:forEach var="news" items="${generalNews }">
					    	<li><a  href="news?opt=gets&id=${news.id }"><img src="${news.bigPicUrl }" data-description="${news.title }"></a></li>
					    </c:forEach>	
					</ul>	
				</div>		
			</div>
		<!-- 部门动态 -->
			<div id="department">
				<div id="bar">
					<span id="more"><a href="news?opt=get&bid=1">更多...</a></span>
				</div>

				<div id="list">
					<ul>
						<c:forEach var="depNews" items="${depListNews}">
							<li><a href="news?opt=gets&id=${depNews.id}">${depNews.title}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
<!-- 教师风采，社会实践 -->
		<div id="middleblock">
			<div class="teacher">
				<div id="teacher_header">
					<div id="teacher_title"></div>
					<a id="teacher_more" href="news?opt=get&bid=2">更多...</a>
				</div>
				<div id="teacher_content">
					<div id="teacher_pic">
						<a href="news?opt=gets&id=${teacherNews.id }"><img src="${teacherNews.picUrl}" alt="" style="width: 100%;height: 100%;"></a>
					</div>
					<div id="teacher_description">
						<p>${teacherNews.content}</p>
					</div>
				</div>
			</div>
			<!-- 社会实践 -->
			<div id="social">
				<div id="social_header">
					<div id="social_title"></div>
					<a id="social_more" href="news?opt=get&bid=3">更多...</a>
				</div>
				<div id="social_content">
					<ul>
						<c:forEach var="socialPractice" items="${socialPracticeNews}">
							<li><a href="news?opt=gets&id=${socialPractice.id }"><img src="${socialPractice.bigPicUrl}"  alt=""><img></a></li>
						</c:forEach>
					</ul>
				</div>

			</div>

		</div>

	<!-- 教育专题 -->

		<div id="education">
			<div id="edu_title"></div>
			<div id="edu_news">
				<div id="content1">
					<div class="content">
						<ul>
						<c:forEach var="news" items="${politicalNews}">
							<li><a href="news?opt=gets&id=${news.id}">${news.title}</a></li>
						</c:forEach>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材6.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content2">
					<div class="content">
						<ul>
						<c:forEach var="news" items="${socialPrecspectiveNews}">
							<li><a href="news?opt=gets&id=${news.id}">${news.title}</a></li>
						</c:forEach>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材15.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content3">
					<div class="content">
						<ul>
						<c:forEach var="news" items="${legalNews}">
							<li><a href="news?opt=gets&id=${news.id}">${news.title}</a></li>
						</c:forEach>
						</ul>
					</div>
					<div class="news_pic">
						<img src="images/素材13.png" alt="" style="width: 100%;height: 100%;">
					</div>
				</div>
				<div id="content4">
					<div class="content">
						<ul>
						<c:forEach var="news" items="${eduNews}">
							<li><a href="news?opt=gets&id=${news.id}">${news.title}</a></li>
						</c:forEach>
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
	<div id="footer">
		<div id="foot_content">
			<div id="first">教育学院版权所有 Icp备案： 闽Icp备125678987654号</div>
			<div id="second">学院地址：福建师范大学人文楼群</div>
			<div id="third">邮编：350000    电话：0591-1234567  传真：0591-1234567【管理中心】</div>
		</div>
	</div> 

</body>
</html>
