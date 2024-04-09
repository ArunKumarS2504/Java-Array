package Class_program;

import java.util.Scanner;

public class AMSTRONG {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int sum=0,rem,temp=n;
		String str=String.valueOf(n);
		int len=str.length();
		while(n>0) {
			rem=n%10;
			sum=(int)(sum+Math.pow(rem, len));
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Amstroong Number");
			
		}
		else {
			System.out.println("Not a Amstrong number");
		}
		s.close();

	}

}
