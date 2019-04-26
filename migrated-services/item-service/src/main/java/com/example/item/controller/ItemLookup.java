package com.example.item.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.item.entities.Item;
import com.example.item.services.ItemService;

@RestController
@RequestMapping(value= "/api/item")
public class ItemLookup {

	@Autowired
	ItemService itemService;
	
	org.slf4j.Logger LOG = LoggerFactory.getLogger(ItemLookup.class);
	
	@RequestMapping(value = "/")
	public List<Item> getAllItem() {
		LOG.info( new Date() + " Calling lookupItem");
		List<Item> response = itemService.getAllItems();
		return response;
	}
	
	@RequestMapping(value = "/getItemById")
	public Item getItemById(@RequestParam String itemId) {
		LOG.info( new Date() + " Calling lookupItem getItemById");
		Item response = itemService.getItemById(itemId);
		return response;
	}
}
