package inheritance;
class Demo{
	String name="Mohammad";
	int age=25;
	
	void display() {
		System.out.println("Demo "+ age + " "+ name);
	}
	
}

class Demo1 extends Demo{
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		d1.display();
	}

}
