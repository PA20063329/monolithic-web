/**
 * 
 */
package com.wipro.dao;

import org.hibernate.Session;

import com.wipro.dao.entity.Product;

/**
 * @author PA20063329
 *
 */
public class ProductDAO {

	public Product findById(Long id, Session session) throws Exception{
		System.out.println("Inside Item Product DAO");
		if(id == null )
			throw new Exception("Id Cannot be null");
		return (Product)session.get(Product.class, id);
	}

}
