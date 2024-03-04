package FinalKeywordConcept;
/*
 * whenever we are using final keyword to any class we can inherit that class or extend that class
 * i
 */
/*final*/ class Demo{
	final int a =10;
	
	/*
	 * the moment we put final we can inherit the method but we cannot over ride that method
	 */
	public /*final*/ void disp() {
		// a =20; we cannot re-assign  the value of final variable it will be constant
		
	}
	
}

class Demo1 extends Demo{
	public void disp() {
		
	}
	
}

public class FinalClassMethodVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
