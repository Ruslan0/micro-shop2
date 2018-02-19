package store.microservices.services;

import store.microservices.services.shop.ShopServer;

/**
 * Allow the servers to be invoked from the command-line. The jar is built with
 * this as the <code>Main-Class</code> in the jar's <code>MANIFEST.MF</code>.
 * 
 * @author Ruslan Paluektau
 */
public class Main {

	public static void main(String[] args) {

		ShopServer.main(args);
	}

}
