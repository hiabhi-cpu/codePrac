/**
 * 7.	Implement a browser that shows the current page it is in.
You have 3 commands
1)”forward”: It goes to the forward page if there is any else it returns the link of the current
page. If the browser is on the home page it prints “HOME”.
2)”backward”: It goes to the back page and prints the link to that page. If the browser is on the
home page then it prints “HOME”
3)”goto”: It goes to the link mentioned and prints the link of the current page.
The first or default page in the browser is the “HOME” page
 * 
 */

import java.util.Scanner;

public class sevenProTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int page=0;
		String url="";
		while(n>0) {
			String str=sc.next();
			switch (str) {
			case "forward": {
				if(url.compareTo("")==0) {
					System.out.println("Home");
				}
				else if(page==0) {
					System.out.println(url);
					page++;
				}
				else {
					System.out.println(url);
				}
				break;
			}
			case "backward": {
				if(url.compareTo("")==0) {
					System.out.println("Home");
				}
				else if(page==1) {
					System.out.println("Home");
					page--;
				}
				break;
			}
			case "goto" : {
				url=sc.next();
				page++;
				System.out.println(url);
				break;
			}
			default:{
				throw new IllegalArgumentException("Unexpected value: " + str);
				}
			}
			n--;
		}
	}
}