package com.example.demo;

public class Employee {
	public	Integer id;
	public String name;
	public String password;
	public String firstname;
	public String lastname;
	public String email;
	public String address;
	
	public Employee(Integer id,String name,String password,String firstname,String lastname,String email,String address) 
	{
		this.id=id;
		this.name=name;
		this.password=password;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.address=address;
	}
	public Employee()
	{
		
	}
}
