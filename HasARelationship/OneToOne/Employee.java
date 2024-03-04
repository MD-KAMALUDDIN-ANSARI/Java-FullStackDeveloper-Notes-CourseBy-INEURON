package HasARelationship.OneToOne;
class Employee {
	private String empId;
	private String empName;
	private String empAddr;
	
	//HAS-A variable
	Account account;
	
	//Constructor injection
	public Employee(String empId, String empName, String empAddr, Account account) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.account = account;
	}
	
	
	
	public void getEmployeeDetails(){
		System.out.println("Employee Details are ");
		System.out.println("empId : "+ empId);
		System.out.println("empName : " + empName);
		System.out.println("empAddress : "+ empAddr);
		System.out.println("==================================");
		System.out.println("account number "+ account.accNo);
		System.out.println("account name "+ account.accName);
		System.out.println("account type "+ account.accType);
	}
}