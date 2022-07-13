package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Mobile2composition {
	private String brand;
	private int price;
	private Battery battery;
	
	public void setBrand(String brand) {
	this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBattery(Battery battery) {
	this.battery=battery;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Battery getBattery() {
		return battery;
	}
	public Mobile2composition(String brand,int price,Battery battery) {
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}
	public String toString() {
		return brand+" "+price+" "+battery;
	}
}



