package Array;

public class TEmperature {

	public static void main(String[] args) {
		int[] arr= {4,8,16,23,7,10};
		int temp;
		for(int i=0;i<(arr.length-1);i++) {
			

				if(arr[i]>arr[i+1]) {

					temp=arr[i];

					arr[i]=arr[i+1];

					arr[i+1]=temp;
					i=-1;
				}

				}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+" ");
		}

	}

}