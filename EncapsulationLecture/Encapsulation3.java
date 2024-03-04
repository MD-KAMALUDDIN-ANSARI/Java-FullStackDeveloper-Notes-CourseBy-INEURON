package EncapsulationLecture;
class Student1{
	private String name;
	private String city;
	private int age;
	
	/*public void setData(String name,String city,int age) {
		this.name = name;
		this.city=city;
		this.age=age;
		
	}*/
	//in place of writing setters we can us constructor this is a shortcut for setting values.
	//constructor is called whenever the object is created and it should be same as classs name and there is no 
	//return type.
	public Student1(String name,String city,int age) {
		this.name = name;
		this.city=city;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	
	
}
public class Encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1 = new Student1("kamal","bangalore",25);
		//st1.setData("kamal", "bangalore", 25);
		

	}

}
