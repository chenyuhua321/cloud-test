package com.cyh.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Chenyuhua
 * @date 2020/5/23 20:40
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class, args);
    }
}
