<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng Nhập</title>
</head>
<body>
	<!-- body-center-->
	<div class="body-center">
		<div class="body-center--login">
			<div class="body-center__login--title">
				<i class="fas fa-user-alt"></i>
			</div>
			<form action="/j_spring_security_check"
				id="formLogin" method="post">
				<div class="user-Name">
					<label class="user-Name--label">Tên Đăng Nhập</label> <input
						type="text" placeholder="Nhập tên đăng nhập" name="j_username"
						required>
				</div>
				<div class="password">
					<label class="password--label">Mật khẩu</label> <input
						type="password" placeholder="Nhập mật khẩu" name="j_passwords"
						required>
				</div>
				<div class="submit-login">
					<input type="submit" value="Đăng Nhập">
				</div>
			</form>		
				<div>${message}</div>
		</div>
	</div>

	<!-- footer -->
</body>
</html>