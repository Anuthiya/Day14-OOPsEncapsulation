package trainingday14OOPsENCAPSULATIONCTOSCOMP;

public class Employee {
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

public static void main(String[] args) {
	Employee emp=new Employee (1,"Nilan",10000);
	Employee emp1=new Employee(2,"John",20000);
	System.out.println(emp.id+" "+emp.name+" "+emp.salary);
	System.out.println(emp1.id+" "+emp1.name+" "+emp1.salary);
}
}