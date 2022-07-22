package com.example.fridayproject.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class TimestampFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimestampFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Instant start = Instant.now();
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            Instant finish = Instant.now();
            long time = Duration.between(start, finish).toMillis();
            LOGGER.info("{}: {} ms ", ((HttpServletRequest) servletRequest).getRequestURI(),  time);
        }
    }
}
