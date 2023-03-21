//package com.example.textquest.controller;
//
//import com.example.textquest.entities.Content;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.concurrent.Future;
//
//
//@WebFilter(filterName = "simpleFilter", value = "/logic")
//
//public class SimpleFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//       String path="";
//         servletResponse.setContentType("text/html,charset=UTF-8");
//        String value = servletRequest.getParameter("choice");
//        Content.setTemp(value);
//         String choice="";
//        if (Content.rightButton.containsValue(value)) { choice="2";}
//        else if (Content.buttonWong.containsValue(value)){choice="1";}
//       servletRequest.setAttribute("choice", choice);
//         filterChain.doFilter(servletRequest,servletResponse);
//
//    }
//}
