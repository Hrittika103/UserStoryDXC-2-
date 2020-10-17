package com.userstory;
public class Complaint {
	public int cid;
	public String title;
	public String description;
	public int status;
	public int customerid;
	public Complaint() {
		super();
	}

	public Complaint(int cid ,String title , String description ,int status , int customerid) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.cid=cid;
		this.title=title;
		this.description=description;
		this.status=status;
		this.customerid=customerid;
		
	}

	public String toString() {
		return "Complaint [cid=" + cid + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", customerid=" + customerid + "]";
	}
	
	

}