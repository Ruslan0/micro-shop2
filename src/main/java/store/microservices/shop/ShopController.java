package store.microservices.shop;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import store.microservices.exceptions.ProductNotFoundException;

/**
 * A RESTFul controller for accessing Product information.
 * 
 * @author Ruslan Paluektau
 */
@RestController
public class ShopController {

	protected Logger logger = Logger.getLogger(ShopController.class
			.getName());

	/**
	 * Fetch an Product with the specified Product name.
	 * 
	 * @param productName
	 *            A String, 50 symbols Product name.
	 * @return The Product if found.
	 * @throws ProductNotFoundException
	 *             If the name is not recognised.
	 */
	@RequestMapping("/shop/{productName}")
	public Product byProductName(@PathVariable("productName") String productName) {

        RestTemplate restTemplate = new RestTemplate();
        Product product = null;
		try { 
	        product = restTemplate.getForObject("http://localhost:4444/products/"+productName, Product.class);
		} catch (HttpStatusCodeException e) {
			throw new ProductNotFoundException(productName);
		}         
		return product;
	}
}
