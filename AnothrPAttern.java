package Class_program;

import java.util.Scanner;

public class AnothrPAttern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
	        System.out.println();
		}
		s.close();
	}

}
