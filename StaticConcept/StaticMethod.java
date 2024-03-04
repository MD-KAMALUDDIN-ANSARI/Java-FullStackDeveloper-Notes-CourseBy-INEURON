package StaticConcept;
class Demo2{
	static int a;
	
	static {
	 a=10;
	}
	static void display(){
		System.out.println(a);
	}
}
public class StaticMethod {
	static void display2() {
		System.out.println("Display2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		Demo2.display();
		//we can use this without refrence because it is in same class
		display2();
		Demo2 d= new Demo2();
		//we can call static method will class name as well as object name
		d.display();

	}

}
