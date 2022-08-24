package application;

import java.util.Locale;

import entities.Product;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Product product_01 = new Product("Margarina", 45.12, 57);
		
		product_01.productInfo();
		System.out.printf("Total value in stock: R$%.2f\n", product_01.totalValueInStock());
		product_01.addProducts(3);
		System.out.printf("Total value in stock: R$%.2f\n", product_01.totalValueInStock());
		product_01.productInfo();
		product_01.removeProducts(61);
		product_01.productInfo();
		product_01.removeProducts(60);
		System.out.printf("Total value in stock: R$%.2f\n", product_01.totalValueInStock());
	}

}
