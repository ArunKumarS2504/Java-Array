package Access_Modifiers;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		int temp,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.element you want in array (min 2) :");
		 n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements :");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest :"+a[n-2]);
		System.out.println("smallest :"+a[0]);
		s.close();
	}

}
