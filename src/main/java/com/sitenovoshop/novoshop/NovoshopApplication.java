package com.sitenovoshop.novoshop;

import com.sitenovoshop.novoshop.models.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovoshopApplication.class, args);
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.addShoppingCart();
	}

}
