package com.example.item.service;

import com.example.item.model.Item;

import java.util.List;

public interface itemservice {

    Item addItem(Item newitem);

    Item getItemById(int id);

    List<Item> getAllItems();

    void deleteItemgetId(int id);


}
