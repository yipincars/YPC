<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="contentTitle">è½¦è¾ä¿¡æ¯</h2>


<div class="pageContent sortDrag" selector="h1" layoutH="42">

	<div class="panel collapse" defH="350">
		<h1>åºæ¬ä¿¡æ¯</h1>
		<div class="pageContent">
            <form method="post" action="" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
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
                        <input name="place" type="text" size="30" value="${carBase.place}" />
                    </p>
                    <p>
                        <label>价格</label>
                        <input name="price" type="text" size="30" value="${carBase.price}" />
                    </p>
                     <p>
                        <label>质量等级</label>
                        <input name="qualityLevel" type="text" size="30" value="${carBase.qualityLevel}" />
                    </p>
                    <p>
                        <label>车龄（月）</label>
                        <input name="older" type="text" size="30" value="${carBase.older }" />
                    </p>
                    <p>
                        <label>变速箱</label>
                        <input name="gearbox" type="text" size="30" value="${carBase.gearbox }" />
                    </p>
                    <p>
                        <label>车型</label>
                        <input name="classify" type="text" size="30" value="${carBase.classify }" />
                    </p>
                    <p>
                        <label>上牌时间</label>
                        <input type="text" name="registerTime" size="30" value="${carBase.registerTime }" />
                    </p>
                    <p>
                        <label>里程数(公里)</label>
                        <input name="mileage" type="text" size="30" value="${carBase.mileage }" />
                    </p>
                    <p>
                        <label>车牌号</label>
                        <input name="platenNumber" type="text" size="30" value="${carBase.platenNumber }" />
                    </p>
                    <p>
                        <label>排放标准</label>
                        <input name="exhaust" type="text" size="30" value="${carBase.exhaust }" />
                    </p>
                    <p>
                        <label>年检截止日期</label>
                        <input type="text" name="annualInspection" value="${carBase.annualInspection}" size="30" />
                    </p>
                    <p>
                        <label>强险截止日期</label>
                        <input type="text" name="forcedInsurance" value="${carBase.forcedInsurance}" size="30" />
                    </p>
                    <p>
                        <label>商险截止日期</label>
                        <input type="text" name="businessInsurance" class="date" value="${carBase.businessInsurance }" size="30" />
                    </p>
                    <p>
                        <label>过户次数</label>
                        <input name="transforNumber" type="text" size="30" value="${carBase.transforNumber }" />
                    </p>
                    <p>
                        <label>最后过户日期</label>
                        <input type="text" name="transforLastTime" class="date" size="30" value=${carBase.transforLastTime } />
                    </p>
                    <p>
                        <label>检测日期</label>
                        <input type="text" name="detecteTime" class="date" size="30" value=${carBase.detecteTime } />
                    </p>
                    <p>
                        <label>车主姓名</label>
                        <input name="sellerName" type="text" size="30" value="${carBase.sellerName }" />
                    </p>
                    <p>
                        <label>车主工作性质</label>
                        <input name="sellerJob" type="text" size="30" value="${carBase.sellerJob }" />
                    </p>
                    <p>
                        <label>车主住址</label>
                        <input name="sellerHomeAddress" type="text" size="30" value="${carBase.sellerHomeAddress }" />
                    </p>
                     <p>
                        <label>车主电话</label>
                        <input name="sellerTelephone" type="text" size="30" value="${carBase.sellerTelephone }" />
                    </p>
                    
                     <p style="width:100%;height:40px;">
                        <label style="20%;line-height:40px;">车主描述</label>
                        <textarea style="width:85%" name="sellerDescription" value="${carBase.sellerDescription }" /></textarea>
                    </p>
                    <p>
                        <label>检测师姓名</label>
                        <input name="masterName" type="text" size="30" value="${carBase.masterName }" />
                    </p>
                    <p>
                        <label>检测师工号</label>
                        <input name="masterNumber" type="text" size="30" value="${carBase.masterNumber }" />
                    </p>
                    <p style="width:100%;height:40px;">
                        <label style="20%;line-height:40px;">检测师描述</label>
                        <textarea style="width:85%" name="masterDescription" value="${carBase.masterDescription }" /></textarea>
                    </p>
                </div>
                <div class="formBar">
                    <ul>
                       <!--<li><a class="buttonActive" href="javascript:;"><span>ä¿å­</span></a></li>-->
                        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
                        <li>
                            <div class="button"><div class="buttonContent"><button type="button" class="close">åæ¶</button></div></div>
                        </li>
                    </ul>
                </div>
            </form>
