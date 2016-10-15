<%-- 
    Document   : settings
    Created on : 25.02.2016, 19:32:57
    Author     : denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Metro Guide</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	
	<body>
		<img src="img/First_building.jpg" class="station-photo"/>
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
					Настройки профиля
				</div>
				
				<form class="settings-window" action="settingssave" enctype="multipart/form-data" method="post">
					<div class="sign-tittle"> Настройки профиля </div>
					<input type="text" class="sign-in-input" placeholder="Имя" value="${user.firstname}" name="firstname">
					<input type="text" class="sign-in-input" placeholder="Фамилия" value="${user.lastname}" name="lastname">
					<input type="text" class="sign-in-input" placeholder="E-mail" value="${user.email}" name="email">
					<input type="password" class="sign-in-input" placeholder="Пароль" value="${user.password}" name="password">
					<img src="${user.photosrc}" class="user-photo-settings"/>
					<input type="file" class="userpicfile" value="Фото" name="photosrc">
					<input type="submit" value="Сохранить" class="submit-button">
				</form>
				
				
							
				
			</div>
			<div class="footer">
					KievGuide 2016	
			</div>	
		</div>
	</body>
</html>