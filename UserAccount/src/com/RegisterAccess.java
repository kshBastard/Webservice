package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

public class RegisterAccess
{
public ArrayList<ActionBean> getEntry(Connection con) throws SQLException
{
ArrayList<ActionBean> courseList = new ArrayList<ActionBean>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM entryFrom");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
ActionBean courseObj = new ActionBean();

courseObj.setFname(rs.getString("fname"));
courseObj.setLastname(rs.getString("Lastname"));
courseObj.setImage(rs.getString("image"));
courseObj.setEmailId(rs.getString("mobile"));
courseObj.setMobile(rs.getString("EmailId"));
courseObj.setVisittype(rs.getString("visittype"));
courseObj.setIdcardtype(rs.getString("Idcardtype"));
courseObj.setIdcardnumber(rs.getString("Idcardnumber"));
courseObj.setAddress(rs.getString("Address"));
courseObj.setRepresenting(rs.getString("Representing"));
courseObj.setRemark(rs.getString("Remark"));
courseObj.setVisitpurpose(rs.getString("Visitpurpose"));
courseObj.setPersontomeet(rs.getString("persontomeet"));
courseObj.setTime(rs.getString("time"));
courseObj.setDuration(rs.getString("duration"));
courseObj.setArea(rs.getString("Area"));
courseObj.setMaterial1(rs.getString("material1"));
courseObj.setSerialNo1(rs.getString("serialNo1"));
courseObj.setMaterial2(rs.getString("material2"));
courseObj.setSerialNo2(rs.getString("serialNo2"));

courseList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return courseList;
 
}
}