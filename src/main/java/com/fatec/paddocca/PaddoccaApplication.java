package com.fatec.paddocca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PaddoccaApplication implements WebMvcConfigurer  {

	public static void main(String[] args) {
		SpringApplication.run(PaddoccaApplication.class, args);
	}

}
