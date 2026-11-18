package com.example.sshlearning;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SSH Learning via Elastic Cloud Compute API")
                        .version("1.0.0")
                        .description("Swagger documentation for basic routing endpoints (/get, /post, /update, /delete) hosted on port 8085.")
                        .contact(new Contact().name("Spring Boot Admin")));
    }
}
