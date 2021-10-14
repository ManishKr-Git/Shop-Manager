package com.shopmanager.itemServices;

import java.util.List;

import com.shopmanager.entities.Item;

public interface ItemService {

	Item addItem(Item item);

	List<Item> getAllItems();
	
}
