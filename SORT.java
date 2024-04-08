package Array;

public class SORT {

	public static void main(String[] args) {
		int[] arr= {1,5,3,9};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		 for(int j=i+1;j<arr.length;j++) { 
			 System.out.print(arr[j]+" ");
			 
			 if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				System.out.println(temp);
			}
			}
		}
		
		}
	}

	
