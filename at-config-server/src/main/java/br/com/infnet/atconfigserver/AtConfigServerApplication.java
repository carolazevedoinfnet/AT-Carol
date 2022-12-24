package br.com.infnet.atconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AtConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtConfigServerApplication.class, args);
	}

}
