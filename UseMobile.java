package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery(1000,"samsung",5000);
		Mobile2composition m=new Mobile2composition("vivo",30000,b);
		System.out.println(m);
		System.out.println(b);
	}

}
