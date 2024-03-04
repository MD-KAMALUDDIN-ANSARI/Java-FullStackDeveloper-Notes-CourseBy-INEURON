package InnerClass;

public class FirstCode {
	A obj1= new A();
	/*
	 * we cannot call the method directly we  have to call it from inside method
	 */
	//obj1.config();
	
	public void show() {
		System.out.println("IN SHOW");
		obj1.config();
	}

	class A {
		public void config() {
			System.out.println("In config ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstCode obj = new FirstCode();
		obj.show();
	}

}
