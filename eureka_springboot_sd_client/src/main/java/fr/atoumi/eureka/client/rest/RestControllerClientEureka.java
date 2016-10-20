package fr.atoumi.eureka.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
@RestController
public class RestControllerClientEureka {

	@LoadBalanced
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping({ "/test", "/test/" })
	String restTest() throws Exception {
		return "TEST";
	}

	@RequestMapping({ "/infos", "/" })
	String restInfos() throws Exception {
		System.out.println("Ahmed Toumi");
		final String retour = restTemplate.getForObject(
				"http://SERVICE-CLIENT-EUREKA/test", String.class);
		return retour;
	}
}
