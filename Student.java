package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Student {
	int id;
	String name;
	String branch;
	public Student(int id, String name, String branch) {
		this.id=id;
		this.name=name;
		this.branch=branch;
	
		
	}
	public String toString() {
		//return id+ " "+name+" "+branch;
		return "ID="+id+"NAME="+name+"BRANCH="+branch;

	}

public static void main(String[] args) {
	Student s=new Student(1, "Bhavani","CSE");
	Student s1=new Student(2,"Sathya","Mech");
	//System.out.println(s.id+" "+s.name+ " "+s.branch);
	//System.out.println(s1.id+" "+s1.name+" "+s1.branch);
	System.out.println(s);
	System.out.println(s1);
	
}
}