package com.naya.ironbankeurika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IronBankEurikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IronBankEurikaApplication.class, args);
	}
}
