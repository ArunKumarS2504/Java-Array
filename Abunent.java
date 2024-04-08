package Array;

import java.util.Scanner;

public class Abunent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int sum=0;
		int num=s.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum=sum+i;
			
		}
		if(sum>num) {
			System.out.println("Abuntant number ");
			
		}
		else {
			System.out.println("Not a Abuntant number ");
		}
		s.close();

	}

}
