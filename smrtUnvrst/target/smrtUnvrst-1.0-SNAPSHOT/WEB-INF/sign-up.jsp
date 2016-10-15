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
			
			<form class="signupform" action="reg" enctype="multipart/form-data" method="post">
				<div class="signintextlabel"> SIGN-UP </div>
				<input type="text" name="n" placeholder="Введите номер карты...">
				<input type="password" name="p" placeholder="Введите пароль...">
				<input type="password" placeholder="Повторите пароль...">
				<input type="file" name="f" value="Загрузите фото">
				<input type="submit" value="Войти">
				
			</form>			
			
			
			
		</div>
		
		
		<div class="footer"> Smart University Inc. 2016</div>
		
		
		
		
	</body>
	
	
	
</html>