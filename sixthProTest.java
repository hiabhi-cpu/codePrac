/*
 * 6.	Given the list of N names, print it based on the alphabetical order of the first letter.
 *  If the first letter of the two names is the same, print it in the order in the array.

 * */


import java.util.Arrays;
import java.util.Scanner;

public class sixthProTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int num=sc.nextInt();
		String[] name=new String[num];
		for(int i=0;i<num;i++) {
			name[i]=sc.next();
		}
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
	}
}