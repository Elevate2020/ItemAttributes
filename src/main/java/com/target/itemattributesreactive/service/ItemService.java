package com.target.itemattributesreactive.service;

import com.target.itemattributesreactive.model.Item;
import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemService {

    Mono<Item> getItemAttributes(int id);
    Flux<Item> getAllItemsWithAttributes();
    Mono<Item> addItemAttributes(Item item);

}
