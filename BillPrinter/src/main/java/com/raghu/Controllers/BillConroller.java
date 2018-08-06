package com.raghu.Controllers;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.model.Bill;
import com.raghu.model.Item;
import com.raghu.repository.BillRepository;

@RestController
@RequestMapping("/Bill")
public class BillConroller {

	@Autowired
	BillRepository billrepository;
	
	//Create
	@RequestMapping(value="/insert",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insert( @RequestBody Bill bill)
	{
		billrepository.save(bill);
	}
	//Read
	@RequestMapping(value="/getbill/{id}",method=RequestMethod.GET)
	public Optional<Bill> getBill(@PathVariable("id") String id)
	{
		return billrepository.findById(id);
	}
	//upadte
	@RequestMapping(value="/updatebill",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Bill bill)
	{
		billrepository.save(bill);
	}
	//Delete
	@RequestMapping(value="/deletebill/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id)
	{
		billrepository.deleteById(id);
	}
	//Gettotal
	@RequestMapping(value="/bill",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public int gettotal(@RequestBody Bill bill)
	{
		int total=0;
		billrepository.save(bill);
		Iterator<Item> itr=bill.getItems().iterator();
		while(itr.hasNext())
			total=total+itr.next().getPrice();
		return total;
	}
}
