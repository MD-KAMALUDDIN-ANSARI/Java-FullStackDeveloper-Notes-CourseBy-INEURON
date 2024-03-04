package inheritance;
class Plane{
	
	public void takeOff() {
		System.out.println("flight take off");
	}
	public void fly() {
		System.out.println("It is flying");
	}
	
	public void landing() {
		System.out.println("Landed");
	}
}

class CargoPlane extends Plane {
	public void fly() {
		System.out.println("Cargo plane flyes at lower height");
	}
	
	public void carryGoods() {
		System.out.println("Cargo plane carries goods");
	}
}

class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("Passenger  plane flyes at higher height");
	}
	
	public void carryPassenger() {
		System.out.println("Passenger plane carries passenger");
	}
}

public class DifferentMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		
		
		cp.takeOff();//inherited method
		cp.fly();//overridden method
		cp.carryGoods();//specialized method
		cp.landing();//inherited method
		
		pp.takeOff();
		pp.fly();
		pp.carryPassenger();
		pp.landing();

	}

}
