package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
	
	
	 @RequestMapping(value="/Insert",method = RequestMethod.POST)
	 public String Insertdetails(
			 @RequestParam(value = "id", required = true) Integer id,
			 @RequestParam(value = "name", required = true) String name,
			 @RequestParam(value = "password", required = true) String password,
			 @RequestParam(value = "firstname", required = true) String firstname,
			 @RequestParam(value = "lastname", required = true) String lastname,
			 @RequestParam(value = "email", required = true) String email,
			 @RequestParam(value = "address", required = true) String address
			 )
	 {
	Employee tmpemp=new Employee();
	tmpemp.id=id;
	tmpemp.name=name;
	tmpemp.password=password;
	tmpemp.firstname=firstname;
	tmpemp.lastname=lastname;
	tmpemp.email=email;
	tmpemp.address=address;
	LoginAppDAO Dao=LoginAppDAO.getInstance();
	boolean b=Dao.CreateConnection();
	Dao.insertdata(tmpemp);
	return "Data Inserted sucessfully";
	 }
	
	 @RequestMapping(value="/deleteuser",method = RequestMethod.POST)
	 public String delete(
			 @RequestParam(value = "id", required = true) Integer id
			 )
	 {
		 LoginAppDAO Dao=LoginAppDAO.getInstance();
			boolean b=Dao.CreateConnection();
			b=Dao.deletedata(id);
			if(b)
		    	return "Deleted User Sucessfully";
	      return "Deleted";
	 }
	 
	 
	 @RequestMapping(value="/validateuser",method = RequestMethod.POST)
	 public String validation(
			 @RequestParam(value = "name", required = true) String name,
			 @RequestParam(value = "password", required = true) String password
			 )
	 {
		 LoginAppDAO Dao=LoginAppDAO.getInstance();
			boolean b=Dao.CreateConnection();
		    b=Dao.validate(name,password);
		    if(b)
		    	return "Valid  User";
	      return "Invalid User";	 
	 }
	 
	 @RequestMapping(value="/getAllDetails",method = RequestMethod.POST)
	 public ArrayList<Employee> Employeedetails()
	 {
	Employee tmpemp=new Employee();
	LoginAppDAO Dao=LoginAppDAO.getInstance();
	boolean b=Dao.CreateConnection();
	ArrayList<Employee> emplist=Dao.retrivedata(); 
	return emplist;
	 }
}
