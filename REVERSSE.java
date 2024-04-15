package Access_Modifiers;

public class REVERSSE {

	public static void main(String[] args) {
		
		String string= "abcdefg 1234";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse :"+string);
		System.out.println("String after reverse :"+reverse);
		String input ="abcdef";
		char[] try1 = input.toCharArray();
		for(int i = try1.length-1;i>=0;i--);
		System.out.println(try1);
		System.out.println();
	}

}
