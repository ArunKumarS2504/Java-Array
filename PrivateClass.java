package Access_Modifiers;

class base{
        public int a=10;
        public int b=20;
        void display() {
	         System.out.println("a ="+a);
	         System.out.println("b ="+b);
       }
}
public class PrivateClass {
	 private int x=10;
     public int y=20;

	public static void main(String[] args) {
		base obj=new base();
		PrivateClass AK=new PrivateClass();
		System.out.println("a ="+obj.a);
		System.out.println("b ="+obj.b);
		

		obj.display();
		System.out.println("x ="+AK.x);
		System.out.println("y ="+AK.y);
		
		
	}

}
