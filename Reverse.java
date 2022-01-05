package practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		int a=0;
		int rev=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0) {
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("Reverse of a number is: "+rev);
	}

}
