package com.wipro.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.wipro.dao.ProductDAO;
import com.wipro.dao.entity.Product;

public class ProductServices {

	
	public Product getProductById(Long id,Session session) {
		System.out.println("Inside Item Product Service");
		ProductDAO prdRepository = new ProductDAO();
		Product response = new Product();
		try {
			response = prdRepository.findById(id,session);
			System.out.println(new Date() + " Returning Product: " + id);
		}catch(Exception e) {
			System.out.println(new Date() + " No Product Found With id : " + id);
		}
		return response;
	}
	
	public List<Product> getAll(){
		List<Product> response = new ArrayList<Product>();
		try {
//			response = (List<Product>) prdRepository.findAll();
//			response.forEach(p -> System.out.println(p.toString()));
		}
		catch(Exception e) {
			System.out.println(new Date() +" Facing Some Problem While Fetching the List Please Try After Some Time");
		}
		return response;
	}
}
