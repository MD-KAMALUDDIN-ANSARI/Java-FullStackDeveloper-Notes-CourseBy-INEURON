package StaticConcept;
class Demo1{
	int a ;
	int b;
	static int count;
	/*
	 * we have to use the count in all the constructor then only we will get the proper result
	 * so in order to solve the issue we will use count variable in java not static block so wehnever 
	 * a constructor is called then constructor will include these count in it 
	 */
	
	//First this block will be executed then constructor
	{
		count++;
		System.out.println("non static block");
	}
	Demo1(){
		this(100);
		System.out.println("first constructor");
		//count++;
	}
	Demo1(int a){
		System.out.println(a);
		this.a =a;
		//count++;
	}
	Demo1(int a ,int b){
		this.a=a;
		this.b=b;
		//count++;
	}
}
public class pgmToCountNumberofObjectCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In this the value of count will be 1 only but we have created 3 object so it should be 3
		 * so in other to use it in single memory we wil use static keyword so that memory will be created 
		 * once and value of count will get incremened when we create new object
		 */
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1(10);
		Demo1 d3 = new Demo1(10,20);
		System.out.println(Demo1.count);

	}

}
