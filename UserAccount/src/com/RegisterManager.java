package com;

import java.sql.Connection;
import java.util.ArrayList;

public class RegisterManager {
	
	
	
	
		public ArrayList<ActionBean> getCourses() throws Exception
		{
		ArrayList<ActionBean> courseList = new ArrayList<ActionBean>();
		DBConnection db = new DBConnection();
		Connection con = db.createConnection();
		RegisterAccess access = new RegisterAccess();
		courseList = access.getEntry(con);
		System.out.println(courseList);
		return courseList;
	
	/*ArrayList<RegisterAction> register=new ArrayList<RegisterAction>();
	DBConnection db=new DBConnection();
	Connection con=db.createConnection();
	RegisterAccess access=new RegisterAccess();
	register=access.getEntry(con);	
	return register;*/
	
	}
	

}
