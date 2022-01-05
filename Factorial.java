package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(a<=n) {
			fact=fact*a;
			a++;
		}
		System.out.println("Factorial of a number is: "+fact);
		
	}

}
