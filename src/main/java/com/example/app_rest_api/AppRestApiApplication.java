package com.example.app_rest_api;
//By Alejandro Jimenez
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Products API for Vistula", version= "1.0", description = "Products Information"))
public class AppRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppRestApiApplication.class, args);
    }

}
