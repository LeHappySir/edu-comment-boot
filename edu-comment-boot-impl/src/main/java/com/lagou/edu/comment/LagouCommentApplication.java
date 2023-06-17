package com.lagou.edu.comment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * LagouCommentApplication
 *
 * @author xianhongle
 * @data 2022/6/4 19:38
 **/
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients("com.lagou.edu")
public class LagouCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(LagouCommentApplication.class,args);
    }

}
