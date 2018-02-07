package com.shimo.vip;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip
 * @Description: TODO
 * @date 2018/2/7 14:17
 **/
@SpringBootApplication
@ComponentScan(basePackages = "com.shimo.vip.**")
@MapperScan("com.shimo.vip.dao")
public class VipApplication extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class, args);
    }

}
