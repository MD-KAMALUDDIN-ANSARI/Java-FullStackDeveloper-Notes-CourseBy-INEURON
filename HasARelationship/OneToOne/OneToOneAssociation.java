package HasARelationship.OneToOne;

public class OneToOneAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account  = new Account("ABC123", "Sachin", "Saving");
		Employee emp = new Employee("IND10", "Sachin", "MI", account);
		
		emp.getEmployeeDetails();

	}

}
