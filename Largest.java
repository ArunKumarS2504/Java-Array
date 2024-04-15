package Access_Modifiers;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Largest element :"+max);
		s.close();
		

	}

}
