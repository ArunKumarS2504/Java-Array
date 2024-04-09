package Class_program;

import java.util.Scanner;

public class Technumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int len=0,num;
		//convert into string
        String str = String.valueOf(n);
        len = str.length();
        if(len==4) {
        	num=(n/100)+(n%100);
        	if(num*num==n) {
        		System.out.println("Tech Number");
        	}
        	else {
        		System.out.println("Not a Tech Number");
        	}
        }
        else {
        	System.out.println("Not a vallid number");
        }
        
        s.close();

	}

}
