<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="sb-init sb-active"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>一品车购车列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
   	<link rel="stylesheet" type="text/css" href="../css/common/public.css">
    <link rel="stylesheet" type="text/css" href="../css/module/fenlei.css">
    <link rel="stylesheet" type="text/css" href="../css/module/header.css">
    <link rel="stylesheet" type="text/css" href="../css/module/carlist.css">
    <link rel="stylesheet" type="text/css" href="../css/module/footer.css">
    <!-- jQuery -->
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.tmpl.js"></script>
    
      <script id="myTemplate" type="text/x-jquery-tmpl">
        <li class="list">
 			<div class="top_img">
 				<div class="left_img"><img src="\${imageLeft}"></div>
 				<div class="right_img"><img src="\${imageRightTop}"><img src="\${imageRightBottom}"></div>
 				<span class="opa"><i>\${baseMarketTime}款 \${baseLine} \${baseModel}</i></span>
 			</div>
 			<div class="bottom_info">
 				<div class="left_info"><span>\${sellerName}|\${place}|\${sellerHomeAddress}</span></div>
 				<div class="right_info"><span>￥<i>\${price}万</i></span></div>
 				<div class="center_info">
 					<span class="time"><i class="tit">上牌时间</i><i class="val">\${registerTime}</i></span>
 					<span class="road"><i class="tit">表显里程</i><i class="val">\${mileage}</i></span>
 					<span class="box"><i class="tit">变速箱</i><i class="val">\${gearbox}</i></span>
 				</div>
 			</div>
 		</li>
    </script>
