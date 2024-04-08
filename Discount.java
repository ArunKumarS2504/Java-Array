package Array;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int k=s.nextInt();
		for(int i=0;i<n;i++) {
		if(arr[i]%k==0) 
			System.out.print("1 ");
		else 
			System.out.print("0 ");
		}
      s.close();
	}

}
