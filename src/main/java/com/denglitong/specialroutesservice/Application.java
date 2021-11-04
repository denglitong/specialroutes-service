package com.denglitong.specialroutesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/11/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
