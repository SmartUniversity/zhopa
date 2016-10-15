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
					Add new place
				</div>
				
				<form class="addnewplace-window" action="addnewplace" enctype="multipart/form-data" method="post">
					<div class="sign-tittle"> Новое место </div>
					<input type="text" class="sign-in-input" placeholder="Название места" name="placename">
					<textarea class="newplace-text" placeholder="Описание места" name="placedescription"></textarea>
					<input type="text" class="sign-in-input" placeholder="Адрес" name="placeadress">
					<select class="sign-in-input" name="placemetro">
						<option>Станция метро</option>
						<option value="1">Академгородок</option>
						<option value="26">Дружбы народов</option>
						<option value="30">Позняки</option>					
					</select>
					<input type="file" class="filephoto" value="Фото" name="placephotosrc">
					<input type="submit" value="Создать событие" class="submit-button">
				</form>
				
				
							
				
			</div>
			<div class="footer">
					KievGuide 2016	
			</div>	
		</div>
	</body>
</html>