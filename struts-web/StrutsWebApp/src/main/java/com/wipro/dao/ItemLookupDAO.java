/**
 * 
 */
package com.wipro.dao;

import org.hibernate.Session;

import com.wipro.dao.entity.Item;

import junit.framework.Assert;

/**
 * @author PA20063329
 *
 */
public class ItemLookupDAO {
	
	public Item findById(Long id) {
		System.out.println("Inside ItemLookupDAO");
		Assert.assertNotNull(id);
		return (Item)session.get(Item.class, id);
	}


}
