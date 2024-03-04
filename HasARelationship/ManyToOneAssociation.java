package HasARelationship;
class Branch{
	String branchId;
	String branchName;
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
}

class Student{
	private String stdId;
	private String stdName;
	private String stdAddr;
	
	Branch branch;

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAddr() {
		return stdAddr;
	}

	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}

public class ManyToOneAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch branch = new Branch();
		branch.setBranchId("111");
		branch.setBranchName("IPL");
		
		
		Student s1 = new Student();
		s1.setStdId("10");
		s1.setStdName("Dhoni");
		s1.setStdAddr("csk");
		s1.setBranch(branch);
		
		Student s2 = new Student();
		s2.setStdId("10");
		s2.setStdName("Dhoni");
		s2.setStdAddr("csk");
		s2.setBranch(branch);
		Student s3 = new Student();
		s3.setStdId("10");
		s3.setStdName("Dhoni");
		s3.setStdAddr("csk");
		s3.setBranch(branch);
		
		
		System.out.println("Studet Details Are  ");
		System.out.println("Std is " + s1.getStdId());
		System.out.println("Student name "+ s1.getStdName());
		System.out.println("Student Address "+ s1.getStdAddr());
		System.out.println("Student Branch "+ s1.getBranch().getBranchId());
		System.out.println("Student Branch "+ s1.getBranch().getBranchName());
		System.out.println();
		
		//System.out.println("Studet Details Are  ");
		System.out.println("Std is " + s2.getStdId());
		System.out.println("Student name "+ s2.getStdName());
		System.out.println("Student Address "+ s2.getStdAddr());
		System.out.println("Student Branch "+ s2.getBranch().getBranchId());
		System.out.println("Student Branch "+ s2.getBranch().getBranchName());
		System.out.println();
		
		//System.out.println("Studet Details Are  ");
		System.out.println("Std is " + s3.getStdId());
		System.out.println("Student name "+ s3.getStdName());
		System.out.println("Student Address "+ s3.getStdAddr());
		System.out.println("Student Branch "+ s3.getBranch().getBranchId());
		System.out.println("Student Branch "+ s3.getBranch().getBranchName());
		//System.out.println();

	}

}