</head>
<body>
    <!--header模块-->
    <div id="header">
        <div class="container first">
            <div class="header_conten">
                <div id="spriteLogo">
                    <a href="#ypc.html">
                        <img src="../images/common/logo.png" width="auto" height="58" alt="Beepi">
                    </a>
                </div>
                <div style="width: 768px; float: left; margin-top: 45px; margin-left: 680px;">
                    <table class="tblHeader">
                        <tbody><tr style="vertical-align: middle;">
                            <td style="cursor: pointer;" onclick="window.location = &#39;/BackseatDriver&#39;;"><img src="../images/_temp/ico_blog_small.png"></td>
                            <td style="cursor: pointer;" onclick="window.location = &#39;/BackseatDriver&#39;;"><span class="headerTxt16">首页</span></td>
                            <td style="width: 10px; text-align: center;"><img src="../images/_temp/buttons_border_allGray.gif" width="1" height="20" alt="divider" style="margin-top: 3px;"></td>
                            <td style="cursor: pointer;" onclick="window.location = &#39;/TopFiveQuestions&#39;;"><img src="../images/_temp/ico_5_small.png"></td>
                            <td style="cursor: pointer;" onclick="window.location = &#39;/TopFiveQuestions&#39;;"><span class="headerTxt16">问题解答</span></td>
                            <td style="width: 10px; text-align: center;"><img src="../images/_temp/buttons_border_allGray.gif" width="1" height="20" alt="divider" style="margin-top: 3px;"></td>
                            <td style="cursor: pointer;" onclick="window.location = &#39;/BeepiCertified&#39;;"><img src="../images/_temp/ico_certified_small.png"></td>
                            <td style="cursor: pointer;" onclick="window.location = &#39;/BeepiCertified&#39;;"><span class="headerTxt16">售后服务</span></td>
                            <td style="width: 10px; text-align: center;"><img src="../images/_temp/buttons_border_allGray.gif" width="1" height="20" alt="divider" style="margin-top: 3px;"></td>
                            <td style="cursor: pointer; font-weight: 500;" class="verde" onclick="window.location = &#39;/Sell&#39;;">售车</td>
                            <td style="width: 10px; text-align: center;"><img src="../images/_temp/buttons_border_allGray.gif" width="1" height="20" alt="divider" style="margin-top: 3px;"></td>
                            <td style="cursor: pointer; font-weight: 500;" class="beepiColor" onclick="window.location = &#39;/Buy&#39;;">购车</td>
                        </tr>
                    </tbody></table>
                </div>
            </div>
        </div>
    </div>
    <!--/header模块-->
  	<!--分类筛选模块-->
   <div class="car-screening">
  <div class="car-screening-cont">    
   <div class="cs-nav" style="padding-bottom:5px;">
      <div class="cs-nav-tit">品牌</div>
                  <div id="brandList" class="cs-list">
      <ul>
        <li>
        <a  class=" sc-cs sc-cs1" href="javascript:void(0)" data-val="">不限</a>
        </li>
                <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="大众">大众</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="宝马">宝马</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="丰田">丰田</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="日产">日产</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="现代">现代</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="别克">别克</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="奔驰">奔驰</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="A&奥迪">奥迪</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="本田">本田</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="福特">福特</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="马自达">马自达</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="标致">标致</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="雪佛兰">雪佛兰</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="起亚">起亚</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="雪铁龙">雪铁龙</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="斯柯达">斯柯达</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="三菱">三菱</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="MINI">MINI</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="比亚迪">比亚迪</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="海马">海马</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="中华">中华</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="保时捷">保时捷</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="铃木">铃木</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="奇瑞">奇瑞</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="雷克萨斯">雷克萨斯</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="长安轿车">长安轿车</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="东南">东南</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="Jeep">Jeep</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="路虎">路虎</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="斯巴鲁">斯巴鲁</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="MG">MG</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="长城">长城</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="GMC">GMC</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="道奇">道奇</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="宝马">奔腾</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="雷诺">雷诺</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="吉利">吉利</a>
        </li>
                         <li>
        <a class="sc-cs" href="#262&amp;bn=smart" data-val="smart">smart</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="沃尔沃">沃尔沃</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="菲亚特">菲亚特</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="克莱斯勒">克莱斯勒</a>
        </li>
                         <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="荣威">荣威</a>
        </li>
                         </ul>
                <div id="showMore"><a href="javascript:void(0)"><span class="YPC_ico YPC_ico_downarr2">更多</span></a></div>
              </div>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
    <div class="cs-nav" style="height:28px;">
    <div class="cs-nav-tit">价格</div>
    <div class="cs-list" id="priceList">
                        <ul>
            <li>
            <a class="sc-cs sc-cs1" href="javascript:void(0)">不限</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="0" data-ph="3">3万以下</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="3" data-ph="5">3-5万</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="5" data-ph="8">5-8万</a>
            </li>
            <li>
            </li><li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="8" data-ph="10">8-10万</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="10" data-ph="15">10-15万</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="15" data-ph="20">15-20万</a>
            </li>
            <li>
            <a href="javascript:void(0)" class="sc-cs" data-pl="20" data-ph="">20万以上</a>
            </li>
            </ul>
    <span class="sc-zy">自定义价格</span>
    <span class="cp-sj1">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tbody><tr>
            <td width="26%"><input class="m-n1" type="text" id="price_from" placeholder="万元" value="" size="2"></td>
            <td width="13%"> &nbsp;至&nbsp;</td>
            <td width="58%"><input class="m-n1" type="text" id="price_to" placeholder="万元" value="" size="2"></td>
            <td width="3%"><input class="sx-btn1" type="submit" id="price_search" value="提交"></td>
        </tr>
    </tbody></table>
    </span>
    </div>
    <div class="clear"></div>
    </div>

    <div class="cs-nav" style="height:28px">
      <div class="cs-nav-tit">车龄</div>
                  <div class="cs-list" id="caroldList">
        <ul>
          <li><a class=" sc-cs sc-cs1" href="javascript:void(0)" data-yl=""  data-yh="">不限</a></li><li>
          </li><li><a class="sc-cs" href="javascript:void(0)" data-yl="0"  data-yh="1">1年以内</a></li><li>
          </li><li><a class="sc-cs" href="javascript:void(0)" data-yl="0"  data-yh="3">3年以内</a></li><li>
          </li><li><a class="sc-cs" href="javascript:void(0)" data-yl="0"  data-yh="5">5年以内</a></li><li>
          <span class="sc-zy">自定义车龄</span>
          <span class="cp-sj1">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tbody><tr>
              <td width="26%"><input class="m-n1" type="text" placeholder="年" id="year_from" size="2" value=""></td>
              <td width="13%">&nbsp;至&nbsp;</td>
              <td width="58%"><input type="text" class="m-n1" placeholder="年" id="year_to" size="2" value=""></td>
              <td width="3%"><input class="sx-btn1" type="submit" id="year_search" value="提交"></td>
            </tr>
          </tbody></table>
          </span>
        </li></ul>
      </div>
      <div class="clear"></div>
    </div>

    <div class="clear"></div>
    <div class="cs-nav" style="height:25px;">
    <div class="cs-nav-tit">变速箱</div>
    <div class="cs-list" id="boxList">
            <ul>
      <li>
      <a class="sc-cs sc-cs1" href="javascript:void(0)">不限</a>
      </li>
      <li>
      <a class="sc-cs" href="javascript:void(0)" data-val="自动">自动</a>
      </li>
      <li>
      <a class="sc-cs" href="javascript:void(0)" data-val="手动">手动</a>
      </li>
      </ul>
    </div>
    <div class="clear"></div>
    </div>

    <div class="clear"></div>
    <div class="cs-nav" style="border-bottom:0;">
    <div class="cs-nav-tit">车型</div>
        <div class="cs-list" id="carstyleList">
    <ul>
      <li>
        <a class="sc-cs sc-cs1" href="javascript:void(0)">不限</a>
      </li>
      <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="两厢">两厢</a>
      </li>
      <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="三厢">三厢</a>
      </li>
      <li>
        <a class="sc-cs" href="javascript:void(0)" data-val="SUV">SUV</a>
      </li><li>
      </li><li>
        <a class="sc-cs" href="javascript:void(0)" data-val="MPV">MPV</a>
      </li><li>
    </li></ul>
    </div>
    <div class="clear"></div>
    </div>

    </div>
  <!--
    <div class="car-screening-right">
    <strong>排序</strong>
        <a class="px-mr" href=''><strong>默认</strong></a>
        <a class="<div style="border:1px solid #990000;padding-left:20px;margin:0 0 10px 0;">

