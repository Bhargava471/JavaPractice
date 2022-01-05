package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		b = n;
		while(n>0) {
			a=n%10;
			n=n/10;
			temp=temp*10+a;
		}
		if(temp==b) {
			System.out.println("Entered number is a palindrome");
		}
		else{
			System.out.println("It is not  Palindrome");
		}
		
	}

}
