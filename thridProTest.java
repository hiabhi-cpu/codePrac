/*
 * 3.	Write a program to accept a number from the user and count the number of digits in the number.
 * */

import java.util.Scanner;
public class thirdProTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextInt();
		System.out.println((int)Math.log10(num)+1);
	}
}