<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<title>Smart University | Sign-up</title>
			
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	
	<body>
		
		<div class="toppanel">
			<div class="toppanel-center"> 
				<a href="index.html"> <div class="logo"> </div> </a>
				
				<div class="userpanel"> <a href="sign-in.html"> Вход </a>  </div>
				
			</div>
		</div>
		
		<div class="maincontent">
			
			<form class="addeventform" action="create_ev_act" enctype="multipart/form-data" method="post">
				<div class="signintextlabel"> New Event </div>
				<input type="text" name="ne" placeholder="Введите название вашего обьявления...">
				<input type="date" name="d1" placeholder="Введите начальную дату...">
				<input type="date" name="d2" placeholder="Введите конечную дату...">
				<input type="text" name="c" placeholder="Введите стоимость...">
				<input type="text" name="desc" placeholder="Опишите суть обьявления...">
				<input type="file" name="f" value="Загрузите фото">
				<input type="submit" value="Добавить обьявление">
			</form>			
			
			
			
		</div>
		
		
		<div class="footer"> Smart University Inc. 2016</div>
		
		
		
		
	</body>
	
	
	
</html>