package com.shimo.vip.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.config
 * @Description: TODO
 * @date 2018/2/7 19:42
 **/
@Configuration
public class WebConfig {
    @Bean
    public ObjectMapper ObjectMapper(){
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper;
    }
}
