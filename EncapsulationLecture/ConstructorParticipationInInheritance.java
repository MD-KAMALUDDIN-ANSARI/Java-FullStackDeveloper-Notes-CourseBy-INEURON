package EncapsulationLecture;
class parent11{
	 parent11(){
		System.out.println("Parent constructor");
	}
}

class child11 extends parent11{
	/*
	 * child11(){
	 * whenever we will create the object of child class this constructor will be called it has a super() method
	 * so it will go to parent class constructor and that constructor will be called .
	 * 
	 * super();
	 * 
	 * }
	 */
	
	void display() {
		System.out.println("child class");
	}
}
public class ConstructorParticipationInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child11 c= new child11();
		c.display();

	}

}
