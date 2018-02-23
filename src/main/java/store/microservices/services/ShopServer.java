package store.microservices.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Run as a micro-service, registering with the Discovery Server (Eureka).
 * <p>
 * @author Ruslan Paluektau
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan("store.microservices.shop")
public class ShopServer {
	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShopServer.class, args);
	}
}
