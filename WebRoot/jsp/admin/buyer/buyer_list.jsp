<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form id="pagerForm" method="post" action="w_list.html">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<form rel="pagerForm" onsubmit="return navTabSearch(this);" action="demo_page1.html" method="post">
	<div class="searchBar">
	
		<ul class="searchContent">
			<li>
				<label>品牌</label>
				<input type="text" name="make"/>
			</li>
			<li>
				<label>价格</label>
				<input type="text" name="lowPrice"/>
			</li>
			<li>
				<label>至</label>
				<input type="text" name="highPrice"/>
			</li>
			<li>
				<label>车龄</label>
				<input type="text" name="older"/>
			</li>
			</br>
			<li>
				<label>变速箱</label>
				<input type="text" name="gearbox"/>
			</li>
			<li>
				<label>车型</label>
				<input type="text" name="classify"/>
			</li>
			<li>
				<label>里程数</label>
				<input type="text" name="mileage"/>
			</li>
			<li>
				<label>地域</label>
				<select class="combox" name="place">
					<option value="">北京</option>
				</select>
			</li>
		</ul>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="html/w_panel.html" target="navTab"><span>详情</span></a></li>
			<li><a class="add" href="/YPC/jsp/admin/oldcar/add_old_car.jsp" target="navTab"><span>添加</span></a></li>
<!--			<li><a class="delete" href="demo/common/ajaxDone.html?uid={sid_user}" target="ajaxTodo" title="ç¡®å®è¦å é¤åï¼" warn="è¯·éæ©ä¸ä¸ªç¨æ·"><span>å é¤</span></a></li>-->
			<li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab" warn="è¯·éæ©ä¸ä¸ªç¨æ·"><span>编辑</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="å®è¦å¯¼åºè¿äºè®°å½å?"><span>导出EXCEL</span></a></li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="å®è¦å¯¼åºè¿äºè®°å½å?"><span>打印</span></a></li>
		</ul>
	</div>

	<div id="w_list_print">
	<table class="list" width="98%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
		<thead>
<!--			<tr>-->
<!--				<th colspan="2">车辆基本信息</th>-->
<!--				<th colspan="2">检测师信息</th>-->
<!--				<th colspan="3">卖车人信息</th>-->
<!--			</tr>-->
			<tr>
				<th width="80" orderField="name" class="asc">价格</th>
				<th width="80" orderField="name" class="asc">质量等级</th>
				<th width="100" orderField="num" class="desc">品牌</th>
				<th width="100" orderField="num" class="desc">上牌时间</th>
				<th width="100" orderField="num" class="desc">检测时间</th>
				<th width="100" orderField="num" class="desc">工程师描述</th>
				<th width="100" orderField="num" class="desc">车主描述</th>
				<th width="100" orderField="num" class="desc">车主电话</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${requestScope.result}" var="carBase"> 
				<tr>
					<td>${carBase.price}</td>
					<td>${carBase.qualityLevel}</td>
					<td>${carBase.baseMake}</td>
					<td>${carBase.registerTime}</td>
					<td>${carBase.detectTime}</td>
					<td>${carBase.masterDescription}</td>
					<td>${carBase.sellerDescription}</td>
					<td>${carBase.sellerTelephone}</td>
				</tr>
				
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="panelBar" >
		<div class="pages">
			<span>æ¾ç¤º</span>
			<select name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>æ¡ï¼å±23æ¡</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="2"></div>

	</div>

</div>
