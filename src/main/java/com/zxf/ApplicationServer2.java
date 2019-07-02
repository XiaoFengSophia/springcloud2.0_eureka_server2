package com.zxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationServer2 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer2.class, args);
		System.out.println("Eureka服务机—2号已启动！！");
	}

}
