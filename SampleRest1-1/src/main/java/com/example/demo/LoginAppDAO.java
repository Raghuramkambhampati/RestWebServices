package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class LoginAppDAO 
{
	 private Connection con;
	private static LoginAppDAO obj;
	private LoginAppDAO() {}
	 
    public static LoginAppDAO getInstance()
    {
        if (obj==null)
            obj = new LoginAppDAO();
        return obj;
    }

	public boolean CreateConnection()
	{
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","root1234"); 
			// con=DriverManager.getConnection( "jdbc:mysql://aa1b9lbrrjddtlp.csrs2ndmz3ve.us-east-2.rds.amazonaws.com:3306/ebdb?user=root&password=root12345");
		}catch(Exception e){
			System.out.println(e);
		    return false;	
		}   
	  return true;
	}
	
	 boolean insertdata(Employee tmpemp)
	{
		String query= new String("INSERT INTO emp VALUES (?,?,?,?,?,?,?)");
		try 
		{
		PreparedStatement sql=con.prepareStatement(query);
			sql.setInt(1, tmpemp.id);
			sql.setString(2, tmpemp.name);
			sql.setString(3, tmpemp.password);
			sql.setString(4, tmpemp.firstname);
			sql.setString(5, tmpemp.lastname);
			sql.setString(6, tmpemp.email);
			sql.setString(7,tmpemp.address);
			sql.execute();
	    }catch(Exception e){ System.out.println(e);return false;}
	return true;
	}
	
	 
	 boolean validate(String name,String password)
	 {
		 String query= new String("SELECT * FROM emp WHERE USERNAME=? AND PASS=?");
		 ResultSet rs;	
		 try 
			{
			PreparedStatement sql=con.prepareStatement(query);
				sql.setString(1,name);
				sql.setString(2,password);
				rs=sql.executeQuery();
				while(rs.next())
					return true;
		    }catch(Exception e){ System.out.println(e);}
			return false;
	 }
	
	public  ArrayList<Employee> retrivedata()
	 {
	 		
	 		ArrayList<Employee> emplist=new ArrayList<Employee>();
	 		try 
	 		{
	 		PreparedStatement stmt=con.prepareStatement("Select * from emp");
	 		ResultSet rs=stmt.executeQuery();
	 		while(rs.next()) 
	 		{
	 		 Employee tmpemp=new Employee();
	 		 tmpemp.id=rs.getInt(1);
	 	     tmpemp.name=rs.getString(2);
	 	     tmpemp.password=rs.getString(3);
	 	     tmpemp.firstname=rs.getString(4);
	 	     tmpemp.lastname=rs.getString(5);
	 	     tmpemp.email=rs.getString(6);
	 	     tmpemp.address=rs.getString(7);
	 	     emplist.add(tmpemp);
	 		}
	 		}catch(Exception e){ System.out.println(e);}
	 		return emplist;
	 }
}
