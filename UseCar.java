package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class UseCar {
	public static void main(String args[]) {
		Engine e=new Engine(1000,"abd",300);
		Car c=new Car(10000,"Swift",e);
		//System.out.println(e);
		System.out.println(c);
	}

}
class Car {
	private int price;
	private String brand;
	private Engine engine;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public Car(int price,String brand,Engine engine) {
		this.price=price;
		this.brand=brand;
		this.engine=engine;
	}
	public String toString() {
		return brand+" " +price+" "+engine;
	}
}
	
	
	
	
	
class Engine {
	private String brand;
	private int price;
	private int capacity;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
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
	public Engine(int price,String brand,int capacity) {
		this.price=price;
		this.brand=brand;
		this.capacity=capacity;
	}
	public String toString() {
		return price+" " +brand+" "+capacity;
	}
}



	