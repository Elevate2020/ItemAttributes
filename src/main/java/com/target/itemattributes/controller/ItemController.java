package com.target.itemattributes.controller;

import com.target.itemattributes.model.Item;
import com.target.itemattributes.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(value = "/items", produces = "application/json")
    public List<Item> getAllItemsWithAttributes(){
        return itemService.getAllItemsWithAttributes();
    }

    @GetMapping(value = "/items/{itemId}", produces = "application/json")
    public Item getItemAttributes(@PathVariable int itemId){
        return itemService.getItemAttributes(itemId);
    }

    @PostMapping(value = "/items", consumes = "application/json", produces = "application/json")
    public Item createItemAttributes(@RequestBody Item body){
        return itemService.createItemAttributes(body);
    }

    @DeleteMapping(value = "items/{itemId}")
    public void deleteItemAttributes(@PathVariable int itemId){
        itemService.deleteItemAttributes(itemId);
    }

}
