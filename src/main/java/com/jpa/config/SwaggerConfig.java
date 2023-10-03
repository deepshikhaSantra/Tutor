package com.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {
	@Bean
	OpenAPI openApiInformation() {
		Server localServer = new Server().url("http://localhost:8888/").description("Localhost Server URL");

		Contact contact = new Contact().email("deepshikhasantra2003@gmail.com").name("Deepshikha Santra");

		Info info = new Info().contact(contact).description("Spring Boot 3 + Open API 3+ JPA ")
				.summary("Demo of Spring Boot 3 & Open API 3 Integration").title("Spring Boot 3 + Open API 3")
				.version("V1.0.0").license(new License().name("Know More")
						.url("https://www.linkedin.com/in/majumdar-debargho-415a42187/"));

		return new OpenAPI().info(info).addServersItem(localServer);
	}

}