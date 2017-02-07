package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

public class Access
{
public ArrayList<ActionBean> getCourses(Connection con) throws SQLException
{
ArrayList<ActionBean> courseList = new ArrayList<ActionBean>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM user");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
ActionBean courseObj = new ActionBean();

courseObj.setName(rs.getString("name"));
courseObj.setUsername(rs.getString("username"));
courseObj.setPassword(rs.getString("password"));

courseList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return courseList;
 
}
}