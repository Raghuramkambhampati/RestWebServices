package com.raghu.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.model.Item;
import com.raghu.repository.ItemRepository;

@RestController
@RequestMapping("/Item")
public class ItemController 
{
	@Autowired
	ItemRepository itemRepository;
	
	//Create
	@RequestMapping(value="/insert",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Item item)
	{
		System.out.println("Ininsert");
		itemRepository.save(item);
	}
	
	@RequestMapping(value="/insert1",method=RequestMethod.GET)
	public String create1()
	{
		System.out.println("Ininsert1");
		return "insert1method";
	}
	
	
	//Read
	@RequestMapping(value="/retrieve/{id}",method=RequestMethod.GET)
	public Optional<Item> read(@PathVariable("id") String id)
	{
		
		return itemRepository.findById(id);
	}
	
	
	//Update
	@RequestMapping(value="/update",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Item item)
	{
		itemRepository.save(item);
	}

	
	//Delete
	@RequestMapping(value="/remove/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id)
	{
		itemRepository.deleteById(id);
	}
	
	
	
}
