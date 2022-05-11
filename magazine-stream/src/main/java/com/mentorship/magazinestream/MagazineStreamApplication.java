package com.mentorship.magazinestream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MagazineStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagazineStreamApplication.class, args);
	}

}
