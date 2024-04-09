package Class_program;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id, contact, salary,net=0;
        String name,address;
        id=s.nextInt();
        name=s.next();
        s.nextLine();
        address=s.nextLine();
        contact=s.nextInt();
        salary=s.nextInt();
        System.out.println("Salary : "+salary);
        if(salary>40000)
        	net=salary+8000;
        else if(salary>30000)
        	net=salary+7000;
        else if(salary>20000)
        	net=salary+5000;
        else if(salary>10000)
        	net=salary+3000;
        System.out.println("Employee id:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Address:"+address );
        System.out.println("Contact:"+contact);
        System.out.println("Gross Salary:"+net);
        
        
        
        
        
        s.close();
	}

}
