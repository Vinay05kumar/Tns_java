package construction;

import java.util.Scanner;

import construction.Customer;

// main class
public class Constomerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		 Customer c=new  Customer();
		 c.setCustomername(name);
		 c.setCustomeraddress(address);
		 c.setCustomerid(id);
		 
		 System.out.println(c);
		 
		 boolean output=c instanceof Customer;
		 System.out.println(output);
		 
		
	}

}

