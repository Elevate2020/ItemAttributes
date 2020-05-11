package com.target.itemattributesreactive.service;

import com.target.itemattributesreactive.model.Item;
import com.target.itemattributesreactive.model.ItemEntity;
import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ItemService {

    Mono<Item> getItemAttributesWithId(int id);
    Flux<Item> getAllItemsWithAttributes();
    Mono<Item> addItemAttributes(Item item);
    Mono<Void> deleteItemAttributesWithId(int id);

}
