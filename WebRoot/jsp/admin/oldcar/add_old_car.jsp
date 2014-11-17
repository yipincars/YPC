<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<h2 class="contentTitle">添加二手车信息</h2>


<div class="pageContent sortDrag" selector="h1" layoutH="42">

	<div class="panel collapse" defH="250">
		<h1>基本信息</h1>
		<div class="pageContent">
            <form method="post" action="/YPC/yipincars/addCarBase" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
                <div class="pageFormContent" layoutH="56">
                		 <p>
                            <label>品牌</label>
                            <select class="combox">
                                <option value="">test</option>
                            </select>
                        </p>
                        <p>
                            <label>车系</label>
                            <select class="combox">
                                <option value="">test</option>
                            </select>
                        </p>
                        <p>
                            <label>车款</label>
                            <select name="newCarId" class="combox">
                                <option value="1">test1</option>
				              <option value="2">test2</option>
				              <option value="3">test3</option>
                            </select>
                        </p>
               
                	<p>
                        <label>城市</label>
                        <input name="place" type="text" size="30" value="北京" />
                    </p>
                    <p>
                        <label>价格</label>
                        <input name="price" type="text" size="30" value="" />
                    </p>
                     <p>
                        <label>质量等级</label>
                        <select name="qualityLevel" class="combox">
                                <option value="A+">A+</option>
				              <option value="A">A</option>
				              <option value="B">B</option>
                            </select>
                    </p>
                    <p>
                        <label>车龄（月）</label>
                        <input name="older" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>变速箱</label>
                        <select name="gearbox" class="combox">
                                <option value="手动变速箱">手动变速箱</option>
				              <option value="普通自动变速箱">普通自动变速箱</option>
				              <option value="普通自动变速箱带手自一体">普通自动变速箱带手自一体</option>
				               <option value="CVT无级变速箱">CVT无级变速箱</option>
				               <option value="CVT带挡位的变速箱">CVT带挡位的变速箱</option>
				               <option value="双离合变速箱">双离合变速箱</option>
				               <option value="序列变速箱">序列变速箱</option>
                            </select>
                    </p>
                    <p>
                        <label>车型</label>
                         <select name="classify" class="combox">
                                <option value="两厢">两厢</option>
				              <option value="三厢">三厢</option>
				              <option value="SUV">SUV</option>
				               <option value="MPV">MPV</option>
                            </select>
                    </p>
                    <p>
                        <label>上牌时间</label>
                        <input type="text" name="registerTime" class="date" size="30" /><a class="inputDateButton" href="javascript:;">éæ©</a>
                    </p>
                    <p>
                        <label>里程数(公里)</label>
                        <input name="mileage" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>车牌号</label>
                        <input name="platenNumber" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>排放标准</label>
                        <input name="exhaust" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>年检截止日期</label>
                        <input type="text" name="annualInspection" class="date" size="30" /><a class="inputDateButton" href="javascript:;"></a>
                    </p>
                    <p>
                        <label>强险截止日期</label>
                        <input type="text" name="forcedInsurance" class="date" size="30" /><a class="inputDateButton" href="javascript:;"></a>
                    </p>
                    <p>
                        <label>商险截止日期</label>
                        <input type="text" name="businessInsurance" class="date" size="30" /><a class="inputDateButton" href="javascript:;"></a>
                    </p>
                    <p>
                        <label>过户次数</label>
                        <input name="transforNumber" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>最后过户日期</label>
                        <input type="text" name="transforLastTime" class="date" size="30" /><a class="inputDateButton" href="javascript:;"></a>
                    </p>
                    <p>
                        <label>检测日期</label>
                        <input type="text" name="detecteTime" class="date" size="30" /><a class="inputDateButton" href="javascript:;"></a>
                    </p>
                    <p>
                        <label>车主姓名</label>
                        <input name="sellerName" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>车主工作性质</label>
                        <input name="sellerJob" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>车主住址</label>
                        <input name="sellerHomeAddress" type="text" size="30" value="" />
                    </p>
                     <p>
                        <label>车主电话</label>
                        <input name="sellerTelephone" type="text" size="30" value="" />
                    </p>
                    
                     <p style="width:100%;height:40px;">
                        <label style="20%;line-height:40px;">车主描述</label>
                        <textarea style="width:85%" name="sellerDescription" value="" /></textarea>
                    </p>
                    <p>
                        <label>检测师姓名</label>
                        <input name="masterName" type="text" size="30" value="" />
                    </p>
                    <p>
                        <label>检测师工号</label>
                        <input name="masterNumber" type="text" size="30" value="" />
                    </p>
                    <p style="width:100%;height:40px;">
                        <label style="20%;line-height:40px;">检测师描述</label>
                        <textarea style="width:85%" name="masterDescription" value="" /></textarea>
                    </p>
                </div>
                <div class="formBar">
                    <ul>
                       <!--<li><a class="buttonActive" href="javascript:;"><span>ä¿å­</span></a></li>-->
                        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
                    </ul>
                </div>
            </form>
