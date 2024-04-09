package Class_program;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'||ch=='o'
				|| ch=='O'||ch=='u'|| ch=='U') {
			System.out.println("Its a Vowel");
			
		}
		else {
			System.out.println("Not a vowel");
		}
		s.close();
			

	}

}
/*      Scanner s= new Scanner(System.in);
          char ch= s.next().charAt(0);
switch(ch) {
case'a':
case'A':
case'e':
case'E':
case'i':
case'I':
case'o':
case'O':
case'u':
case'U':
	System.out.println("vowel");
	break;
	default:
		System.out.println("Not a vowel");
}
s.close();
}
}*/