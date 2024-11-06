package com.example.ebookcachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EbookCacheDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookCacheDemoApplication.class, args);
	}
}
