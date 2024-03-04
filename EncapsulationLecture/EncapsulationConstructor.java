package EncapsulationLecture;

class Student2{
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
	public Student2() {
		
	}
	public Student2(String name,String city,int age) {
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

public class EncapsulationConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.there is no constructor with out parameter then also we are not getting errors because jvm will give default 
 * construcor.
 * 
 * 2. jvm will give zero parameterized constructor so if we try to pass parameter in constructor without 
 * 	  defining parameterized constrructor then we will get error
 */

Student2 std1 = new Student2("kamal","bangalore",25);
//Now we are getting error now jvm is not giving default parameter it is so because wenever there no constructor 
//defined by the programmer at that time only jvm will give default constructor 
Student2 std = new Student2();
	}

}
