package com.d3.dev.apps.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.d3.dev.apps.model.Cart;

public interface CartRepository extends MongoRepository<Cart, String> {
	
	    public List<Cart> findAll();
	    
	}
