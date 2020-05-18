package com.target.itemattributes.service;

import com.target.itemattributes.mapper.ItemMapper;
import com.target.itemattributes.model.Item;
import com.target.itemattributes.model.ItemEntity;
import com.target.itemattributes.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private static final Logger LOG = LoggerFactory.getLogger(ItemService.class);

    private ItemRepository itemRepository;
    private final ItemMapper mapper;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper mapper) {
        this.itemRepository = itemRepository;
        this.mapper = mapper;
    }

    public Item getItemAttributes(int itemId) {
        ItemEntity entity = itemRepository.findById(itemId).get();
        Item itemApi = mapper.entityToApi(entity);

        return itemApi;
    }

    public List<Item> getAllItemsWithAttributes() {
        List<ItemEntity> entityList = itemRepository.findAll();
        List<Item> apiList = mapper.entityListToApiList(entityList);

        return apiList;
    }

    public Item createItemAttributes(Item body) {
        ItemEntity entity = mapper.apiToEntity(body);
        LOG.info(String.valueOf(entity));
        ItemEntity newEntity = itemRepository.save(entity);

        return mapper.entityToApi(newEntity);
    }

    public void deleteItemAttributes(int itemId) {
        itemRepository.deleteById(itemId);
    }

}