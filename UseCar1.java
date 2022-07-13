package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class UseCar1 {
	public static void main(String args[]) {
		Engine1 e=new Engine1(1000,"abcd",1000);
		Car1 c=new Car1(10000,"Swift",e);
		System.out.println(e);
		System.out.println(c);
	}

}
