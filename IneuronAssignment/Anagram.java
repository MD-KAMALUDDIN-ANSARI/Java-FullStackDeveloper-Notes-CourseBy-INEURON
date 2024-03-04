package IneuronAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings to check anagram");
		String str1 =sc.nextLine();
		String str2 = sc.nextLine();
		str1=str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[]  arr1 =  str1.toCharArray();
		char[]  arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		str1= new String(arr1);
		str2 = new String(arr2);
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("it is anagram");
		}
		else {
			System.out.println("It is not anagram");
		}
		
		//String s ="";
		/*for(int i=0;i<str1.length();i++) {
			s=s+(char)((int)str1.charAt(i)-32);
		}
		System.out.println(s);*/

	}

}
