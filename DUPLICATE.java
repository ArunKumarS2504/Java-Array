package Access_Modifiers;

import java.util.Scanner;

public class DUPLICATE {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number :");
	int n=s.nextInt();
	int arr[]=new int[n];
	int temp[]=new int[n];
	int replaceIndex=0,i,j,flag;
	for(i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	temp[replaceIndex++]=arr[0];
	for (i=0;i<n;i++) {
		flag=0;
		for(j=i+1;j<n;j++) {
			if (arr[j]!=arr[i]) {
				break;
			}
		}
		for (int k=0;k<replaceIndex;k++) {
			if(temp[k]==arr[i]) 
				flag=1;
			}
		if(flag==0)
			temp[replaceIndex++]=arr[i];
		i=j-1;
		}
	for(i=0;i<replaceIndex;i++)
		System.out.print(temp[i]+" ");
	s.close();
	}
	
}