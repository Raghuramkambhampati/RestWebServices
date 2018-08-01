package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
	
	
	 @RequestMapping("/AllempDetails")
	 public ArrayList<Employee> Employeedetails()
	 {
	Employee tmpemp=new Employee();
	LoginAppDAO Dao=LoginAppDAO.getInstance();
	boolean b=Dao.CreateConnection();
	ArrayList<Employee> emplist=Dao.retrivedata(); 
	return emplist;
	 }
	
}
