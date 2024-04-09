package Class_program;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first,second;
		double result=0;
		char ch;
		System.out.print("Enter the first number:");
		first=s.nextInt();
		System.out.print("Enter the second number:");
		second=s.nextInt();
		System.out.print("Enter the operator(+,-,*,/): ");
		ch=s.next().charAt(0);
		switch(ch) {
		case'+':
			result =first+second;
			break;
		case'-':
			result =first-second;
			break;
		case'*':
			result = first*second;
			break;
		case'/':
			result =first/second;
			break;
	    default:
	    	System.out.println("Error! Opreator is not correct");
	    	
		}
         /*int=%d/%i
          * double=%f
          * char=%c
          * String=%s
          * float=%f
          */
		
		System.out.println(first+ " "+ch+" "+second+" = "+ result);
		
	    s.close();
	
	}
	

}
