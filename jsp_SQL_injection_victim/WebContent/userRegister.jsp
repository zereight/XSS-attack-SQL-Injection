<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" style="height: 100%; margin:0; padding: 0;">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>XSS와 SQL injection Test</title>
  </head>
  <body style="height: 100%; margin:0; padding: 0;">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="./index.jsp">21511816 김대현</a>
        <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#collapsibleNavId" aria-controls="collapsibleNavId"
            aria-expanded="false" aria-label="Toggle navigation"></button>
        <div class="collapse navbar-collapse" id="collapsibleNavId">
          <ul class="navbar-nav mr-auto mt-2 mt-lg-0">

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="dropdownId" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">회원관리</a>
              <div class="dropdown-menu" aria-labelledby="dropdownId">
                <a class="dropdown-item" href="./userLogin.jsp">Login</a>
                <a class="dropdown-item" href="./userRegister.jsp">Register</a>
                <a class="dropdown-item" href="./logout.jsp">Logout</a>
              </div>
            </li>
          </ul>

        </div>
      </nav>

    <div class="container my-3 p-5 bg-light">
        
        <form action="./userRegisterAction.jsp" method="post" class="p-3" style="background-color: rgb(137, 189, 113); border-radius: 10%;">
            <div class="row mb-5">
                <div class="col-12 text-center">
                    <h1>회원가입</h1>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-12">
                  <label>아이디</label>
                  <input type="text" class="form-control" name="userId" id="" aria-describedby="helpId" placeholder="아이디를 입력하세요">
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-12">
                    <label>비밀번호</label>
                    <input type="password" class="form-control" name="userPassword" id="" aria-describedby="helpId" placeholder="비밀번호를 입력하세요">
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-12">
                    <label>비밀번호 확인</label>
                    <input type="password" class="form-control" name="userPasswordAgain" id="" aria-describedby="helpId" placeholder="비밀번호를 입력하세요">
                </div>
            </div>
            <div class="row my-3">
                <div class="col-12">
                    <input type="submit" value="로그인" class="form-control btn-primary" name="userId" id="" aria-describedby="helpId" placeholder="비밀번호를 입력하세요">
                </div>
            </div>
            
        </form>

    </div>

    <footer class="bg-dark mt-4 p-5 text-center" style="color: white; position: absolute; bottom:0; width:100%;">

            Copyright ⓒ 2018 김대현 All Rights Reserved.
      
    </footer>
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>