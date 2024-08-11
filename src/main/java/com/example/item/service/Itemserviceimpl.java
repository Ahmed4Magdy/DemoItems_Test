package com.example.item.service;

import com.example.item.model.Item;
import com.example.item.Repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Itemserviceimpl implements itemservice {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item newItem) {
        return itemRepository.save(newItem);
    }

    @Override
    public Item getItemById(int id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

//    @Override
//    public void deleteOtemgetId(int id) {
//
//    }

    @Override
    public void deleteItemgetId(int id) {
        itemRepository.deleteById(id);
    }
}




//package com.example.item.service;
//
//import com.example.item.model.Item;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class Itemserviceimpl implements itemservice {
//
//    private List<Item> items = new ArrayList<Item>() {{
//        add(new Item(1, "Item1", 3));
//        add(new Item(2, "Item2", 4));
//        add(new Item(3, "Item3", 5));
//    }};
//
//    @Override
//    public Item addItem(Item newitem) {
//        items.add(newitem);
//        return newitem;
//    }
//
//    @Override
//    public Item getItemById(int id) {
//
//        for (Item item : items) {
//            if (item.getIDitem() == id) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Item> getAllItems() {
//        return items;
//    }
//
//    @Override
//    public void deleteOtemgetId(int id) {
//        items.removeIf(item -> item.getIDitem() == id);
////        return "Item deleted successfully";
//    }
//}
//
