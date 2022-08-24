package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		if(quantity >= 0) {
			this.quantity = quantity;			
		} else {
			System.out.println("It's not possible set this product with negative numbers.");
		}
	}
	
	public void productInfo(){
		System.out.printf("%s\n", this.name);
		System.out.printf("R$%.2f\n", this.price);
		System.out.printf("Quantity: %d\n\n", this.quantity);
	}
	
	public double totalValueInStock(){
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		if(quantity >= 0) {
			this.quantity += quantity;
			System.out.printf("Added %d quantities.\n", quantity);
		} else {
			System.out.println("It's not possible to add a negative number of products.");
		}
	}
	
	public void removeProducts(int quantity) {
		if(quantity >= 0){
			if(this.quantity - quantity >= 0) {
				this.quantity -= quantity;
				System.out.printf("Removed %d quantities.\n", quantity);
			} else {
				System.out.printf("It cannot remove %d products!\n", quantity);
			}
		} else {
			System.out.println("It's not possible to add a negative number of products.\n");
		}
	}
}
