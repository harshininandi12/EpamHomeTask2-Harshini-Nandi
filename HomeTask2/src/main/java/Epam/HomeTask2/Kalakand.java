package Epam.HomeTask2;

public class Kalakand extends Sweets{
	int quantity; 
	float  price;
	
	@Override
	float calculatePrice(float price, int quanity) {
		// TODO Auto-generated method stub
		return 0;
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
	public Kalakand(int quantity,  float price) {
		super();
		this.quantity = quantity;
		
		this.price = price;
	}
	
	public Kalakand() {
		super();
	}
}
