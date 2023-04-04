package com.example.sprboot.login.controller;

import java.net.http.HttpRequest;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

//컨트롤러 어노테이션(컨트롤러 객체를 자동으로 생성)
@Controller
public class loginController {

    private final Logger log = LoggerFactory.getLogger(getClass());
    
     // 로그인 페이지로 이동
     @RequestMapping("/login") // url pattern mapping
     public String login() {
         
         return "login/login"; 
 
     }//>> main.jsp를 컨트롤 클래스를 경유하여 실행한다.
 
     
 
     // @RequestMapping("/loginAction")
     // public String loginAction(HttpServletRequest request){
     //     String id = request.getParameter("id");
     //     String password = request.getParameter("password");
 
     //     log.info(id);
     //     log.info(password);
 
     //     return "login/login";
 
     // }
}
