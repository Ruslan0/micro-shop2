package store.microservices.shop;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import store.microservices.services.shop.ShopServer;

/**
 * Imitates the {@link ShopServer}, but without using any of the discovery
 * client code. Allows the test to use the same configuration as the
 * <code>ShopServer</code> would.
 * 
 * @author Ruslan Paluektau
 *
 */
@SpringBootApplication
class ShopMain {
	public static void main(String[] args) {
		// Tell server to look for Shop-server.properties or
		// Shop-server.yml
		System.setProperty("spring.config.name", "Shop-server");
		SpringApplication.run(ShopMain.class, args);
	}
}

/**
 * Spring Integration/System test - by using @SpringApplicationConfiguration
 * instead of @ContextConfiguration, it picks up the same configuration that
 * Spring Boot would use.
 * 
 * @author Ruslan Paluektau
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShopMain.class)
public class ShopControllerIntegrationTests extends AbstractShopControllerTests {

}
