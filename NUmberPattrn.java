package Class_program;

import java.util.Scanner;

public class NUmberPattrn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter the number :");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		s.close();
			

	}

}
