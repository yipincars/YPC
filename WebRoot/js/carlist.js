
// -----------------------------------
// carlist by xinwu
(function () {

	function request4CarBase(){
		
		$.post( "/YPC/yipincars/getCarBase", json_data, function( data ) {
			
			$('#carlist_outer').empty();
			if(data.carBases.length > 0){
				$('#myTemplate').tmpl(data.carBases).appendTo('#carlist_outer');
			}
			if(data.totalPage == 0){
				$('.paging').empty();//需要单独设计空时的页面
			}else{
				var pageHtml = '<ul><li><a class="pagination_page" id="page_prev" href="javascript:void(0)">上一页</a></li>';
				if(data.totalPage < 10){
					for(var i=1; i <= data.totalPage; i++){
						pageHtml += ('<li><a class="pagination_page page_num" id="pageNum_' + i + '" href="javascript:void(0)"> ' + i + '</a></li><li></li>');
					}
				}else{
					for(var i=1; i < 10; i++){
						pageHtml += ('<li><a class="pagination_page page_num" id="pageNum_' + i + '" href="javascript:void(0)"> ' + i + '</a></li><li></li>');
					}
					pageHtml += ('<li><a class="pagination_gap"><strong>…</strong></a></li>' + '<li><a class="pagination_page page_num" id="pageNum_' 
						+ data.totalPage + '" href="javascript:void(0)"> ' + data.totalPage + '</a></li>');
				}
				pageHtml += ' <li><a class="pagination_page" data-total="' + data.totalPage + '" id="page_next" href="javascript:void(0)">下一页</a></li></ul>';
				
				$('.paging').empty();
				$('.paging').prepend(pageHtml);
				
				$('#pageNum_' + json_data.pageNo).removeClass('pagination_page');
				$('#pageNum_' + json_data.pageNo).addClass('pagination_page_current');
			}
		}, "json");
	};
 var json_data = {"make":"","pl":"","ph":"","yl":"","yh":"","gearbox":"","classify":"","sp":"","so":"","pageNo":"1"};
	$( ".sc-cs" ).click(function() {
		var root  = $(this).parents(".cs-list");
		var queryItem = $(root).attr("id");
		json_data.pageNo = "1";
		var current = $(".pagination_page_current");
		
    	current.next().addClass("pagination_page_current");
    	current.removeClass('pagination_page_current');
		$(root).find(".sc-cs1").removeClass("sc-cs1");
		$(this).addClass("sc-cs1");
		var data_val = $(this).data("val");
		switch (queryItem) {
		  case "brandList":
		  json_data.make = data_val;
			  break;
		  case "priceList":
		  	var data_pl = $(this).data("pl");
			var data_ph = $(this).data("ph");
			  json_data.pl = data_pl;
			  json_data.ph = data_ph;
		  	  break;
		  case "caroldList":
			  var data_yl = $(this).data("yl");
			  var data_yh = $(this).data("yh");
			  json_data.yl = data_yl;
			  json_data.yh = data_yh;
			  break;
		  case "boxList":
			  json_data.gearbox = data_val;
			  break;
		  case "carstyleList":
			 	json_data.classify = data_val;
			  break;
		}
		
		request4CarBase();
	});
	
	
//	$(".flex-next").click(function(){
//      class_label = $(this).parent().parent().parent().attr("class");
//      class_label = class_label.split(' ')[1];
//      $("img.slide_lazy."+class_label).trigger("sporty")
//    });
//
//    $(".flex-prev").click(function(){
//      class_label = $(this).parent().parent().parent().attr("class");
//      class_label = class_label.split(' ')[1];
//      $("img.slide_lazy."+class_label).trigger("sporty")
//    });

    $("#price_from").bind("keyup", function(event){
      value = $("#price_from").val();
      $("#price_from").val(value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,''));
    });

    $("#price_to").bind("keyup", function(event){
      value = $("#price_to").val();
      $("#price_to").val(value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,''));
    });

    $("#price_search").click(function(){
    	
      json_data.pageNo = "1";
      //获取价格区间
      price_from = $("#price_from").val();
      price_to = $("#price_to").val();
      if (price_from == "") price_from = "";
      if (price_to == "") price_to = "";
      price_from = parseFloat(price_from);
      if (isNaN(price_from)) {
        alert("您选择的价格下限无效，请重新输入!");
        $("#price_from").focus();
        return false;
      }
      price_to = parseFloat(price_to);
      if (isNaN(price_to)) {
        alert("您选择的价格上限无效，请重新输入!");
        $("#price_to").focus();
        return false;
      }
      if (price_to != 0 && price_to < price_from) {
        //调换位置
        $("#price_from").val(price_to);
        $("#price_to").val(price_from);
        tmp = price_from;
        price_from = price_to;
        price_to = tmp;
      }
      
		json_data.pl = price_from;
		json_data.ph =price_to;
		request4CarBase();
    });


    $("#year_from,#year_to").bind("keyup", function(event){
      value = $(this).val();
      $(this).val(value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,''));
    });

    $("#year_search").click(function(){
    	 json_data.pageNo = "1";
    	 
    	year_to = $("#year_to").val();
    	year_from = $("#year_from").val();
       //console.log(year_from);
   
    	 year_from = parseInt(year_from);
         if(isNaN(year_from)){
          alert("输入的年份下限无效，请重新输入!");
          $("#year_from").focus();
          return false;
         }
         
       year_to = parseInt(year_to);
       if(isNaN(year_to)){
        alert("输入的年份上限无效，请重新输入!");
        $("#year_to").focus();
        return false;
       }
      
       
       if(year_from != 0 && year_to<year_from){
        $("#year_from").val(year_to);
        $("#year_to").val(year_from);
        tmp = year_to;
        year_to = year_from;
        year_from = tmp;
       }
      

       json_data.yl = year_from;
		json_data.yh =year_to;
		request4CarBase();
    });

          $(".select_box").click(function(event){   
	          event.stopPropagation();
	          $(this).find(".option").toggle();
	          $(this).parent().siblings().find(".option").hide();
          });
    $(".option a").click(function(){
        var value=$(this).text();
        $(this).parent().siblings(".select_txt").text(value);
        $("#select_value").val(value)
        })
        
        
        $("#YPC_sp a").click(function(){
        	$("#YPC_so .select_txt").text("价格");
        json_data.sp = $(this).data("sp");
        json_data.so = "";
        request4CarBase();
        });
	 $("#YPC_so a").click(function(){
		 $("#YPC_sp .select_txt").text("车龄");
        json_data.so = $(this).data("so");
        json_data.sp = "";
        request4CarBase();
	 });
	 
	 $('.paging').on("click", ".page_num", function(){ 
		 
		 json_data.pageNo = $.trim($(this).text());
		 request4CarBase();
	}); 

	 $('.paging').on("click", "#page_prev", function(){ 
      
	   if(json_data.pageNo == 1){
		   return false;
	   }
	   json_data.pageNo--;
	   request4CarBase();
    });
        
       
	 $('.paging').on("click", "#page_next", function(){ 
	      
		   if(json_data.pageNo == $('#page_next').data("total")){
			   return false;
		   }
		   json_data.pageNo++;
		   request4CarBase();
	    });
       
	 $("#default_sort").click(function(){
		 json_data.sp="";
		 json_data.so="";
		 $("#YPC_sp .select_txt").text("车龄");
		 $("#YPC_so .select_txt").text("价格");
		 request4CarBase();
	 });
	 $(document).click(function(){
		 $('.option').css("display", "none");
	 });
} ());

