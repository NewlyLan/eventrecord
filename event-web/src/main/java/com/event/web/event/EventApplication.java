package com.event.web.event;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 18:27
 * @description
 * @version: v1.0
 * 事件服务
 */
@SpringBootApplication
@MapperScan("com.event.dao")
public class EventApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventApplication.class);
    }
}