</div>

	</div>
	
	<div class="panel close collapse" defH="150">
		<h1>æ£æµä¿¡æ¯</h1>
		<div class="pageContent">
            <form method="post" action="demo/common/ajaxDone.html" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
                <div class="pageFormContent" layoutH="56">
                    <p>
                        <label>åä¿é©æ </label>
                        <input name="sn" type="text" size="30" value="100001" />
                    </p>
                    <p>
                        <label>åä¿é©æ </label>
                        <input name="name" class="required" type="text" size="30" value="å¼ æ§å" alt="è¯·è¾å¥å®¢æ·åç§°"/>
                    </p>
                    <p>
                        <label>å·¦ååé</label>
                        <input type="hidden" name="orgLookup.id" value="${orgLookup.id}"/>
                        <input type="text" class="required" name="orgLookup.orgName" value="" suggestFields="orgNum,orgName" suggestUrl="demo/database/db_lookupSuggest.html" lookupGroup="orgLookup" />
                        <a class="btnLook" href="demo/database/dwzOrgLookup.html" lookupGroup="orgLookup">æ¥æ¾å¸¦å</a>	
                    </p>
                    <p>
                        <label>å³ååé</label>
                        <input type="text"  value="" name="dwz_orgLookup.orgNum" class="textInput">
                    </p>
                    
                    <p>
                        <label>å·¦åå¤§ç¯</label>
                        <select name="type" class="required combox">
                            <option value="">è¯·éæ©</option>
                            <option value="ä¸ªäºº">ä¸ªäºº</option>
                            <option value="å¬å¸" selected>å¬å¸</option>
                        </select>
                    </p>
                    <p>
                        <label>å³åå¤§ç¯</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>å³åå°¾ç¯</label>
                        <input type="text" name="startDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">éæ©</a>
                    </p>
                    <p>
                        <label>è½®æ¯ç</label>
                        <input type="text" name="endDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">éæ©</a>
                    </p>
                    <p>
                        <label>å¤©çº¿</label>
                        <select name="capital" class="required combox">
                            <option value="">è¯·éæ©</option>
                            <option value="10">10</option>
                            <option value="50" selected>50</option>
                            <option value="100">100</option>
                        </select>
                        <span class="unit">ä¸å</span>
                    </p>
                    <p>
                        <label>åæ¡é£</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>åæ¡é£</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <div class="divider"></div>
                    <p>
                        <label>åé£æ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>åé£æ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>å·¦åæ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>å·¦åæ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>å³åæ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>å³åæ¡ç»ç</label>
                        <input type="text" size="30" />
                    </p>
                    <div class="divider"></div>
                    <p>
                        <label>ä»ªè¡¨ç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>æ¹åç</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è½¦ååè§é</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>é®é³æ¿</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>æå¥ç®±</label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                    <p>
                        <label>è¿æ°æ ¼æ </label>
                        <input type="text" size="30" />
                    </p>
                </div>
                <div class="formBar">
                    <ul>
                        <!--<li><a class="buttonActive" href="javascript:;"><span>ä¿å­</span></a></li>-->
                        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">ä¿å­</button></div></div></li>
                        <li>
                            <div class="button"><div class="buttonContent"><button type="button" class="close">åæ¶</button></div></div>
                        </li>
                    </ul>
                </div>
            </form>
</div>
	</div>

	<div class="panel close collapse" minH="100" defH="150">
		<h1>æ°è½¦ä¿¡æ¯</h1>
		<div>
			<p>åå®¹</p>
			<p>åå®¹</p>
			<p>åå®¹</p>
		</div>
	</div>

</div>
