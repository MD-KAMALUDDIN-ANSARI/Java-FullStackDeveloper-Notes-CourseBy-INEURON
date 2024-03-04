package InnerClass;
class A{
	
	public void show() {
		System.out.println("It is in show");
	}
	
	class B{
		public void config() {
			System.out.println("It is config");
		}
	}
}

public class SecondCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.show();
		
	//	A.B obj1 = new A.B();  this can be done only when the inner class is static 
		
		A.B obj1 =  obj.new B();
		obj1.config();
		

	}

}
