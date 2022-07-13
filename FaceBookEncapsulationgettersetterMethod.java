package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class FaceBookEncapsulationgettersetterMethod {
	private String userName;
	private String passWord;
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setPassWord(String passWord) {
		this.passWord=passWord;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	

public static void main(String[] args) {
	FaceBookEncapsulationgettersetterMethod fb=new FaceBookEncapsulationgettersetterMethod();
	fb.setUserName("Bhavani");
	fb.setPassWord("123@a12");
	System.out.println(fb.getUserName()+ " " +fb.getPassWord());
}
	
}
	