<h4>A PHP Error was encountered</h4>

<p>Severity: Notice</p>
<p>Message:  Undefined variable: sort_field</p>
<p>Filename: views/list.php</p>
<p>Line Number: 290</p>

</div>initial" href='?sf=p&od=a'><strong>价格</strong></a>
        <a class="<div style="border:1px solid #990000;padding-left:20px;margin:0 0 10px 0;">

<h4>A PHP Error was encountered</h4>

<p>Severity: Notice</p>
<p>Message:  Undefined variable: sort_field</p>
<p>Filename: views/list.php</p>
<p>Line Number: 291</p>

</div>initial" href='?sf=m&od=a'><strong>里程</strong></a>
    </div>
    -->
    <div class="clear"></div>
    </div>
   
    
    
    <div class="screening_px">
            <ul>
             <li><span class="screening_mrpx1" id="default_sort">默认排序</span></li>
            <li>
              <div class="select_box" id="YPC_sp">
                                    <span class="select_txt">价格</span><i class="YPC_ico YPC_ico_downarr"></i>
                                   <div class="option">
                      <a href="javascript:void(0)" data-sp="1">价格从低到高</a>
                      <a href="javascript:void(0)" data-sp="2">价格从高到低</a>
                  </div>
                </div>
                <br clear="all">
              </li>
            <li>
              <div class="select_box"  id="YPC_so">
                      <span class="select_txt">车龄</span><i class="YPC_ico YPC_ico_downarr"></i>
                      <div class="option">
                      <a href="javascript:void(0)" data-so="1">车龄从低到高</a>
                      <a href="javascript:void(0)" data-so="2">车龄从高到低</a>
                  </div>
                </div>
                <br clear="all">
              </li>
            </ul>
    <a class="reset-m" href="#"><i class="YPC_ico YPC_ico_search"></i>没想要的？ 让我们急速帮您寻找个人好车 <i class="YPC_ico YPC_ico_arr3"></i></a>
        </div>
    
    
     <!--/分类筛选模块-->
    <!--车辆列表模块-->

 <div class="YPC_carlist">
 	<ul id="carlist_outer" class="carlist_outer">
 		<c:forEach items="${requestScope.carBases}" var="carBase"> 
			<li class="list">
				<div class="top_img">
					<div class="left_img"><img src="${carBase.imageLeft}"></div>
					<div class="right_img"><img src="${carBase.imageRightTop}"><img src="${carBase.imageRightBottom}"></div>
					<span class="opa"><i>${carBase.baseMarketTime}款 ${carBase.baseLine} ${carBase.baseModel}</i></span>
				</div>
				<div class="bottom_info">
					<div class="left_info"><span>${carBase.sellerName}|${carBase.place}|${carBase.sellerHomeAddress}</span></div>
					<div class="right_info"><span>￥<i>${carBase.price}万</i></span></div>
					<div class="center_info">
						<span class="time"><i class="tit">上牌时间</i><i class="val">${carBase.registerTime}</i></span>
						<span class="road"><i class="tit">表显里程</i><i class="val">${carBase.mileage}</i></span>
						<span class="box"><i class="tit">变速箱</i><i class="val">${carBase.gearbox}</i></span>
					</div>
				</div>
			</li>
		</c:forEach>
 	</ul>
    <div class="paging">
        <ul>
		 <li><a class="pagination_page" id="page_prev" href="javascript:void(0)">上一页</a></li>
            <li><a class="pagination_page_current page_num" id="pageNum_1" href="javascript:void(0)"> 1</a></li><li></li>
            
            <c:choose> 
				<c:when test="${requestScope.totalPage <= 9}"> 
					<c:forEach var="i" begin="2" end="${requestScope.totalPage}" step="1"> 
					      <li><a class="pagination_page page_num" id="pageNum_${i}" href="javascript:void(0)"> ${i}</a></li><li></li>
					</c:forEach> 
				</c:when> 
				<c:otherwise> 
					<c:forEach var="i" begin="2" end="9" step="1"> 
					      <li><a class="pagination_page page_num" id="pageNum_${i}" href="javascript:void(0)"> ${i}</a></li><li></li>
					</c:forEach>
					<li><a class="pagination_gap"><strong>…</strong></a></li>
           	 		<li><a class="pagination_page page_num" id="pageNum_${requestScope.totalPage}" href="javascript:void(0)">${requestScope.totalPage}</a></li>
				</c:otherwise> 
			</c:choose> 
            <li><a class="pagination_page" id="page_next" href="javascript:void(0)">下一页</a></li>
        </ul>
	</div>
	<a class="reset-mx" href="#"><i class="YPC_ico YPC_ico_search"></i>没想要的？ 让我们急速帮您寻找个人好车</a>
 </div>
 
