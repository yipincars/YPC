<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form id="pagerForm" method="post" action="w_list.html">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<div rel="pagerForm" method="post">
	<div class="searchBar">
	
		<ul class="searchContent">
			<li>
				<label style="width:12%">电话:</label>
				<input type="text" name="telephone"/>
			</li>
			<li>
				<label style="width:12%">备注:</label>
				<input type="text" name="remark"/>
			</li>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit" id="querySeller">检索</button></div></div></li>
		</ul>
	
		</div>
	</div>
	</div>
</div>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="edit" href="./seller/edit_seller.html" target="navTab" warn="请选中一条记录"><span>编辑</span></a></li>
			<li><a class="add" href="/YPC/yipincars/admin/getSeller" target=""><span>刷新</span></a></li>
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
		<tbody id="sellerBody">
		
			<c:forEach items="${requestScope.sellers}" var="seller"> 
				<tr target="sid_user" rel="${seller.id }" content="seller">
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
<script type="text/javascript">
$('[content="seller"]').bind('click', function(){
	$('#selectedId').val($(this).attr('rel'));	
});

var sellerItem = ["baseMake", "baseLine", "baseModel", "telephone", "remark"];
$('#querySeller').click(function(){
  var pageNo = 1;
  var pageCount = $('[name="numPerPage"]').find("option:selected").text();
  var action = '/YPC/yipincars/admin/getSeller?pageNo=' + pageNo + "&pageCount=" + pageCount;
  $.ajax( {  
        url : action,  
        cache : false,  
        success : function(data, textStatus){
            var rawData = eval("("+data+")")
        	$('#sellerBody tr').remove();
        	var sellers = "";
        	var style = ["","trbg"];
        	for(var i=0; i < rawData.length; i++){
        		sellers += ('<tr class="' + style[i % 2] + '" target="sid_user" rel="' + rawData[i].id + '" content="seller">');
        		for(var j=0; j < sellerItem.length; j++){
        			sellers += ('<td>' + rawData[i][sellerItem[j]] + '</td>');
        		}
        		sellers += '</tr>';
        	}
        	$('#sellerBody').prepend(sellers);
        	
        
<!--			var aStyles = [];-->
<!---->
<!--			var oldThs = $table.find("thead>tr:last-child").find("th");-->
<!--			for(var i = 0, l = oldThs.size(); i < l; i++) {-->
<!--				var $th = $(oldThs[i]);-->
<!--				var style = [], -->
<!--				width = $th.innerWidth() - (100 * $th.innerWidth() / tlength)-2;-->
<!--				style[0] = parseInt(width);-->
<!--				style[1] = $th.attr("align");-->
<!--				aStyles[aStyles.length] = style;-->
<!--			}-->
<!--			-->
<!--        	var tbody = $("#sellerBody");-->
<!--			var ftr = $(">tr:first-child", tbody);-->
<!--			var $trs = tbody.find('>tr');-->
<!--			$trs.hoverClass().each(function(){-->
<!--				var $tr = $(this);-->
<!--				var $ftds = $(">td", this);-->
<!--				for (var i=0; i < $ftds.size(); i++) {-->
<!--					var $ftd = $($ftds[i]);-->
<!--					-->
<!--					if (i < aStyles.length) $ftd.addClass(aStyles[i][1]);-->
<!--				}-->
<!--				$tr.click(function(){-->
<!--					$trs.filter(".selected").removeClass("selected");-->
<!--					$tr.addClass("selected");-->
<!--					var sTarget = $tr.attr("target");-->
<!--					if (sTarget) {-->
<!--					if ($("#"+sTarget, $grid).size() == 0) {-->
<!--						$grid.prepend('<input id="'+sTarget+'" type="hidden" />');-->
<!--					}-->
<!--					$("#"+sTarget, $grid).val($tr.attr("rel"));-->
<!--				}-->
<!--			});-->
          	return false;
        }
    });
}); 



</script>