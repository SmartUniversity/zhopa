<%-- 
    Document   : index
    Created on : 24.02.2016, 11:24:38
    Author     : denis
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Metro Guide</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		
	</head>
	
	<body>
		<img src="${station.imgsrc}" class="station-photo"/>
		<div class="black-layer"></div>
		<div class="top-panel"> 
			<div class="top-panel-center">
                            <div class="logo"> <a href="firstrequest"> <div class="logo-img"> </div> </a> </div>
				${userstatus} 
			</div>
		</div>
		
		<div class="main">
			<div class="maincentral">
				<div class="topspace"></div>
				<div class="bigstationname">
					${station.name}
				</div>
				<c:forEach items="${places}" var="place">
				<a href="place?placeid=${place.id}">	
					<div class="view">
						<div class="topviewblock">
							<img src="${place.photosrc}"/>
							<div class="tittle">
								${place.name}
							</div>
						</div>
						
						<div class="description">
							${place.description}
						</div>
						
					</div>
				</a>
				</c:forEach>			
				
			</div>
			<div class="footer">
					KievGuide 2016	
			</div>	
		</div>
	</body>
</html>
