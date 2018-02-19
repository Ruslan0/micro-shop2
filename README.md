# store-services


## Using an IDE

You can run the system in your IDE by running the three servers in order: _RegistrationService_, _ProductsService_ and _ShopService_.

Open the Eureka dashboard [http://localhost:1111](http://localhost:1111) in your browser to see that the `PRODUCT-SERVICE` and `SHOP-SERVICE` applications have registered.  
Next open the Demo Page [http://localhost:4444](http://localhost:4444) in and click one of the demo links.
Next open the Demo Page [http://localhost:2222](http://localhost:2222) in and click one of the demo links.

The `localhost:4444` web-site is being handled by a Spring MVC Controller in the _ProductsService_ application.
The `localhost:2222` web-site is being handled by a Spring MVC Controller in the _ShopService_ application.

## Command Line

You may find it easier to view the different applications by running them from a command line since you can place the three windows side-by-side and watch their log output

To do this, open three CMD windows (Windows) or three Terminal windows (MacOS, Linux) and arrange so you can view them conveniently.

 1. In each window, change to the directory where you cloned the demo
 1. In the first window, build the application using `mvn clean package -DskipTests` (if you want using tests you may run two servers _RegistrationService_, _ProductsService_)
 1. In the same window run: `java -jar store-microservices-1.1.0.RELEASE.jar registration` and wait for it to start up
 1. Switch to the second window and run: `java -jar store-microservices-1.1.0.RELEASE.jar products` and again wait for
 it to start up
 1. In the third window run: `java -jar store-microservices-1.1.0.RELEASE.jar shop`
 1. In your favorite browser open the same three links: [http://localhost:1111](http://localhost:1111) , [http://localhost:4444](http://localhost:4444) and [http://localhost:2222](http://localhost:2222) 

You should see servers being registered in the log output of the first (registration) window.

