/*
 * 5.	Write a program to accept the lower bound number and
 *  the upper bound number from the user and print the prime numbers between them.
 * */

import java.util.Scanner;

public class fourthProTest{
	
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		int c=2;
		while(c*c<=num) {
			if(num%c==0) {
				return false;
			}
			c++;
		}
		return c*c>num;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the upper bound:");
		int up=sc.nextInt();
		System.out.print("Enter the lower bound:");
		int lo=sc.nextInt();
		System.out.print("Prime number between "+up+" and "+lo+" : ");
		for(int i=up;i<=lo;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
}