package com.example.fridayproject.filter;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class SetDecimalFIlter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        String decimalPlaces = httpRequest.getHeader("decimalPlaces");
        System.out.println("XD");
        if(!Arrays.asList("1","2","3","4").contains(decimalPlaces)){
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            httpResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            httpResponse.setContentType(MediaType.APPLICATION_JSON.toString());
            httpResponse.getWriter().write("{\"errorMessage\": \"Wrong value\"}");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}