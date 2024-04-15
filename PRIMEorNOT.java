package Access_Modifiers;

import java.util.Scanner;

public class PRIMEorNOT {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
          if(flag==0 && n!=1 ) 
        	  System.out.println(n+" is a Prime Number");
        	  else if(n!=1)
        		  System.out.println(n+" is Not a Prime Number ");
        		  
        	  
          s.close();
         
	}

}
