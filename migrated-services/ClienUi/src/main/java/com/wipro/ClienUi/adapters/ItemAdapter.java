package com.wipro.ClienUi.adapters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.ClienUi.domain.Item;

@Service
public class ItemAdapter {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Item> getAllItem(){
		ResponseEntity<List<Item>> responseEntity = restTemplate.exchange("http://localhost:800/api/item/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Item>>(){});
		return responseEntity.getBody();
	}
	
}
