package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Car1 {
	private int price;
	private String brand;
	private Engine1 engine;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setEngine(Engine1 engine) {
		this.engine=engine;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Engine1 getEngine() {
		return engine;
	}
	public Car1(int price,String brand,Engine1 engine) {
		this.price=price;
		this.brand=brand;
		this.engine=engine;
	}
	public String toString() {
		return brand+" " +price+" "+engine;
	}
}