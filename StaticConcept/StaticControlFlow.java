package StaticConcept;

public class StaticControlFlow {
	static int a ;
	static int b;
	static {
		System.out.println("Static block");
		a=10;
		b=20;
	}
	static void display(){
		System.out.println("Static block method");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		/*
		 * before calling this method we will run the program it will give output as 
		 * static block
		 * main method
		 *  so we can see without even calling static block and main method is executed 
		 */
		display();
	}

}
