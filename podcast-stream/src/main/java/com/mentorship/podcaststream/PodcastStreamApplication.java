package com.mentorship.podcaststream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PodcastStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodcastStreamApplication.class, args);
	}

}
