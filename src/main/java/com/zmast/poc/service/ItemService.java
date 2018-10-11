package com.zmast.poc.service;

import java.util.List;

import com.zmast.poc.model.Item;



public interface ItemService {
	void save(Item cricketer);
	Item findById(Long id);
	List<Item> getAllItems();	
}
