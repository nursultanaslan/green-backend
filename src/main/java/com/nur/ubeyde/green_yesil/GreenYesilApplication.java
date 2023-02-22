package com.nur.ubeyde.green_yesil;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(title = "Green||Yeşil API Document",
				version = "0.1",
				description = "Green plant blog and shopping"))
public class GreenYesilApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenYesilApplication.class, args);
	}

}
