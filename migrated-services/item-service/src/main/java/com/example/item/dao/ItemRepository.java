package com.example.item.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.item.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

	Optional<Item> findById(Long id);
}
