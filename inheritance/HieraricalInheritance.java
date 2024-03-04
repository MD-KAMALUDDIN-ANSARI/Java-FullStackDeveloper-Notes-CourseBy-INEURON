package inheritance;
/*
 * 		in this inheritance different child class have same parent class
 */
class Demo111{
	String name="Mohammad";
	int age=25;
	
	void display() {
		System.out.println("Demo "+ age + " "+ name);
	}
}

class Demo112 extends Demo111{
	
}

class Demo113 extends Demo111{
	
}
/*
 * in this one child is exteding another child even we can call this as a  Hybrid Inheritance
 */
class Demo114 extends Demo112{
	
}


public class HieraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
