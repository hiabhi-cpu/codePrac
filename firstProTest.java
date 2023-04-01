/* 
 * 1.	Write a program to accept a five digit number from the user,
 *  increment each digit by one and display the number (digit 9 gets incremented to 0).
 * */

import java.util.Scanner;

public class firstProTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res*10+(rem+1)%10;
			num/=10;
		}
//		System.out.println(res);
		while(res>0) {
			System.out.print(res%10);
			res/=10;
		}
	}
}