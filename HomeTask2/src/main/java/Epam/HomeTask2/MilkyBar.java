package Epam.HomeTask2;

public class MilkyBar extends WhiteChocolate{
	int quantity;
	float price;
	
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
	public MilkyBar(int quantity, float price) {
		super();
		this.quantity = quantity;
		
		this.price = price;
	}
	public MilkyBar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	float calculatePrice(float price, int quanity) {
		// TODO Auto-generated method stub
		return super.calculatePrice(price,quanity);
	}
	
	
}