</div>

	</div>
	
	<div class="panel close collapse" defH="150">
		<h1>检测信息</h1>
		<div class="pageContent">
            <form method="post" action="demo/common/ajaxDone.html" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
                <div class="pageFormContent" layoutH="56">
                    <p>
                        <label>前保险杠</label>
                        <input name="sn" type="text" size="30" value="100001" />
                    </p>
                    <p>
                        <label>后保险杠</label>
                        <input name="name" class="required" type="text" size="30" value="张慧华" alt="请输入客户名称"/>
                    </p>
                    <p>
                        <label>左反光镜</label>
                        <input type="hidden" name="orgLookup.id" value="${orgLookup.id}"/>
                        <input type="text" class="required" name="orgLookup.orgName" value="" suggestFields="orgNum,orgName" suggestUrl="demo/database/db_lookupSuggest.html" lookupGroup="orgLookup" />
                        <a class="btnLook" href="demo/database/dwzOrgLookup.html" lookupGroup="orgLookup">查找带回</a>	
                    </p>
                    <p>
                        <label>右反光镜</label>
                        <input type="text"  value="" name="dwz_orgLookup.orgNum" class="textInput">
                    </p>
                    
                    <p>
                        <label>左前大灯</label>
                        <select name="type" class="required combox">
                            <option value="">请选择</option>
                            <option value="个人">个人</option>
                            <option value="公司" selected>公司</option>
                        </select>
                    </p>
                    <p>
                        <label>右前大灯</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右后尾灯</label>
                        <input type="text" name="startDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">选择</a>
                    </p>
                    <p>
                        <label>轮毂盖</label>
                        <input type="text" name="endDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">选择</a>
                    </p>
                    <p>
                        <label>天线</label>
                        <select name="capital" class="required combox">
                            <option value="">请选择</option>
                            <option value="10">10</option>
                            <option value="50" selected>50</option>
                            <option value="100">100</option>
                        </select>
                        <span class="unit">万元</span>
                    </p>
                    <p>
                        <label>前挡风</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>后挡风</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>进气格栅</label>
                        <input type="text" size="30" />
                    </p>
                    <div class="divider"></div>
                    <p>
                        <label>前风挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>后风挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>左前挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>左后挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右前挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右后挡玻璃</label>
                        <input type="text" size="30" />
                    </p>
                    <div class="divider"></div>
                    <p>
                        <label>仪表盘</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>方向盘</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>车内后视镜</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>遮阳板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>手套箱</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>车顶棚</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>车内地胶</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>司机座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>副驾座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>后排座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>座椅调整手柄</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>左前门内饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右前门内饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>左后门内饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右后门内饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>拍档手柄罩</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>拍档把手柄</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>中央扶手</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>点烟器</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>A柱饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>B柱饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>C柱饰板</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>左前门扶手</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右前门扶手</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>右后门扶手</label>
                        <input type="text" size="30" />
                    </p>
                    


                    <div class="divider"></div>
                    <p>
                        <label>驱动方式</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>气囊数</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>轮毂材质</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>遥控钥匙</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>仪表及提示灯</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>雨刷</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>音响</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>喇叭</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>转向助力</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>ABS</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>ESP</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>电动车窗</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>天窗</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>主驾电动座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>副驾电动座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>自动空调</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>外后视镜电动折叠</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>定速巡航</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>多功能方向盘</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>备胎</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>真皮座椅</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>CD</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>DVD</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>GPS导航</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>倒车雷达</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>倒车影像</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>座椅加热</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>离合器异响</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>发动机异响</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>发动机渗油</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>排气颜色蓝</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>排气颜色黑</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>变速箱异响</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>闯档</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>离合器打滑</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>行驶异响</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>制动系统</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>转向系统</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>转向系统</label>
                        <input type="text" size="30" />
                    </p>
                </div>
                <div class="formBar">
                    <ul>
                        <!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
                        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
                        <li>
                            <div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
                        </li>
                    </ul>
                </div>
            </form>
</div>
	</div>

</div>
