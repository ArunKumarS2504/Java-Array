package Array;

import java.util.Scanner;

public class MIXEDseries {
     static void method(int n) {
    	 int fact,number=1,even=2;
 		for(int i=1;i<=n;i++) {
 			if(i%2!=0) {
 				fact=1;
 				for(int j=1;j<=number;j++) {
 					fact=fact*j;
 					
 				}
 				number++;
 				System.out.print(fact+" ");
 			}
 			else {
 				System.out.print(even+" ");
 				even +=2;
 			}
 		}
     }
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		method(n);
         s.close();
	}

}
