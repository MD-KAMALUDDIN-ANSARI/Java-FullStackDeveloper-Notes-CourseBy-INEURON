package inheritance;
/*
 * in this there is a level of parent and chile class like a layers for example may father has a father and his 
 * his father has a father
 */

class Demo11{
	String name="Mohammad";
	int age=25;
	
	void display() {
		System.out.println("Demo "+ age + " "+ name);
	}
}

class Demo12 extends Demo11{
	
}

class Demo13 extends Demo12{
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo13 demo =  new Demo13();
		demo.display();

	}

}
