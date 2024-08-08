package com.example.item.controller;

import com.example.item.model.Item;
import com.example.item.service.Itemserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")

public class itemcontroller {



    @Autowired
    private Itemserviceimpl impl;
    @PostMapping("/items/id")
    public Item addItem(@RequestBody Item newItem) {

        return impl.addItem(newItem);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {

                return impl.getItemById(id);

    }

    @GetMapping
    public List<Item> getAllItems() {
        return impl.getAllItems();
    }

    @DeleteMapping("/{id}")
    public void deleteItemById(@PathVariable int id) {
        impl.deleteOtemgetId(id);

    }


}
