
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>
    <div>
        <button onclick="location.href='/'">메인 홈 이동</button>
    </div>
    
    <form action="/loginAction" method="GET">

    <label for="id">아이디</label>
    <input id="id" name="id" type="text" value="" placeholder="ID를 입력해주세요"/>
    <label for="password">비밀번호</label>
    <input id="password" name="password" type="text" value="" placeholder="ID를 입력해주세요"/>

    <button type="subit">전송</button>
    </form>
</body>
</html>