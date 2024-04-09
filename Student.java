package Class_program;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,m1, m2,m3, total, average;
		String name;
		System.out.print(" Enter the student id :");
		id=s.nextInt();
		System.out.print(" Enter the student name :");
		name=s.next();
		System.out.print("Mark 1 :");
        m1=s.nextInt();
        System.out.print("Mark 2 :");
        m2=s.nextInt();
        System.out.print("Mark 3 :");
        m3=s.nextInt();
        total=m1+m2+m3;
        average=total/3;
        System.out.println("Total ="+ total);
        System.out.println("Average ="+ average);
        if(average>=90) {
        	System.out.println("Remarks : Excellant");
        }
        else if(average>=80) {
        	System.out.println(" Remarks : Very good");
        }
        else if(average>=70) {
        	System.out.println("remarks : Good");
        }
        else if(average>=60) {
        	System.out.println("Remarks : Haas to improve");
        	
        }
        else if(average>=50) {
        	System.out.println("remarks : Work hard");
        }
        else {
        	System.out.println("Fail");
        	
        }
        s.close();
	}

}
