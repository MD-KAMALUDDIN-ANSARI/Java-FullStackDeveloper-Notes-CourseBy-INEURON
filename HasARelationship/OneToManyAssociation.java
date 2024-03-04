package HasARelationship;

class Employee{
	 String empId;
	 String empName;
	 String empAddr;
	public Employee(String empId, String empName, String empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
	}
	
	
}

class Department{
private String depId;
private String depName;

Employee[] emps;



public Department(String depId, String depName, Employee[] emps) {
	super();
	this.depId = depId;
	this.depName = depName;
	this.emps = emps;
}



public void getDepartMentDeails() {
	System.out.println("Department  Details are ");
	System.out.println("Department Id : "+ depId);
	System.out.println("Department Name : " + depName);
	System.out.println("==================================");
	System.out.println("Employee Details Are ");
	for(Employee empp:emps) {
		System.out.println("Employee ID "+ empp.empId);
		System.out.println("Employee Name "+empp.empName);
		System.out.println("Employee Address "+empp.empAddr);
		System.out.println();
	}
}

}

public class OneToManyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("10","Afridi","KKR");
		Employee e2 = new Employee("11","Dhoni","CSK");
		Employee e3 = new Employee("12","Kohli","RCB");
		Employee[] emps = new Employee[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		Department d1 = new Department("111", "IPL", emps);
		
		d1.getDepartMentDeails();
		

	}

}
