package com.shopmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopmanager.entities.Item;
import com.shopmanager.itemServices.ItemService;

@RestController
public class ItemController {
	@Autowired 
	ItemService itemService;
	@PostMapping("/item")
	private ResponseEntity<Item> addItem(@RequestBody Item item){		
		return new ResponseEntity<Item>(itemService.addItem(item),HttpStatus.OK);
	}
	@GetMapping("/items")
	private ResponseEntity<List<Item>>getALlItems(){
		return new ResponseEntity<List<Item>>(itemService.getAllItems(),HttpStatus.OK);
	}
}
