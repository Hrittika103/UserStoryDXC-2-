package com.userstory;

import java.util.List;

public  class Person implements Customer{
	public int id;
	public String name;
	public Complaint c ;
	
	public Person() 
	{
		super();
		
	}
	UserDao u =new UserDao();
	    
	
		
	public Person(int id, String name, Complaint c) {
			super();
			this.id = id;
			this.name = name;
			this.c = c;
		
		}
	
	
	public List<Customer> viewAllCustomer() {
	   List<Customer> list = u.viewAllCustomer();
		return list;
	}

	public List<Complaint> viewComplaintsById(int id) {
		System.out.println("Watch here");
		List<Complaint> list = u.viewComplaintsById(id);
	
	      return list;
	}

	public Complaint viewComplaintStatus(int id) {
		// TODO Auto-generated method stub
		Complaint comp = u.viewComplaintStatus(id);
		return comp;
	}
	
	public boolean launchComplaintWithNewUser(Person p) {
		// TODO Auto-generated method stub
		boolean b = u.registerComplaintWithNewUser(p);
		return b;
	}
	
	

	public boolean launchComplaintWithOldUser(Person p) {
	
		boolean b = u.registerComplaintWithOldUser(p);
		return b;
	}
	
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", c=" + c + "]";
	}
	
	

}
