package Epam.HomeTask2;

public class SemiSweetChocolate extends Sweets{
float calculatePrice(float price, int quanity) {
		
		return price * quantity;
	}
	public SemiSweetChocolate(int quantity,  float price) {
		super();
		this.quantity = quantity;
		
		this.price = price;
	}
	public SemiSweetChocolate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}