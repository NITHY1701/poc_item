package com.zmast.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmast.poc.model.Item;
import com.zmast.poc.repository.ItemRepository;

@Service
public  class ItemServiceImpl implements ItemService{

	@Autowired
	ItemRepository itemRepository;
	
	public void save(Item item) {
		itemRepository.save(item);
	}

	public Item findById(Long id){
		return itemRepository.findOne(id);
	}
		
	public List<Item> getAllItems(){
		return itemRepository.findAll();
	}

}
