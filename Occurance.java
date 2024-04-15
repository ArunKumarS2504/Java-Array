package Access_Modifiers;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
         System.out.print("Enter the element you want in array :");
         int n=s.nextInt();
         int count=0;
         int[] arr=new int[n];
         System.out.print("Enter the element :");
         for(int i=0;i<n;i++)
        	 arr[i]=s.nextInt();
         System.out.println("Enter the element do you want to "+ "count number of occurance :");
         int search=s.nextInt();
         
         for(int i=0;i<n;i++) {
        	 if(arr[i]==search);
        	 count++;
         }
         if(count<0)
        	 System.out.print("Number of occurance of the element :"+ count);
         else
        	 System.out.print("Number of occurance of the element :"+ count);
         s.close();
	}

}
