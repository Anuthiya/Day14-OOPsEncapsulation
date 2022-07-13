package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Bank {
	private String name;
	private String id;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	

public static void main(String args[]) {
	Bank b=new Bank();
	b.setName("ABCDef");
	b.setId("123abc@");
	System.out.println(b.getName()+ " "+b.getId());
}
	
}
