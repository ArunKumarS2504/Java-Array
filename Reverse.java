package Class_program;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("ENter the number :");
		int n=s.nextInt();
		int rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			System.out.print(rem);
			
			
		}
		
		s.close();

	}

}
