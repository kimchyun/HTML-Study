<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 
 //서블릿에서 저장한 데이터 꺼내기
 BuyerVO vo = (BuyerVO)request.getAttribute("reqbuyer2");
 
 %>
 
 {
    "id"  : "<%= vo.getBuyer_id() %>",
    "lgu"  : "<%= vo.getBuyer_lgu() %>",
    "name"  : "<%= vo.getBuyer_name() %>",
    "mail"  : "<%= vo.getBuyer_mail() %>",
    "bank"  : "<%= vo.getBuyer_bank() %>",
    "ctel"  : "<%= vo.getBuyer_comtel() %>",
    "bname"  : "<%= vo.getBuyer_bankname() %>",
    "bno"  : "<%= vo.getBuyer_bankno() %>",
    "zip"  : "<%= vo.getBuyer_zip() %>",
    "add1"  : "<%= vo.getBuyer_add1() %>",
    "add2"  : "<%= vo.getBuyer_add2() %>"

 }