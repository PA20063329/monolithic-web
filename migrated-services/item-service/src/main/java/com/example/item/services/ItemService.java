package com.example.item.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.item.controller.ItemLookup;
import com.example.item.dao.ItemRepository;
import com.example.item.entities.Item;

@Service
public class ItemService {

	org.slf4j.Logger LOG = LoggerFactory.getLogger(ItemLookup.class);

	@Autowired
	ItemRepository itemRepository;

	public Item getItemById(String id) {
		Item response = new Item();
		try {
			Optional<Item> optItem = itemRepository.findById(Long.valueOf(id));
			response = optItem.get();
			LOG.info(new Date() + " Returning Item: " + id);
		}catch(Exception e) {
			LOG.info(new Date() + " No Item Found With id : " + id);
		}
		return response;
	}

	public List<Item> getAllItems() {
		List<Item> response = new ArrayList<Item>();
		try {
			response = (List<Item>) itemRepository.findAll();
			response.forEach(i -> System.out.println(i.toString()));
		}
		catch(Exception e) {
			LOG.error(new Date() +" Facing Some Problem While Fetching the Item List Please Try After Some Time");
		}
		return response;
	}
}
