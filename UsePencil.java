package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class UsePencil {
	public static void main(String[] args) {
		Rubber r=new Rubber(5,"Apsara");
		Pencil p=new Pencil(10,"NAtraj","Pink",r);
		System.out.println(p);
	}
}

 class Pencil {
	private int price;
	private String color;
	private String brand;
	private Rubber rubber;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setRubber(Rubber rubber) {
		this.rubber=rubber;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public Rubber getRubber() {
		return rubber;
	}
	public Pencil (int price,String brand,String color,Rubber rubber) {
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.rubber=rubber;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+rubber;
	}
}
	
class Rubber {
	private String brand;
	private int price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int Price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Rubber(int price, String brand) {
		this.brand=brand;
		this.price=price;
	}
	public String toString() {
		return brand+" " +price;
	}
}




