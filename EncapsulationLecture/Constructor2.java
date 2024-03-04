package EncapsulationLecture;
class ParentA{
	int a,b;
	
	ParentA(){
		a=10;
		b=10;
		System.out.println("Parent constructor");
	}
	
	ParentA(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Parent para Const");
	}
	 
}

class ChildA extends ParentA{
	int x,y;
	 
	ChildA(){
		this(111,222);
		x=10;
		y=20;
	}
	ChildA(int x,int y){
		super(x,y);
		this.x=x;
		this.y=y;
		System.out.println("Child para const");
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA c = new ChildA();
		c.display();
		ChildA c1 = new ChildA();
		c1.display();

	}

}