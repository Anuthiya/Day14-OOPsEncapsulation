package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Chair {
	String brand;
	int price;
	String color;
	public Chair(String brand, int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return brand+" " +price+" "+color;
	}

public static void main(String[] args) {
	Chair c=new Chair("acd",1000,"Red");
	Chair c1=new Chair("edg",2000,"Black");
	//System.out.println(c.brand+ " "+c.price+ " "+c.color);
	//System.out.println(c1.brand+ " "+c1.price+ " "+c1.color);
	System.out.println(c);
	System.out.println(c1);
	}
}


