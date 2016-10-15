<%-- 
    Document   : index
    Created on : 24.02.2016, 11:24:38
    Author     : denis
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Metro Guide</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		
	</head>
	
	<body>
		<img src="${place.metro.imgsrc}" class="station-photo" height="100" width="100"/>
		<div class="black-layer"></div>
		<div class="top-panel"> 
			<div class="top-panel-center">
				<div class="logo"> <a href="firstrequest"> <div class="logo-img"> </div> </a> </div>
				${userstatus}
			</div>
		</div>
		
		<div class="main">
			<div class="maincentral">
				
				<div class="place-window">
					<img src="${place.photosrc}" class="placepicture"/>
					<div class="main-information">
						<div class="top-info">
							<div class="place-name"> ${place.name} </div>
							<div class="infoblock"> <div class="metroicon"></div> ${place.metro.name} </div>
							<div class="infoblock"> <div class="adressicon"></div> ${place.adress} </div>
						</div>
						
						<div class="rating-block">
							<div class="rating-value"> ${place.ratingvalue} </div>
							${votestatus}
						</div>
						
						<div class="place-description">
							${place.description} 
						</div>
                                                
                                                <div class="author-block">
							<div class="author-icon"> </div>
							${author} 
						</div>
                                                
                                                
                                                <div class="another-places-block">
							
                                                    <c:forEach items="${anotherplaces}" var="anotherplace">
                                                    <a href="place?placeid=${anotherplace.id}">
                                                    <div class="another-place">
								<img src="${anotherplace.photosrc}" class="another-place-img"/>
								<div class="another-place-name"> ${anotherplace.name} </div>
								<div class="another-place-adress"> <div class="another-adressicon"> </div> ${anotherplace.adress} </div>
						    </div>
                                                    </a>
                                                    </c:forEach>
							
							
						</div>
					</div>
					
					<div class="place-down-block">
						
						
						<div class="comments-block">
							
							${owncomment} 
							
							<c:forEach items="${comments}" var="comment">
                                                            <a href="place?placeid=${place.id}" >   
                                                            <div class="comment">
                                                                    <img src="${comment.authorid.photosrc}" class="comment-img"/>
                                                                    <div class="comment-info">
                                                                            <div class="comment-author-name"> ${comment.authorid.lastname}  ${comment.authorid.firstname}  </div>
                                                                            <div class="comment-date"> ${comment.timeanddate} </div>
                                                                            ${comment.isdelete}
                                                                            <div class="comment-text">
                                                                                    ${comment.text}
                                                                            </div>
                                                                    </div>
                                                            </div>
                                                            </a>
							</c:forEach>
							
							
							
							
							
							
							
						</div>
						
						
						
						
						
						
						
						
						
						
						
					</div>
					
				</div>
				
				
							
				
			</div>
			<div class="footer">
					KievGuide 2016	
			</div>	
		</div>
	</body>
</html>
