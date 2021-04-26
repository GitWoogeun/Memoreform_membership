<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<nav class="border fixedNav split-nav">
  <div class="nav-brand">
    <h3><a href="${pageContext.request.contextPath}/">메모리폼</a></h3>
  </div>
  <div class="collapsible">
    <input id="collapsible1" type="checkbox" name="collapsible1">
    <label for="collapsible1">
      <div class="bar1">회원등록</div>
      <div class="bar2">로그인</div>
    </label>
    <div class="collapsible-body">
      <ul class="inline">
        <li><a href="${pageContext.request.contextPath}/join">회원등록</a></li>
        <li><a href="${pageContext.request.contextPath}/login">로그인</a></li>
      </ul>
    </div>
  </div>
</nav>