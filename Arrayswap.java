package Array;

import java.util.Scanner;

public class Arrayswap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		System.out.println(str1[1]+" "+str1[0]);
        s.close();
	}

}
