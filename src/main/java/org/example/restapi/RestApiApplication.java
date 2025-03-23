package org.example.restapi;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        // Load the .env file
        Dotenv dotenv = Dotenv.load();

        // Set system properties for Spring Boot to pick up
        System.setProperty("SPRING_DATASOURCE_URL", dotenv.get("SPRING_DATASOURCE_URL"));
        System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv.get("SPRING_DATASOURCE_USERNAME"));
        System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
        System.setProperty("SPRING_SECURITY_USER_NAME", dotenv.get("SPRING_SECURITY_USER_NAME"));
        System.setProperty("SPRING_SECURITY_USER_PASSWORD", dotenv.get("SPRING_SECURITY_USER_PASSWORD"));

        SpringApplication.run(RestApiApplication.class, args);

    }

}
