package me.dio.santander_dev_week_2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

/* Esta API foi construida nas seguintes configurações
 * 
 * Spring Boot: 3.3.0v
 * Maven: 3.9.7v
 * Swagger
 * Banco de dados H2
 * Banco de dados Postgres
 * 
 * Link para Diagrama: https://github.com/WallissonAlv/dio-trilha-java-basico/tree/main/SpringBoot/santander-dev-week-2024
 * 
 * 
 * @author WallissonAlv
 * */

@OpenAPIDefinition(
		  servers = {
		    @Server(url = "/myapp/", description = "Default Server URL")
		  }
		)
@SpringBootApplication
public class SantanderDevWeek2024Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2024Application.class, args);
	}

}
