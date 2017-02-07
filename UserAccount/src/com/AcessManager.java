package com;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
 

 
public class AcessManager
{
public ArrayList<ActionBean> getCourses() throws Exception
{
ArrayList<ActionBean> courseList = new ArrayList<ActionBean>();
DBConnection db = new DBConnection();
Connection con = db.createConnection();
Access access = new Access();
courseList = access.getCourses(con);
return courseList;
}
}
