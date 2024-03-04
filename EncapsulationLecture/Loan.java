package EncapsulationLecture;

import java.util.Scanner;

class Farmer{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	static {
		ri=2.5f;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		pa= sc.nextFloat();
		System.out.println("Enter the time duration");
		td =sc.nextFloat();
		//ri = 2.8f;
	}
	
	void compute() {
		si = (pa*td*ri)/100;
	}
	
	void display() {
		System.out.println("SI is : " + si);
	}
}

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		f1.input();
		f1.compute();
		f1.display();
		
		f2.input();
		f2.compute();
		f2.display();
	}

}
