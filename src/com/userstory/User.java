package com.userstory;

import java.util.List;


import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer per = new Person();
		Scanner sc = new Scanner(System.in);
		char k;
		do {
			
			System.out.println("press 1 to view all customers ");
			System.out.println("press 2 to select a customer-id to view its complaint ");
			System.out.println("press 3 to view the status of a complaint ");
			System.out.println("press 4 to register a new complaint with new user");
			System.out.println("press 5 to register a new complaint with old user ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			       List<Customer> clist = per.viewAllCustomer();
					for (Customer c :clist)
					{
						System.out.println(((Person)c).id+" "+((Person)c).name);
						
					}
					
					break;
		case 2:
					System.out.println("Enter theid:");	
					
					  int id = sc.nextInt();
					  List<Complaint> list = per.viewComplaintsById(id);
					  for (Complaint com:list)
					  {
						  System.out.println(com.cid+" "+com.title+" "+com.description+" "+com.status+" "+com.customerid);
					  }
		            break;	
		case 3 :
					System.out.println("Enter the complaintid:");
					int cid=sc.nextInt();
					Complaint comp=per.viewComplaintStatus(cid);
					if(comp.status==0)
					{
						System.out.println("Your complaint title is "+comp.title+" and your status is finished"+comp.status);
					}
					else
					{
						System.out.println("Your complaint title is "+comp.title+" and your status is under process "+comp.status);
					}
					break;
		case 4 :
			System.out.println("Enter the id:");
			int id2 = sc.nextInt();
			System.out.println("Enter the customer name:");
			String name= sc.next();
			System.out.println("Enter the complaintid:");
			int cid1 = sc.nextInt();
			System.out.println("Enter the title:");
			String title = sc.next();
			System.out.println("Enter the description:");
			sc.nextLine();
			String description=sc.next();
			Complaint com = new Complaint(cid1,title, description, 1, id2);
			Person p = new Person(id2, name,com);
			boolean b = per.launchComplaintWithNewUser(p);
			if(b)
			{
				System.out.println("Complaint registered");
			}
			else
			{
				System.out.println("Invalid response");
			}
			break;
			
			
		case 5:
			System.out.println("Enter the id:");
			int oid = sc.nextInt();
			System.out.println("Enter the customer name:");
			String oname= sc.next();
			System.out.println("Enter the complaintid:");
			int ocid1= sc.nextInt();
			System.out.println("Enter the title:");
			String otitle = sc.next();
			System.out.println("Enter the description:");
			sc.nextLine();
			String odescription=sc.next();
			Complaint ocom = new Complaint(ocid1,otitle, odescription, 1, oid);
			Person op = new Person(oid, oname,ocom);
			boolean b1 = per.launchComplaintWithOldUser(op);
			if(b1)
			{
				System.out.println("Complaint registered");
			}
			else
			{
				System.out.println("Invalid response");
			}
			break;
			
					default:
						break;
		}

						System.out.println("Press Y for main menu");
						k=sc.next().charAt(0);
						
		}  
		  while(k=='Y'||k=='y');
				}
				
}
