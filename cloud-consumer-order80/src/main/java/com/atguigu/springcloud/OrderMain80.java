package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/3
 * @time: 20:15
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain80.class, args);
	}
}
