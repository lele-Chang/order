package com.southwind.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：leleChang
 * @date ：Created in 2020/5/14 14:38
 * @description：Ribbon的RestTemplate模板
 * @modified By：
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
