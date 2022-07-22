package com.example.fridayproject.config;

import com.example.fridayproject.filter.SetDecimalFIlter;
import com.example.fridayproject.filter.TimestampFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<SetDecimalFIlter> setDecimalFilterConfiguration() {
        FilterRegistrationBean<SetDecimalFIlter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new SetDecimalFIlter());
        registrationBean.addUrlPatterns("/api/decimal/setDecimal");
        registrationBean.setOrder(2);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<TimestampFilter> TimestampFilterConfiguration() {
        FilterRegistrationBean<TimestampFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new TimestampFilter());
        registrationBean.addUrlPatterns("/api/number/getCalculatedValues");
        registrationBean.setOrder(1);
        return registrationBean;


    }
}
