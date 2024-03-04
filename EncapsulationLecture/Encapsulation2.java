package EncapsulationLecture;
class Dog{
	private String name;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost = cost;
	}
	
	
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setName("Sheru");
		System.out.println(d.getName());
		d.setcost(20000);
		int cost = d.getCost();
		System.out.println(cost);
	}

}
