package com.hhgasvs.appweb.disciplina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
}
