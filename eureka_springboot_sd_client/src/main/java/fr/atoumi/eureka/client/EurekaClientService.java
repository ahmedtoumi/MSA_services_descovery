package fr.atoumi.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientService {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientService.class, args);
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
