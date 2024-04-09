package Class_program;

import java.util.Scanner;

public class Peterson {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		
		int  num=0, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit);
            n =n/ 10;
		}
		if(sum==num) {
			System.out.println("Peterson number");
			
		}
		else {
			System.out.println("Not Peterson number");
			
		}
		s.close();
		}
		

	}


