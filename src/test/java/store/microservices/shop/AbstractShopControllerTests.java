package store.microservices.shop;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import store.microservices.exceptions.ShopNotFoundProductException;
import store.microservices.shop.Product;
import store.microservices.shop.ShopController;

public abstract class AbstractShopControllerTests {

	protected static final String Product_1_NAME = "Chair";
	protected static final BigDecimal Product_1_PRICE = new BigDecimal("50.00");

	@Autowired
	ShopController shopController;

	@Test
	public void validProduct() {
		Logger.getGlobal().info("Start validProductNumber test");
		Product Product = shopController.byProductName(Product_1_NAME);

		Assert.assertNotNull(Product);
		Assert.assertEquals(Product_1_PRICE, Product.getPrice());
		Logger.getGlobal().info("End validProduct test");
	}
	
	@Test
	public void invalidProductName() {
		try {
			Logger.getGlobal().info("Start validProductNumber test");
			Product Product = shopController.byProductName("yuis");
			Assert.fail("Expected an ProductNotFoundException");
		} catch (ShopNotFoundProductException e) {
			// Worked!
		}
	}

}
