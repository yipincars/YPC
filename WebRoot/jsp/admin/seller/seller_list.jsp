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
			<li><a class="add" href="./seller/show_seller.html" target="dialog"><span>详情</span></a></li>
			<li><a class="edit" href="./seller/edit_seller.html" target="dialog" warn="请选中一条记录"><span>编辑</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="å®è¦å¯¼åºè¿äºè®°å½å?"><span>导出EXCEL</span></a></li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="å®è¦å¯¼åºè¿äºè®°å½å?"><span>打印</span></a></li>
		</ul>
	</div>

	<div id="w_list_print">
	<table class="list" width="98%" layoutH="116">
		<thead>
			<tr>
				<th width="80">品牌</th>
				<th width="80">车系</th>
				<th width="100">车型</th>
				<th width="100">电话</th>
				<th width="100">备注</th>
			
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${requestScope.sellers}" var="seller"> 
				<tr target="sid_user" rel="${seller.id }">
					<td>${seller.baseMake}</td>
					<td>${seller.baseLine}</td>
					<td>${seller.baseModel}</td>
					<td>${seller.telephone}</td>
					<td>${seller.remark}</td>
				</tr>
				
			</c:forEach>
		</tbody>
	</table>
		<input type="hidden" id="selectedId" value="" />
	</div>
	
	<div class="panelBar" >
		<div class="pages">
			<span>显示</span>
			<select name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="2"></div>

	</div>

</div>
