package Access_Modifiers;

public class StrCOM {

	public static void main(String[] args) {
		String str="Hello World";
		String anotherString = "hello world";
		String s1 ="google";
		String s2 ="google";
		String s3 =new String("google");
		Object objStr =str;
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);

	}

}
