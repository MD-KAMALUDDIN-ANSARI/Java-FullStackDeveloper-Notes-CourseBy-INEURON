package inheritance;

class Interest{
	
}

class InterestPersonalLoan extends Interest{
	
}

class Loan{
	public Interest interest() {
		Interest it = new Interest();
		return it;
		
	}
}
/*
 * Since the return type we cannot change of overridden method but here we are able to change because of 
 * Co-variant data type it means we are returning object .
 */
class PersonalLoan extends Loan{
	public InterestPersonalLoan interest() {
		InterestPersonalLoan ipl = new InterestPersonalLoan();
		return ipl;
	}
}

public class CoVariantREturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
