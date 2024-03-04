package HasARelationship;
/*
 * the process of injecting the dependent object to the target object is calles dependecy njection
 */
class Engine{//Dependent object
	
	
}

class Car extends Engine{//Target object
	//Has A relationship
	Engine engine;  //instance variable 
	//to be dependency injection the refrence of one class should be in another class
	
}

public class DependencyInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
