package HasARelationship;

class Course{
	
	String cId;
	String cName;
	int cCost;
	
	//construction injection
	public Course(String cId, String cName, int cCost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCost = cCost;
	}
		
}

class Student1{
	private String sName;
	private String sId;
	private String sAddr;
	//HAS-A Relationship 
	Course[] course;
	
	//Constructor injection
	public Student1(String sName, String sId, String sAddr, Course[] course) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sAddr = sAddr;
		this.course = course;
	}
	
	public void getDetails() {
		System.out.println("Student Details Are: ");
		System.out.println("Student ID : " + sId);
		System.out.println("Student Name : " + sName);
		System.out.println("Student Address : " + sAddr);
		System.out.println("Course Details Are");
		for(Course cc: course) {
			System.out.println("Course Id "+ cc.cId);
			System.out.println("Course Name  is :"+cc.cName);
			System.out.println("Course Cost is :"+ cc.cCost);
		}
		System.out.println("-----------------------------------");
		
	}
	
}

public class ManyToManyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1 = new Course("110", "JAVA", 2000);
		Course c2 = new Course("111", "C++", 3000);
		Course c3 = new Course("112", "BlockChain", 4000);
		
		Course[] course = new Course[3];
		course[0] =c1;
		course[1] =c2;
		course[2] =c3;
		
		
		Student1 s1 = new Student1("Dhoni", "07", "CSK", course);
		Student1 s2 = new Student1("Kohli", "18", "RCB", course);
		Student1 s3 = new Student1("Afridi", "10", "KKR", course);
		
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		

	}

}
