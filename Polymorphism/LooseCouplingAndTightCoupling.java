package Polymorphism;
class Parent{
	public void cry() {
		System.out.println("Parent is crying");
	}
}


class child1 extends Parent{
	public void cry() {
		System.out.println("child1 is crying");
	}
}

class child2 extends Parent{
	public void cry() {
		System.out.println("child2 is crying");
	}
}

public class LooseCouplingAndTightCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The below example is for method over riding in this the refrence type of object is same 
		 * thats y it is called tight coupling
		 * the refrence type should be same of object type but in one case we can change the refrence type
		 * when the reference type is of parent class that is called loose coupling
		 * 
		 * if we do loose coupling we can acheive polymorphism
		 */
		child1 c1 = new child1();
		c1.cry();
		//parent kamal= new child1();
		child2 c2 = new child2();
		c2.cry();
		
		
		Parent ref;//we are using ref to call cry() method of both the child this indicates 1 code can be used many types
		ref =c1;//
		ref.cry();
		
		ref =c2;
		ref.cry();
		

	}

}
