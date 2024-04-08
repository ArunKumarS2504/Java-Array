package Array;

public class MARTIX {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
		}; 
		int col=a[0].length;
		int row =a.length;		
      // System.out.println(a[0].length);//column
       //System.out.println(a.length);//row
      // System.out.println(a[2][2]);
       for(int i=0;i<row;i++) {
    	   for(int j=0;j<col;j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();   
       }
       
	}
}


