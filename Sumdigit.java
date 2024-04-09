package Class_program;
import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		
		//Scanner s= new Scanner(System.in);
		int n= 234;
		int rem,sum1=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum1 += rem;
			
		}
		System.out.println(sum1);
		//s.close();

	}

}
