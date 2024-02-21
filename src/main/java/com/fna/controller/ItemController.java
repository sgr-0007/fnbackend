package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Item;

import com.fna.service.ItemService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	private ItemService itemservice;
	
	@PostMapping("/item")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return itemservice.saveItem(item); 
    } 
	
	@GetMapping("/item")
    public ResponseEntity<List<Item>> findAllItemview() {     
	return itemservice.getItemnative();
    }
	
//	@GetMapping("/itemtable")
//    public ResponseEntity<List<Item>> Itemnative() {     
//	return itemservice.getItemnative();
//    }
	
	@GetMapping("/item/{id}")
    public ResponseEntity<Item> findItemById(@PathVariable(value = "id") int itemid) {     
	return itemservice.getItemById(itemid);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable(value = "id") int itemid,
	         @RequestBody Item item) {    	
       return itemservice.updateItem(itemid,item);
   }
    
    @GetMapping("/checkitemuniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	return itemservice.checkUnique(id,name);

    }

}
