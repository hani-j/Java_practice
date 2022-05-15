package com.example.filter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@Slf4j
//@Component
@WebFilter(urlPatterns = "/api/user/*")
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 전처리
        // buffer 을 한 번 읽으면 다시 읽을 수 없어서 caching 사용
        ContentCachingRequestWrapper httpServletRequest = new ContentCachingRequestWrapper((HttpServletRequest)request);
        ContentCachingResponseWrapper httpServletResponse = new ContentCachingResponseWrapper((HttpServletResponse)response);
        // 길이만 담고 있고 값을 담고 있지 않음
        String url = httpServletRequest.getRequestURI();

        chain.doFilter(httpServletRequest, httpServletResponse);
        // doFilter 후에야 값을 담음

        // 후처리
        // req
        String reqContent = new String(httpServletRequest.getContentAsByteArray());
        log.info("request url : {}, request body : {}", url, reqContent);

        String resContent = new String(httpServletResponse.getContentAsByteArray());
        int httpStatus = httpServletResponse.getStatus();

        // body 값이 없음
        httpServletResponse.copyBodyToResponse();
        log.info("response status : {}, responseBody : {}",httpStatus, resContent);
    }
}
