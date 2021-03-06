package com.leyou.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年05月31日
 */
@Configuration // 声明 GlobalCorsConfig 是一个配置类
public class GlobalCorsConfig {

    @Bean // @Bean 声明在方法上，将方法的返回值加入Bean容器，代替`<bean>`标签
    public CorsFilter corsFilter() {
        // 1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        // 1) 允许的域，不要写*，否则cookie就无法使用了
        config.addAllowedOrigin("http://manage.leyou.com");
        // 2) 是否发送Cookie信息
        config.setAllowCredentials(true);
        // 3) 允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        // 4) 允许的头信息
        config.addAllowedHeader("*");

        // 2.添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        // 3.返回新的CorsFilter
        return new CorsFilter(configSource);
    }

}