<!--/车辆列表模块-->
    <!--footer模块-->
    <div id="footer">
        <div class="a12u" id="content">
            <div class="footer">
                <table style="width: 910px; line-height: normal; letter-spacing: normal; border-collapse: collapse; border-spacing: 0px; margin: 0 auto 0 auto;" cellpadding="3">
                    <tbody><tr>
                        <td style="width: 62px; vertical-align: middle;">
                            <img src="../images/_temp/logo_footer.png" width="40" height="39" alt="Beepi">
                        </td>
                        <td style="width: 138px;" class="txt14 footerLine">
                            <ul class="footerLinkList">
                                <li><a href="https://www.beepi.com/Sell">Sell a Car</a></li>
                                <li><a href="https://www.beepi.com/Buy">Buy a Car</a></li>
                                <li><a href="https://www.beepi.com/BackseatDriver">Backseat Driver</a></li>
                                <li><a href="https://www.beepi.com/Love">Beepi Love</a></li>
                            </ul>
                        </td>
                        <td style="width: 184px;" class="txt14 footerLine">
                            <ul class="footerLinkList">
                                <li><a href="https://www.beepi.com/TopFiveQuestions">How It Works</a></li>
                                <li><a href="https://www.beepi.com/BeepiCertified">Beepi-Certified</a></li>
                                <li><a href="https://www.beepi.com/PricingAdvantage">Our Pricing Advantage</a></li>
                                <li><a href="https://www.beepi.com/SellerChecklist">Seller Checklist</a></li>
                            </ul>
                        </td>
                        <td style="width: 138px;" class="txt14 footerLine">
                            <ul class="footerLinkList">
                                <li><a href="https://www.beepi.com/FAQ">FAQ</a></li>
                                <li><a href="https://www.beepi.com/BeepiPrime">Beepi Prime</a></li>
                                <li><a href="https://www.beepi.com/TermsOfUse">Terms of Use</a></li>
                                <li><a href="https://www.beepi.com/PrivacyPolicy">Privacy Policy</a></li>
                            </ul>
                        </td>
                        <td style="width: 115px;" class="txt14 footerLine">
                            <ul class="footerLinkList">
                                <li><a href="https://www.beepi.com/About#jobs">Jobs</a></li>
                                <li><a href="https://www.beepi.com/About">About Us</a></li>
                                <li><a href="https://www.beepi.com/ContactUs">Contact Us</a></li>
                                <li><a href="https://www.beepi.com/Press">Press</a></li>
                            </ul>
                        </td>
                        <td style="width: 138px; text-align: center; vertical-align: middle;" class="txt14"><span class="beepiColor" style="font-weight: bold;">(888) 542-3374</span></td>
                        <td style="width: 45px; vertical-align: middle;">
                            <div class="btFacebookFooter" onclick="window.open(&#39;https://facebook.com/beepihq&#39;);"></div>
                        </td>
                        <td style="width: 45px; vertical-align: middle;">
                            <div class="btTwitterFooter" onclick="window.open(&#39;https://twitter.com/beepi&#39;);"></div>
                        </td>
                        <td style="width: 45px; vertical-align: middle;">
                            <div class="btPinterestFooter" onclick="window.open(&#39;https://pinterest.com/beepihq&#39;);"></div>
                        </td>
                    </tr>
                </tbody></table>
            </div>
            <div class="footerBottom">
                <table style="width: 100%;">
                    <tbody><tr>
                        <td style="width: 15%;">&nbsp;
                            
                        </td>
                        <td style="width: 70%; text-align: center;">
                            <img src="../images/_temp/heartIcon.gif" width="14" height="12" alt="Made with Love" title="Made with Love"> 
                            &nbsp;
                            Made with love in Silicon Valley. Licensed by the California DMV.
                        </td>
                        <td style="width: 15%; text-align: right;">
                            <span class="txt14" style="color: #DDDDDD;">© Beepi, 2014</span>
                            &nbsp;&nbsp;
                        </td>
                    </tr>
                </tbody></table>
            </div>
        </div>
    </div>
   <!--/footer模块-->
    <script>
$(document).ready(function(){
	var $category = $('#brandList a:gt(19):not(:last)');
	$category.hide();
	var $toggleBtn = $('#showMore a');
	var bool = 1;
	$toggleBtn.click(function(){
		if(bool == 1){
			$category.show();
			$(this).find('span').removeClass('hide').addClass('show').text('收起');
			bool = 0;
		 }else{
			$category.hide();
			$(this).find('span').removeClass('show').addClass('hide').text('更多');
			bool = 1;
		 }
	 });
});
</script>
<script type="text/javascript">
function orderByPrice(){
	var result = $('.carlist_outer li').toArray().sort(function(a,b){
		
		var aPrice = $(a).find('.right_info i').html();
		var bPrice = $(b).find('.right_info i').html();
    	return parseFloat(aPrice.substring(0, aPrice.length-2)) - parseFloat(bPrice.substring(0, bPrice.length-2))
    });
    $('.carlist_outer').empty();
    
    $(result).appendTo('.carlist_outer');

}
</script>




<script src="../js/carlist.js"></script>
</body>

</html>
