package com.userstory;

import java.sql.Connection;
import java.sql.SQLException;

import junit.framework.TestCase;

public class TestDBCon extends TestCase {
	DBConnector db;
	protected void setUp() throws Exception{
		System.out.println("setup invoked");
		db = new DBConnector();
	}
	protected void tearDown() throws Exception{
		System.out.println("clean up code by tear down");
	}
	public void testGetCon() throws SQLException
	{
		Connection c =db.getCon();
		if(c!=null)
			assertTrue(true);
	}
	

}
