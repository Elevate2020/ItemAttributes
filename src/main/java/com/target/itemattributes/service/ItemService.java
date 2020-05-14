package com.target.itemattributes.service;

import com.target.itemattributes.model.Item;

import java.util.List;

public interface ItemService {

    Item getItemAttributes(int itemId);

    List<Item> getAllItemsWithAttributes();

    Item createItemAttributes(Item body);

    void deleteItemAttributes(int itemId);

}
