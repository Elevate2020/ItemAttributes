package com.target.itemattributesreactive.service;

import com.target.itemattributesreactive.exceptions.NotFoundException;
import com.target.itemattributesreactive.mapper.ItemMapper;
import com.target.itemattributesreactive.model.Item;
import com.target.itemattributesreactive.model.ItemEntity;
import com.target.itemattributesreactive.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemServiceImplementation implements ItemService {

    private static final Logger LOG = LoggerFactory.getLogger(ItemServiceImplementation.class);

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemMapper mapper;

//    @Autowired
//    public ItemServiceImplementation(ItemRepository itemRepository, ItemMapper mapper) {
//        this.itemRepository = itemRepository;
//        this.mapper = mapper;
//    }

    @Override
    public Mono<Item> getItemAttributes(int id) {
        return itemRepository.findById(id)
                            .switchIfEmpty(Mono.error(new NotFoundException("no attributes found for item id " + id)))
                            .log()
                            .map(e -> mapper.entityToApi(e));
    }

    @Override
    public Flux<Item> getAllItemsWithAttributes() {
        return itemRepository.findAll()
                            .switchIfEmpty(Flux.error(new NotFoundException("not a single item found!")))
                            .log()
                            .map(e -> mapper.entityToApi(e));
    }

    @Override
    public Mono<Item> addItemAttributes(Item item) {
        ItemEntity entity = mapper.apiToEntity(item);
        LOG.info(String.valueOf(entity));
        Mono<Item> newItem = itemRepository.save(entity)
                                                .log()
                                                .map(e -> mapper.entityToApi(e));
        LOG.info(String.valueOf(newItem));
        return newItem;
//        return itemRepository.save(mapper.apiToEntity(item));
    }
}
