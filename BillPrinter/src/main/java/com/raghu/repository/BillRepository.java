package com.raghu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raghu.model.Bill;

public interface BillRepository extends MongoRepository<Bill,String>
{

}
