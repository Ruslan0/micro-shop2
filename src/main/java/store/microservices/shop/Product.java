package store.microservices.shop;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Persistent account entity with JPA markup. Accounts are stored in an H2
 * relational database.
 * 
 * @author Ruslan Paluektau
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productName;

	private BigDecimal price;

	private Integer count;

	/**
	 * Default constructor for JPA only.
	 */

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
