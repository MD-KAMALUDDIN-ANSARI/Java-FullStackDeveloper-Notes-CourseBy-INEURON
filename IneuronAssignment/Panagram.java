package IneuronAssignment;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check Panagram");
		String str = sc.nextLine().toUpperCase();
		 str = str.replace(" ", "");
		char[] chr = str.toCharArray();
		int[] arr =  new int[26];
		boolean flag=true;
		for(int i=0;i<chr.length;i++) {
			int index = chr[i]-65;
			arr[index]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("It is not panagram");
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println("It is panagram");
		}
sc.close();
	}

}
