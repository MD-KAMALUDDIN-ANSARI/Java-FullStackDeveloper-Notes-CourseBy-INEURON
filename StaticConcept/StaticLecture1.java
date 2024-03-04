package StaticConcept;

class Demo{
	static int a;
	static int b;
	
	
	static {
		System.out.println("Static block");
		a=10;
		b=20;
	}
	static void dispaly() {
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;
	int y;
	{
		 x=10;
		 y =20;
		System.out.println("Non static block");
	}
	/*
	 * Whenever we will create the boject the constructor will take the above java blocks 
	 * and execute them then it will execute its own body 
	 */
	Demo(){
		System.out.println("constructor");
	}
	void Display1() {
		System.out.println(x);
		System.out.println(y);
	}
}

public class StaticLecture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.dispaly();
		Demo d1 =  new Demo();
		d1.Display1();
		
	}

}
