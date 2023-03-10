<%@page import="java.util.ArrayList"%>
<%@page import="review.ReviewVo"%>
<%@page import="java.util.List"%>
<%@page import="review.ReviewDao"%>
<%@page import="product.ProductVo"%>
<%@page import="product.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "cs" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>product</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js" 
    integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" 
    crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
    <script src='../js/product.js'></script>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/product.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/header.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/footer.css">
    <link rel="stylesheet" href="../css/review3.css">
    <link rel="shortcut icon" href="<%=request.getContextPath() %>/images/favicon.png">
    <link rel="icon" href="favicon.ico">
    <script src='../js/go_cart.js'></script>
    <script src='../js/comma.js'></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">
   
</head>
<body>
<%
  ProductDao dao = new ProductDao();
  ProductVo vo = new ProductVo();
  int product_serial = Integer.parseInt(request.getParameter("product_serial"));
  vo = dao.product_view(product_serial);
  request.setAttribute("vo", vo);
  
  ReviewDao rdao = new ReviewDao();
  List<ReviewVo> list = new ArrayList<ReviewVo>();
  list = rdao.viewList(product_serial);
  
  request.setAttribute("list", list);
%>
   <!-- header?????? -->
      <jsp:include page="../main/header.jsp"/>

    <!-- main -->
 
    
    <div class="main" id="main">
        <img class="phone-img" src="${vo.getProduct_picture_url() }" alt="iPhone 12 Pro" width="600px">
        <div class="summary">
           <form method="get" name="form" id="form" target="iframe1">
				<input type="hidden" name="phone-img" value="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-blue-hero?wid=940&hei=1112&fmt=png-alpha&qlt=80&.v=1604021658000" />	            
	            <div class="?????????">
	               <h1>${vo.getProduct_name() }</h1><input type= hidden name="product_name" value= "${vo.getProduct_name() }"><br>
	               ???????????? : ${vo.getProduct_serial() }<input type=hidden name="product_serial" value= "${vo.getProduct_serial() }"><br>
	               ????????? : <fmt:formatNumber value="${vo.getProduct_price() }" type="number"/>???<br>
	               ?????? : ${vo.getProduct_color() }<input type=hidden name="product_color" value= "${vo.getProduct_color() }"><br>
	            </div>
	                <div class="amount">
	                    ??????  <input type=hidden id="moneyComma" name="product_price" value="${vo.getProduct_price() }" />
	                    <input type="button" value=" - " onclick="del();">
	                    <input type="text" id="money" style = "text-align:center;" name="amount" value="1" size="3" onchange="change();">
	                    <input type="button" value=" + " onclick="add();"><br/>
	                    ??????  <input type="text" style = "text-align:center;" name="sum" size="11" readonly>???
	                </div><br>
	                
	               <div class="btns">
	               		<input type="button" value="????????????" class="btn1"/>
	               		<input type="button" value="????????????" class="btn2" onclick="funcPO"/>
	               </div>
         	</form>
        </div>
    </div>

    <!-- ????????? -->
    <div class = "menubar2">
        <div class = "??????3"></div>
        <div class="item-title">
            <a href="#main"><h2>${vo.getProduct_name() }</h2></a>
            <div class="item-title2">
                <ul>
                    <a href="#item-benefits"><li>?????????</li></a>
                    <a href="#review"><li>?????????</li></a>
                    <a href="#note"><li>????????????</li></a>
                    <button>????????????</button>
                </ul>
            </div>
        </div>
    </div>

        <!-- ????????? -->
        <div class="item-benefits" id="item-benefits">
            <div class="item-video">
                <iframe width="1000" height="540" src="${vo.getProduct_youtubeUrl() }" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
            
            <br/><br/><br/><br/><br/>
            <img class="ipone" width="1000px" src="${vo.getProduct_pdInfo() }">
        

        <!-- ????????? -->
        <div class="review" id="review">
            <div class="??????1"></div>
            <h2>?????????</h2>
            <div class="review-avg">
                <ul>
                    <li>??????</li>
                    <li>??????</li>
                    <li>????????????</li>
                    <li>??????</li>
                </ul>
            </div>
            <span class="total-review-menu">?????? ?????????</span>
            <button class="write-review-btn"><i class="fas fa-pen"></i> ????????? ??????</button>
            <div class="total-review">
            
                
             <%--review?????? ????????? --%>
        <div class="container">
 		<div class="row">
 		<form method="post" name="frm_review">
 		<cs:forEach var="list" items="${list }">
	 			<table class="review-table-detail" style="text-align: center;"> 
	 				<tbody>
	 					<tr>
	 						<td class="table-left">??????</td>
	 						<td class="table-right" colspan="2"><input type="text" name="reivewTitle" disabled="disabled" value="${list.getReviewTitle() }"></td>
	 					</tr>
	 					<tr>
	 						<td class="table-left">?????????</td>
	 						<td class="table-right" colspan="2"><input type="text" name="productName" disabled="disabled" value="${list.getProductName() }"></td>
	 					</tr>
	 					<tr>
	 						<td class="table-left">?????????</td>
	 						<td class="table-right" colspan="2"><input type="text" name="memberId" disabled="disabled" value="${list.getMemberId() }"></td>
	 					</tr>
	 					<tr>
	 						<td class="table-left">????????????</td>
	 						<td class="table-right" colspan="2"><input type="text" name="reviewDate" disabled="disabled" value="${list.getReviewDate() }"></td>
	 					</tr>
	 					<tr>
	 						<td class="table-left">??????</td>
	 						<td  class="table-right" colspan="2">
	 						<a href='<%=request.getContextPath() %>/review3/upload/${list.getReviewImg()}' download = '${list.getReviewImg() }'>
										<img src='<%=request.getContextPath() %>/review3/upload/${list.getReviewImg()}' width='200px' height='140px'/>
									</a>
							</td>	
						<hr/>
						</tr>
	 					<tr>
	 						<td class="table-right" id="table-doc" colspan="2"><textarea name="reivewDoc" disabled="disabled" style="height: 350px; width: 100%;" >${list.getReviewDoc() }"></textarea></td>
	 					</tr>
	 						
	 				</tbody>
	 			</table>
	 			<input type="hidden" name="reviewSerial" value="21">
 			</form> 
 		</div>
 	</div>
 	
 		</cs:forEach>
 			
            </div>
        </div>


        <!-- ???????????? -->
        <div id="note"></div>
        <div class="??????2"></div>
        <div class= "note">
            <h2>????????? ????????????</h2>
            <ul>
                <div class="note-btn">
                    <input type="button" class="note-btn1" value="????????????" />
                    <input type="button" class="note-btn2" value="??????/??????/AS ??????"/>
                    <input type="button" class="note-btn3" value="??????/?????? ?????? ??????"/>
                </div>    
                    <div class='????????????'>
                        <p class="bold">????????????</p>
                            <p>?????? ??????????????? ????????? ????????? ??? ????????????.</p><br>
                        <p class="bold">?????????</p>
                        <p>??? ?????? ????????????<br>
                            (???, ????????? ??? ?????? ??????/?????? ????????? ?????? ???????????? ????????? ??? ?????????, ??????????????? ?????? ?????? ?????? ?????? ?????? ?????? ???????????? ????????? ??? ????????????.)</p><br>
                        <p class="bold">????????????</p>
                        <p>???????????? ??? ?????? 3??? ?????? ?????? (???, ????????? ??????) ???, ??????/??????????????? ???????????? ??????????????? ????????? ??? ?????????, ?????? ??????????????? ?????? ???????????? ????????? ??? ????????????.<br>
                            ?????? ???????????? ???????????? ?????????????????? ????????? ?????? ??? ????????? ?????? ???????????? ??? ???????????? ????????? ?????? ????????? ?????? ????????? ??? ????????????.<br>
                            - ??????????????? ?????? ?????? ????????? : ???????????????, ?????????, ?????????????????????<br>
                            - ??????????????? ?????? ??? ?????? ????????? : PC/?????????, ?????????, ??????, ????????????, ????????????, ?????????????????????,????????????/DVD????????????<br>
                            ?????? ?????????????????? ????????????, ????????? ????????? ???????????? ?????? ????????? ????????? ??? ????????????.</p><br>
                        <p class="bold">????????????</p>
                        <p>?????? ?????? ????????? SMS??? ??????????????? ????????? ????????? ??????????????????, ?????? ?????? ???????????? ??? ???????????? ????????? ?????? ????????????. ?????? ?????? ????????? ?????? ?????????<br>
                            ?????? ????????? ????????? ????????? ?????????????????? ?????? ????????? ?????????????????? ????????????. ???????????? ?????? ?????? ????????? ????????? ???????????? ???????????? ???????????? ?????? ????????????<br>
                            ?????? ????????? ???????????? ?????? ????????????. ????????? ????????? ?????? ???????????? ?????? ??? ????????? ???????????? ??? ???3??? ???????????? ?????????????????? ????????? ???????????? ????????????.<br>
                            ??????????????? ?????? ????????? ??????????????? ??? ???????????? ????????????.<br>
                            - TV: ????????? ?????? ??? ?????? ????????? ?????? ????????? ????????? ???????????? ????????????.<br>
                            - ?????????/????????? : ???????????? ?????????, ????????? ?????????, ?????? ???????????? ?????? ?????? ???????????? ????????????.<br>
                            - TV 138 cm ??????, ????????? ?????????, ???????????? ?????????, ???????????? ???????????????, ????????? 7 kg ??????, ?????????, ?????????????????? ????????? ????????? ????????? ????????????, ?????? ???????????? ?????? ??????, ????????? ??? ?????? ????????? ???????????? ????????????.<br>
                            ????????? ?????? ????????? ????????? ???????????????, ???????????? ???????????? ????????? ??? ?????? ?????? ?????? ????????? ??? ????????????.</p><br>
                        <p class="bold">????????????</p>
                            <p>???????????? ?????? '??????????????? -> ??????/???????????? -> ????????????'?????? ???????????? ??? ???????????? ?????? ???????????? ????????? ???????????????.</p><br>
                    </div>

                    <div class='??????????????????'>
                        <p class="bold">??????/?????? ??????</p>
                            <p>??????????????? ?????? ????????? ?????????????????? ?????? ?????? ?????? ???????????? ????????? 7??? ????????? ???????????????. ???, ???????????? ???????????? ????????? ??????/?????? ????????? 7????????? ??? ???????????? ??? ????????? ????????????.<br>
                            ????????? ?????? ?????? ????????? ??????????????? ????????? ???????????? ????????? ??? ??????????????? ????????? ????????? ???????????? ???????????? ????????? 3?????? ??????, ??? ????????? ??? ??? ?????? ??? ??? ????????? ????????? 30??? ????????? ???????????????.<br>
                            ????????? ??????/?????? ?????? ??? ??????????????? ?????? ????????? ????????? ?????????.<br>
                            ?????? ????????? ????????? ?????? ?????? ???????????? ?????????????????? ??????????????? A/S ????????? ????????? ?????? ??? ?????????????????????????????? ???????????? ???????????? ????????? ????????? ?????? ??????/??????/?????????????????????.<br>
                            ??????????????? ????????? ??????????????? ????????? ???, ?????????????????? ??? ????????? ???????????? ???????????? ?????? ?????? ?????????????????? ????????? ??? ????????????.</p><br>
                            <p class="bold">??????/?????? ?????????</p>
                            <p>???????????? ????????? ?????????????????? ????????? ???????????? ?????? ?????? ????????? ????????? ??????(2,500???)??? ???????????? ??????????????? ?????????. ???, ???????????? ????????? ?????? ?????? ????????? ??????????????? ????????? ???????????? ???????????????????????? ??? ??????????????? ????????? ???????????? ??????/????????? ????????? ????????????, ??????????????? ???????????? ???????????????.</p><br>
                            <p class="bold">???????????? ????????? ????????????</p>
                            <p>?????? ?????? ??? ?????? ????????? ?????? ????????? ?????? ??????, ?????? ?????? ??????????????? ???????????? ????????? ????????? ?????? ????????? ?????? ???????????????.</p><br>
                            <p class="bold">A/S ??????</p>
                            <p>?????????????????? ???????????? ????????? ???????????? ????????? ???????????? ?????????????????? ??????????????? A/S??? ???????????????. (??????A/S ????????????: 1588-3366)<br>
                            ??????????????? ?????? ???????????? ????????????????????? A/S??? ??????????????????, [??????] -> [??????????????????] ??? [A/S ???????????? ????????????] ????????? ??????????????? ????????????.</p><br>
                    </div>

                    <div class="????????????????????????">      
                        <p class="bold">??????/?????? ????????????</p>
                            <p>- ???????????? ?????? ?????? ????????? ????????? ?????? ?????? ????????? ??????<br>
                            (??????, ????????? ????????? ????????? ???????????? ?????? ?????? ?????? ????????? ????????? ??????)<br>
                            - ???????????? ???????????? ??????????????? ????????? ????????? ??????<br>
                            - ????????? ????????? ?????? ???????????? ????????? ??????/??????/???????????? ??????????????? ????????? ????????? ??????<br>
                            * ??????, ??????/??????/????????? ?????? ???????????? ?????? ??? ?????? ???????????? ????????? ????????? ???????????????. ?????? ????????? ?????? ??????????????? ????????? ??????????????? ?????????????????? ????????????.<br>
                            * ??????????????? ?????? ????????? ????????? ???????????? ????????? 7??? ??????, ????????? ?????? ???????????? ???????????????.<br>
                            - ????????? ???????????? ???????????? ????????? ????????? ??????????????? ????????? ??????<br>
                            - ????????? ????????? ????????? ?????? ??? ????????? ????????? ????????? ????????? ??????<br>
                            - ???????????? ????????? ????????? ?????? ??????<br>
                            - ?????? ?????? ????????? ??????????????? ?????? ??? ??????????????? ??????, ????????? ????????? ???????????? ?????????????????? ?????? ????????? ???????????? ??????<br>
                            - ??????, '??????????????? ???????????? ?????????????????? ?????? ??????' ??? ??????????????? ????????? ??????/?????? ??????????????? ???????????? ??????</p>
                    </div>          
            </ul>
        </div>
        
   <!-- footer?????? -->
      <%@include file="../main/footer.jsp" %>
<script>
</script>
</body>
<iframe name="iframe1" style="display:none;"></iframe>
</html>