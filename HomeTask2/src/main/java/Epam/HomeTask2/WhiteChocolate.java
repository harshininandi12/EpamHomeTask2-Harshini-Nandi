package Epam.HomeTask2;

public class WhiteChocolate extends Sweets{
float calculatePrice(float price, int quanity) {
		
		return price * quantity;
	}
	public WhiteChocolate(int quantity,  float price) {
		super();
		this.quantity = quantity;
		
		this.price = price;
	}
	public WhiteChocolate() {
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

