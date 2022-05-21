

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.Item;

public interface ItemService 
{
	public abstract Item addItem(Item item);
	public abstract Item updateItem(Item item);
	
	public abstract Item searchItemById(int id);
	public abstract Item deleteItem(Item item);
}
