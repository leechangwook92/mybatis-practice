<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="/css/style.css">
  <style>
    #login-form{
      background-color: #101010;
    }
    #login-title{
      color: #ffffff;
    }
    .login-id-label{
      color: #ffffff;
    }

  </style>
  <script src="${pageContext.request.contextPath}/js/login.js">
  </script>
</head>
<body>

<!-- header -->
<%@include file="/comm/header.jsp"%>

<!-- main -->
<div id="login-form" class="login-form">

  <div id="login-title">Log into</div>
  <!-- https://kauth.kakao.com/oauth/authorize?client_id={REST_API_KEY}&redirect_uri={REDIRECT_URI}&response_type=code -->
  <button id="login-kakao-btn" onclick="location.href='https://kauth.kakao.com/oauth/authorize?client_id=5d5e813ce58f1ee30e95321356cdb438&redirect_uri=http://localhost:80/user/kakao/callback&response_type=code'">
    카카오로 로그인하기
  </button>
  <button id="login-id-btn" onclick="location.href='/user/signup'">
    회원 가입하기
  </button>
  <form action="/user/login" method="post">
    <div class="login-id-label">아이디</div>
    <input type="text" name="username" class="login-input-box">

    <div class="login-id-label">비밀번호</div>
    <input type="password" name="password" class="login-input-box">

    <button id="login-id-submit">로그인</button>
  </form>
  <div id="login-failed" style="display:none" class="alert alert-danger" role="alert">로그인에 실패하였습니다.</div>
</div>
</body>
<script>
  const href = location.href;
  const queryString = href.substring(href.indexOf("?")+1)
  if (queryString === 'error') {
    const errorDiv = document.getElementById('login-failed');
    errorDiv.style.display = 'block';
  }
</script>


<!-- footer -->
<%@include file="/comm/footer.jsp"%>
</body>
</html>