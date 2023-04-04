package com.example.sprboot.register.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

//컨트롤러 어노테이션(컨트롤러 객체를 자동으로 생성)
@Controller
public class registerController {
    
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/register") // url pattern mapping
    public String register() {
        
        return "register/register"; 

    }//>> main.jsp를 컨트롤 클래스를 경유하여 실행한다.

    @RequestMapping("/register/createuser")
    public void createUser(HttpServletRequest httpServletRequest){
        String userID = httpServletRequest.getParameter("userID");
        String userFirstName = httpServletRequest.getParameter("userFirstName");
        String userLastName = httpServletRequest.getParameter("userLastName");
        String userEmail = httpServletRequest.getParameter("userEmail");
        String userPassword = httpServletRequest.getParameter("userPassword");

        log.info(userID);
        log.info(userFirstName);
        log.info(userLastName);
        log.info(userEmail);
        log.info(userPassword);
    }
}
