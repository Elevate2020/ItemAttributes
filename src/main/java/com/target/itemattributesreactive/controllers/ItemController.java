package com.target.itemattributesreactive.controllers;

import com.target.itemattributesreactive.model.Item;
import com.target.itemattributesreactive.model.ItemEntity;
import com.target.itemattributesreactive.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {

    @Autowired
    private  ItemService itemService;

//    @Autowired
//    public ItemController(ItemService itemService) {
//        this.itemService = itemService;
//    }

    @GetMapping(value = "/items", produces = "application/json")
    public Flux<Item> getAllItemsWithAttributes(){
        return itemService.getAllItemsWithAttributes();
    }

    @GetMapping(value = "/items/{itemId}", produces = "application/json")
    public Mono<Item> getItemAttributes(@PathVariable int itemId){
        return itemService.getItemAttributes(itemId);
    }

    @PostMapping(value = "/items", consumes = "application/json", produces = "application/json")
    public Mono<Item> createItemAttributes(@RequestBody Item body){
        return itemService.addItemAttributes(body);
    }

}
