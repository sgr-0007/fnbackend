package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Item;

import com.fna.repository.ItemRepository;


@Service
public class ItemService {

	@Autowired
	private ItemRepository itemrepository; 

//    @Autowired
//    private ItemviewRepository itemviewrepository; 
	
	public ResponseEntity<Item> saveItem(Item item) {		
		try {
			itemrepository.save(item);
			return new ResponseEntity<>(item, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Item>> getItem() {
	   try 
	   {
		List<Item> itemview = new ArrayList<Item>();        
		itemrepository.findAll().forEach(itemview::add);
        if(itemview.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(itemview,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	
	public ResponseEntity<List<Item>> getItemnative() {
		   try 
		   {
			List<Item> itemview = new ArrayList<Item>();        
			itemrepository.Itemnative().forEach(itemview::add);
	        if(itemview.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(itemview,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Item> getItemById(int itemid) {
		Optional<Item> itemidData = itemrepository.findById(itemid);
		if (itemidData.isPresent()) {
			return new ResponseEntity<>(itemidData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Item> updateItem(int itemid,Item item) {
		Optional<Item> existingItem = itemrepository.findById(itemid);
		if (existingItem.isPresent()) {
			Item _item = existingItem.get();
			_item.setItemname(item.getItemname());
			_item.setItemdescription(item.getItemdescription());
			_item.setUomid(item.getUomid());
			_item.setUomname(item.getUomname());
			_item.setIsactive(item.isIsactive());		
			return new ResponseEntity<>(itemrepository.save(_item), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	public Boolean checkUnique(int id,String name) {
		   return itemrepository.checkUnique("checkifuniquenormalledgername", id, name);
			}
	
	
}
