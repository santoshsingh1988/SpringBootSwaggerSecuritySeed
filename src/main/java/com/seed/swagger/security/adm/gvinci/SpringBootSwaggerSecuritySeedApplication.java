package com.seed.swagger.security.adm.gvinci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "admgvinci", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
@OpenAPIDefinition(info = @Info(title = "Example API", version = "1.0", description = "Example API to get Dummy Data using Swagger and API is secured "))
public class SpringBootSwaggerSecuritySeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerSecuritySeedApplication.class, args);
	}

}
