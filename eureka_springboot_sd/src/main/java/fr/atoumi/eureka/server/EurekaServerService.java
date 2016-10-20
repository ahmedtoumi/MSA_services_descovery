package fr.atoumi.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerService {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerService.class, args);
	}
}
