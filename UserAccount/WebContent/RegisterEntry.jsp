<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/register/addRegister" method="post" >
Firstname:<input name="fname" type="text"><br/>
LastName:<input name="Lastname" type="text"><br/>
image:<input name="image" type="text"><br/>
mobile:<input name="mobile" type="text"><br/>
Emailid:<input name="Emailid" type="text"><br/>
VistType:<input name="VistType" type="text"><br/>
IDCard Type:<select name="IDCard Type"><br/>
  <option value="volvo">ADDHAR</option>
  <option value="saab">PAN</option>
  <option value="mercedes">Lisene</option>
  <option value="audi">Voting</option>
</select><br/>
Idcardnumber:<input name="Idcardnumber" type="text"><br/>
Address:<input name="Address" type="text"><br/>
Representing:<input name="Representing" type="text"><br/>

Remark:<input name="Remark" type="text"><br/>
Visitpurpose:<select name="Visitpurpose"><br/>
  <option value="volvo">Interview</option>
  <option value="saab">Meeting</option>
  <option value="mercedes">Client</option>

</select><br/>
persontomeet:<input name="persontomeet" type="text"><br/>
Time<input name="time" type="text"><br/>
duration<input name="duration" type="text"><br/>
Area<input name="Area" type="text"><br/>
material1<input name="material1" type="text"><br/>
serialNo1<input name="serialNo1" type="text"><br/>
material2<input name="material2" type="text"><br/>
serialNo2<input name="serialNo2" type="text"><br/>

<input type="submit" value="Submit">
</body>
</html> 