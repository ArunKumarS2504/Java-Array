package Access_Modifiers;

import java.util.Scanner;

public class ODDEVEN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		int odd[]=new int[n];
		int even[]=new int[n];
		int even_index=0,odd_index=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
				even[even_index++]=arr[i];
			else
				odd[odd_index++]=arr[i];
			
		}
		System.out.println("ODD :");
		for(int i=0;i<odd_index;i++) {
			System.out.print(odd[i]+" ");
		}
        System.out.println("Even :");
        for(int i=0;i<even_index;i++) {
        	System.out.print(even[i]+" ");
        }
        s.close();
	}
	

}
