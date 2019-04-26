/**
 * 
 */
package com.wipro.dao;

import org.hibernate.Session;

import com.wipro.dao.entity.Item;

/**
 * @author PA20063329
 *
 */
public class ItemLookupDAO {
	
	public Item findById(Long id,Session session) throws Exception{
		System.out.println("Inside ItemLookupDAO");
		if(id == null )
			throw new Exception("Id Cannot be null");
		return (Item)session.get(Item.class, id);
	}


}
