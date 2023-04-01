/*
 * 2.	Write a program to accept a four digit number from the user and display its denomination
 * */

public class secondProTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int num=sc.nextInt();
		String str=String.valueOf(num);
		int len=str.length();
		for(int i=0;i<str.length();i++) {
			int sum=(int)(Math.pow(10, len-1));
			int res=Integer.parseInt(String.valueOf(str.charAt(i)))*sum;
			System.out.println(str.charAt(i)+"*"+sum+"="+res);
			len--;
		}
	}
}