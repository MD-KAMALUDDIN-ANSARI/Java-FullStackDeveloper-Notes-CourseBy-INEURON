package IneuronAssignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome");
		String str =  sc.nextLine();
		String s= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println(s);
		if(str.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}

	}

}
