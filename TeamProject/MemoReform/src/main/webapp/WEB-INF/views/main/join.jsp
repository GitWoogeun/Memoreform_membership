<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://unpkg.com/papercss@1.8.2/dist/paper.min.css">
<script type="text/javascript" src="./../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="./../resources/js/js_userinput.js"></script>
<title>메모리폼 회원가입 페이지</title>
</head>
<body>
	<div class="paper container">
		<jsp:include page="../header.jsp" />

		<div class="text-center">
			<h4>메모리폼에 오신걸 환영합니다</h4>
		</div>

		<div class="row flex-spaces">
			<div class="col-6 col">

				<form method="post" action="userInsert" name="userInsert">
					<div class="form-group">
						<label for="name">이름</label> <input class="input-block"
							type="text" placeholder="실명을 입력해주세요." id="name" name="nm"
							required>
					</div>
					<div class="form-group">
						<label for="email">이메일</label> <input class="input-block"
							type="email" placeholder="example@memoreform.com" name="email"
							id="email" required maxlength="30">
						<button type="button" id="Check">확인</button>
						<span id="emailCheckResult" style="width: 150; color: gray">Email을
							확인해주세요</span>
					</div>
					<div class="form-group">
						<label for="password">비밀번호</label> <input class="input-block"
							type="password" placeholder="비밀번호를 입력해주세요." id="password"
							name="password" required>
					</div>
					<div class="form-group">
						<button type="summit" class="btn-block btn-primary" id="submit"
							disabled="disabled">회원등록</button>
					</div>
				</form>
			</div>
		</div>
		<hr>
	</div>
</body>
</html>