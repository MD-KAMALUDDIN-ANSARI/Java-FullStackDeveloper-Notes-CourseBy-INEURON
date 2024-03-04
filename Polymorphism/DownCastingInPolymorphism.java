package Polymorphism;
class Parent2{
	public void cry() {
		System.out.println("Parent is crying");
	}
}

class Child11 extends Parent2{
	
	public void cry() {
		System.out.println("Child11 cries loudly");
	}
	
	public void eat() {
		System.out.println("Child11 eats less");
	}
	
}


class Child12 extends Parent2{
	
	public void cry() {
		System.out.println("Child11 cries less");
	}
	
	public void eat() {
		System.out.println("Child12 eats More");
	}
}
public class DownCastingInPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent2 c1 = new Child11();
		c1.cry();
		/*
		 * we cannot call specialized method of child class with refrence tupe of parent class 
		 * so in order to access the specialized method of child we will do downcasting as sgown below 
		 */
		//c1.eat();   this is not allowed
		((Child11)c1).eat();
		

	}

}
