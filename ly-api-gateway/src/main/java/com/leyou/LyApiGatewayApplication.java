package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年05月31日
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LyApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyApiGatewayApplication.class, args);
    }

}
