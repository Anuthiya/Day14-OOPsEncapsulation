package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Battery {
	private int price;
	private String brand;
	private int capacity;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public Battery(int price,String brand,int capacity) {
		this.price=price;
		this.brand=brand;
		this.capacity=capacity;
	}
	public String toString() {
		return price+" "+brand+" "+capacity;
	}
}
	
