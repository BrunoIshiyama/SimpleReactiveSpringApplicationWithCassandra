package br.com.simplespringdatareactivewithcassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "br.com.simplespringdatareactivewithcassandra.config")
@ComponentScan(basePackages = {"br.com.simplespringdatareactivewithcassandra.model","br.com.simplespringdatareactivewithcassandra.repository","br.com.simplespringdatareactivewithcassandra.service","br.com.simplespringdatareactivewithcassandra.web"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}