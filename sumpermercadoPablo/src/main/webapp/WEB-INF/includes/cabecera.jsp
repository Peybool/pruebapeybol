<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:setLocale value="es_ES"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Supermercado Pablo</title>

</head>
<body>
	<header>
		<h1>Supermercado Pablo <small>${sessionScope.user.email}</small></h1>

	</header>
	<nav>
		<ul>
			<li><a href="principal">Principal</a></li>
			<li><a href="carrito">Carrito</a></li>
			
			<li><a href="admin">Administración</a></li>
			<c:choose>
				<c:when test="${sessionScope.user == null}">
					<li><a href="login">Log In</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="desconectar">Logout</a></li>
				</c:otherwise>
			</c:choose>
				
			
		</ul>
	</nav>
	
	<!-- <div id="menu-mobile" class="content-menu-mobile">
                <div  class="overlay">
                    <div class="overlay-content">
                        <a href="#" class="btn-close" onclick="closeMenu()">&times;</a>
                        <nav class="nav-main-mobile">
                            <a href="principal">Principal</a>
                            <a href="carrito">Carrito</a>
                            <a href="admin">Administracion</a>
                            <a href="login">Log In</a>
                            <a href="desconectar">Log Out</a>
                        </nav>
                    </div>   
                </div>
            </div>-->

	<main>