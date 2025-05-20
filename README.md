# REST API Application by Alejandro Jimenez

This is a simple REST API built with Spring Boot.
- Create a new project from scratch using Spring Initializr in Intellij.
- Create packages and classes marked with annotations: @Component,
@Controller/@RestController, @Service, @Repository, @Indexed.
- Launch the project and send a request in the form of JSON using
Postman or Swagger.
- response analysis.

## Features

- RESTful endpoints
- Basic CRUD operations
- Built with Spring Boot
- No frontend

## Prerequisites

- Java 17+
- Maven

## Project Structure

    src/
     └── main/
         ├── java/
         │   └── com/example/app
         └── resources/
             └── application.properties


## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/Alejandro2718/app_REST-API.git
   cd app_REST-API
2. Build and run the app
   ```bash
    mvn spring-boot:run
3. App will start in:
    http://localhost:8080
