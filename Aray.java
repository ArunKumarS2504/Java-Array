package Class_program;

import java.util.Scanner;

public class Aray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		int n=s.nextInt();
		int arr[]= new int[n]; 
		System.out.println("Enter the array elements one by one :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
			System.out.println("Array elements are stored in memory :");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		s.close();
		
	}
	
}
/*int[] arr = {10,20,30,40,50};  //integer array

//arraay- homogeneous data type -same data type
 for(int index=0;index<arr.length;index++) {
	 System.out.println("arr[" + index +"]=" +arr[index]);
 }*/