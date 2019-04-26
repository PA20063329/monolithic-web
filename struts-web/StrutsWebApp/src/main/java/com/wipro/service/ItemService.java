package com.wipro.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.wipro.dao.ItemLookupDAO;
import com.wipro.dao.entity.Item;

public class ItemService {

	public Item getItemById(Long id,Session session) {
		System.out.println("Inside Item Service");
		ItemLookupDAO itemRepository = new ItemLookupDAO();
		Item response = null;
		try {
			response = itemRepository.findById(id);
			System.out.println(new Date() + " Returning Item: " + id);
		}catch(Exception e) {
			System.out.println(new Date() + " No Item Found With id : " + id);
		}
		return response;
	}

	public List<Item> getAllItems() {
		ItemLookupDAO itemRepository = new ItemLookupDAO();
		List<Item> response = new ArrayList<Item>();
		try {
			//response = (List<Item>) itemRepository.findAll();
			//response.forEach(i -> System.out.println(i.toString()));
		}
		catch(Exception e) {
			System.out.println(new Date() +" Facing Some Problem While Fetching the Item List Please Try After Some Time");
		}
		return response;
	}
}
