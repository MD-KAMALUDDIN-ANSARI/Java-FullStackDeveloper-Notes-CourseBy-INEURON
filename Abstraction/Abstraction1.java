package Abstraction;



abstract class Plane{
	
	abstract public void takeOff(); 
	abstract public void fly(); 
	
	abstract public void landing();
}

class CargoPlane extends Plane {
	public void fly() {
		System.out.println("Cargo plane flyes at lower height");
	}
	
	public void takeOff() {
		System.out.println("flight take off");
	}
	
	public void landing() {
		System.out.println("Landed");
	}
}
	
	class Airport {
		public void permit(Plane plane) {
			plane.takeOff();
			plane.fly();
			plane.landing();
			
		}
	}
	

	


class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("Passenger  plane flyes at higher height");
	}
	public void takeOff() {
		System.out.println("flight take off");
	}
	public void landing() {
		System.out.println("Landed");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		//this is called polymorphism because here with one reference we are using multiple objects
		//i.e 1 to many relation
		Airport a = new Airport();
		a.permit(cp);
		a.permit(pp);
		/*cp.takeOff();//inherited method
		cp.fly();//overridden method
		cp.carryGoods();//specialized method
		cp.landing();//inherited method
		
		pp.takeOff();
		pp.fly();
		pp.carryPassenger();
		pp.landing();*/

	}

}

