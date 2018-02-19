package store.microservices.services.shop;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import store.microservices.shop.ShopConfiguration;

/**
 * Run as a micro-service, registering with the Discovery Server (Eureka).
 * <p>
 * Note that the configuration for this application is imported from
 * {@link ProductsConfiguration}. This is a deliberate separation of concerns.
 * 
 * @author Ruslan Paluektau
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(ShopConfiguration.class)
public class ShopServer {

	protected Logger logger = Logger.getLogger(ShopServer.class.getName());

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		// Tell server to look for Products-server.properties or
		// Products-server.yml
		System.setProperty("spring.config.name", "shop-server");

		SpringApplication.run(ShopServer.class, args);
	}
}
