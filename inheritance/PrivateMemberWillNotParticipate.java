package inheritance;

class parent{
	private String name;
	
	void display() {
		System.out.println("parent");
	}
}

class child extends parent{
	void diplay2() {
name = "kamaluddin"; // private members doesnot participate in inheritance
	}
}
public class PrivateMemberWillNotParticipate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
