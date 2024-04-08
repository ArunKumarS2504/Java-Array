package Array;

import java.util.Scanner;

public class NEW {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N ,R,L;
		R=s.nextInt();
		N=s.nextInt();
		L=s.nextInt();
		 if (N >= L && N <= R) {
	            System.out.println("yes");
	        } else {
	            System.out.println("no");
	        }
			s.close();
		}

	}


