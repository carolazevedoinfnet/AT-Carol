package br.com.infnet.ataluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AtAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtAlunoApplication.class, args);
	}

}
