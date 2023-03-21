//package com.example.textquest.controller;
//
//import com.example.textquest.entities.Content;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
//@WebFilter(filterName = "simpleFilter", value = "/logic", servletNames = "special")
//public class FirstFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//	ServletContext context = filterConfig.getServletContext();
//	FilterRegistration registration2 = context.getFilterRegistration("secondFilter");
//	registration2.addMappingForUrlPatterns(null, true, "/logic");
//	registration2.addMappingForServletNames(null, true, "special");
//
//	FilterRegistration registration22 = context.getFilterRegistration("thirdFilter");
//	registration22.addMappingForUrlPatterns(null, true, "/logic");
//	registration22.addMappingForServletNames(null, true, "special");
//    }
//
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//	int level= Content.getLevel();
//	if (level <=1){ String path = "/logic";
//	    ServletContext servletContext = servletRequest.getServletContext();
//	    RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//	    requestDispatcher.forward(servletRequest, servletResponse);}
//	filterChain.doFilter(servletRequest,servletResponse);
//    }
//}
