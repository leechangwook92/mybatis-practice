<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

<script src="${pageContext.request.contextPath}/js/login.js">
</script>

<!-- header -->
<%@include file="/comm/header.jsp"%>

<!-- main -->
<div class="container">
  <div class="row mb-2 mt-4">
    <div class="col">NO</div>
    <div class="col">공부일자</div>
    <div class="col">공부내용</div>
    <div class="col">등록일자</div>
  </div>

  <div class="row mb-2">
    <div class="col">NO</div>
    <div class="col">공부일자</div>
    <div class="col">공부내용</div>
    <div class="col">등록일자</div>
  </div>

  <div class="row mb-2">
    <div class="col">NO</div>
    <div class="col">공부일자</div>
    <div class="col">공부내용</div>
    <div class="col">등록일자</div>
  </div>

  <div class="row mb-2">
    <div class="col">NO</div>
    <div class="col">공부일자</div>
    <div class="col">공부내용</div>
    <div class="col">등록일자</div>
  </div>

</div>

<!-- footer -->
<%@include file="/comm/footer.jsp"%>


</body>
</html>