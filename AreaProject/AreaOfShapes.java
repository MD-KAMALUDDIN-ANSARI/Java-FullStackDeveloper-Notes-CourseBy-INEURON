package AreaProject;

import java.util.Scanner;

abstract class Shapes{
	float area;
	abstract public void input();
	abstract public void compute();
	
	public void disp() {
		System.out.println("The area is "+ area);
	}
}

class Rectangle extends Shapes{
	float length;
	float breadth;
	//float area;
	public void input() {
		System.out.println("Enter the Length and breadth of Rectangle");
		Scanner sc = new Scanner(System.in);
		length =sc.nextFloat();
		breadth =  sc.nextFloat();
	}
	public void compute() {
		area = length*breadth;
	}
	
	/*public void disp() {
		System.out.println("The arrea is "+ area);
	}*/
}

class Square extends Shapes{
	float length;
	//float area;
	public void input() {
		System.out.println("Enter the Length of Square");
		Scanner sc = new Scanner(System.in);
		length =sc.nextFloat();
		
	}
	public void compute() {
		area = length*length;
	}
	/*public void disp() {
		System.out.println("The arrea is "+ area);
	}*/
}

class Circle extends Shapes{
	float radius;
	final float pi = 3.14f;
	//float area;
	public void input() {
		System.out.println("Enter the radius of circle");
		Scanner sc = new Scanner(System.in);
		radius =sc.nextFloat();
	}
	public void compute() {
		area = pi*radius*radius;;
	}
	
	/*public void disp() {
		System.out.println("The arrea is "+ area);
	}*/
}
class Geometry{
	public void Permit(Shapes s) {
		s.input();
		s.compute();
		s.disp();
	}
}


public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square s = new Square();
		
	/*	r.input();
		r.compute();
		r.disp();
		
		c.input();
		c.compute();
		c.disp();
		
		s.input();
		s.compute();
		s.disp();
		*/
		
		Geometry g = new Geometry();
		g.Permit(r);
		g.Permit(s);
		g.Permit(c);
	}

}
