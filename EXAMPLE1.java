package Array;

import java.util.Scanner;

public class EXAMPLE1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row :");
		int row =s.nextInt();
        System.out.print("Enter the column :");
        int col=s.nextInt();
        int a[][]=new int [row][col];
        System.out.println("Enter the matrix one by one :");
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		a[i][j]=s.nextInt();
        		
        	}
        }
        System.out.println("Arrray matrix A element :");
        for(int i=0;i<row;i++) {
     	   for(int j=0;j<col;j++) {
     		   System.out.print(a[i][j]+" ");
	}
       System.out.println();
       s.close();
}
}
}