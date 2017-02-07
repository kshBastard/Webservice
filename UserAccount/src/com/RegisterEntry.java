package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.RegisterAction;
import com.google.gson.Gson;
import com.sun.istack.internal.NotNull;

@Path("/register")
public class RegisterEntry {
	
	

    @GET
    @Path("/viewRegister")
    @Produces({"application/json"})
    public String getRegister()
    {
    String register = null;
    ArrayList<ActionBean> RegList = new ArrayList<ActionBean>();
    try
    {
    	RegList = new RegisterManager().getCourses();
    	System.out.println("regentety"+RegList);
    Gson gson = new Gson();
    register = gson.toJson(RegList );
    } catch (Exception e)
    {
    e.printStackTrace();
    }
    return register;
    }
    
    
    
    
    
   String fname, Lastname, image, mobile, EmailId, visittype, Idcardtype, 
   Idcardnumber, Address, Representing, Remark, Visitpurpose, persontomeet,
   time, duration, Area, material1, serialNo1, material2, serialNo2;
    @Path("/addRegister")
    @POST
    @WebMethod
    @Produces (MediaType.APPLICATION_JSON) 
    public String RegisteEntry(@NotNull @BeanParam RegisterAction bean)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vms143", "root", "java");
            String query = "insert into entryFrom"+"(fname, Lastname, image, mobile, EmailId, visittype, Idcardtype, Idcardnumber, Address, Representing, Remark, Visitpurpose, persontomeet, time, duration, Area, material1, serialNo1, material2, serialNo2) VALUES"+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,fname);
            st.setString(2,Lastname);
            st.setString(3,image);
            st.setString(4,mobile);
            st.setString(5,EmailId);
            st.setString(6,visittype);
            st.setString(7,Idcardtype);
            st.setString(8,Idcardnumber);
            st.setString(9,Address);
            st.setString(10,Representing);
            st.setString(11,Remark);
            st.setString(12, Visitpurpose);
            st.setString(13,persontomeet);
            st.setString(14,time);
            st.setString(15, duration);
            st.setString(16, Area);
            st.setString(17,material1);
            st.setString(18,serialNo1);
            st.setString(19,material2);
            st.setString(20,serialNo2);
        
           
            st.executeUpdate();  
            
            System.out.println("Data insert :  "+fname+" "+Lastname+" "+image);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return"Record inserted successfully";
    }
    }

    



