package Abstraction;
abstract class Loan{
abstract	public void dispInt() ;
	
	public void welcome() {
		System.out.println("Welcome to xxx bank");
	}
	
}

class HomeLoan extends Loan{

	@Override
	public void dispInt() {
		// TODO Auto-generated method stub
		System.out.println("Rate of interest is 21.5%");
		
	}
	
}

class carLoan extends Loan{

	@Override
	public void dispInt() {
		// TODO Auto-generated method stub
		System.out.println("Rate of interest is 32.5%");

		
	}
	
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1 = new HomeLoan();
		l1.welcome();
		l1.dispInt();
		//We cannot make the object of abstract class 
		//Loan l2= new Loan();

	}

}
