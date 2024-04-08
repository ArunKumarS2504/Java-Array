package Array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=s.nextInt();
		
		int temp = n,reverse=0,rem;
		while(n>0) {
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(temp==reverse) {
			System.out.println("Palinrome");
		}
			else {
				System.out.println("Not a palindrome");
		}
		
		s.close();	
	}

}
