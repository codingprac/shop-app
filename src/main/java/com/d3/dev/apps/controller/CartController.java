package com.d3.dev.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d3.dev.apps.model.Cart;
import com.d3.dev.apps.repo.CartRepository;

@RestController
public class CartController {

    @Autowired
    private CartRepository repository;

    /*@RequestMapping("/colleagues/{name}")
    public List<Products> getRecognition(@PathVariable("name") String name){
        return repository.findByName(name);
    }*/

    @RequestMapping("/cart")
    public List<Cart> getCart(){
        return repository.findAll();
    }

    /*@PostMapping("/colleagues")
    public ResponseEntity<String> addColleague(@RequestBody Colleague colleague){
        repository.save(colleague);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //This is of course a very naive implementation! We are assuming unique names...
    @DeleteMapping("/colleagues/{name}")
    public ResponseEntity<String> deleteColleague(@PathVariable  String name){
        List<Colleague> colleagues = repository.findByName(name);
        if(colleagues.size() == 1) {
            Colleague colleague = colleagues.get(0);
            repository.delete(colleague);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }*/
}
