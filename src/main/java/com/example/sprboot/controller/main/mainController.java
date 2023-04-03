package com.example.sprboot.controller.main;

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
public class mainController {


    private final Logger log = LoggerFactory.getLogger(getClass());


    // 시작 페이지로 이동
    @RequestMapping("/") // url pattern mapping
    public String index() {
        //JSP 서블릿 클래스는 doGet doPost 메서드가 존재했는데 여기서 model이 그 역할을 한다.
        // Model : 데이터를 담는 그릇 역할, map 구조로 저장됨// key와 value로 구성
        // model.addAttribute("변수명", 값)
        // <beans:property name="prefix" value="/WEB-INF/views/" />
        // <beans:property name="suffix" value=".jsp" />
        // /WEB-INF/views/main.jsp
        return "index"; 
        // main.jsp로 포워딩됨 //JSP에서 dispatcher 객체로 forward한것과 같은 역할
        //나머지 경로는 spring > appServlet > servlet-context.xml에 설정돼있음
        //컨트롤러에 대한 설정은 서블릿컨텍스트에 있다.
    }//>> main.jsp를 컨트롤 클래스를 경유하여 실행한다.

   
}