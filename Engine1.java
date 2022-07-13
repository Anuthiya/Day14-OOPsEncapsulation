package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Engine1 {
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
		public Engine1(int price,String brand,int capacity) {
			this.price=price;
			this.brand=brand;
			this.capacity=capacity;
		}
		public String toString() {
			return brand+" "+price+" "+capacity;
		}
	}


