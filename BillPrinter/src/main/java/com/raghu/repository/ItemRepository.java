package com.raghu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raghu.model.Item;;

public interface  ItemRepository extends MongoRepository<Item,String>
{

}
