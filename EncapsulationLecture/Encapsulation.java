package EncapsulationLecture;

class Student{
	//We can access the members of this class frm another class which is not good .so to provide security we will usse 
	//private keyword and to access those keyword we will generate getters and setters method
	private String name;
	private String city;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/*void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}

	void setCity(String city) {
		this.city=city;
	}
	String getCity() {
		return city;
	}

	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return age;
	}*/
	 	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setName("kamal");
		System.out.println(st.getName());

	}

}
