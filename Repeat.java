package Array;

public class Repeat {

	public static void main(String[] args) {
		int[] arr = {7, 8, 12, 6, 3, 4, 1, 9, 7, 6, 1, 4};
		int[] result = new int[4];

		result[0] = arr[8];
		result[1] = arr[9];
		result[2] = arr[10];
		result[3] = arr[11];

		
		for (int i = 0; i < 4; i++) {
		    System.out.print(result[i]);
		    if (i < 3) {
		        System.out.print(", ");
		    }
		}



	}

}
