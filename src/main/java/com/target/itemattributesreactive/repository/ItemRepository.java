package com.target.itemattributesreactive.repository;

import com.target.itemattributesreactive.model.Item;
import com.target.itemattributesreactive.model.ItemEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemRepository extends ReactiveCrudRepository<ItemEntity, Integer> {
    Mono<ItemEntity> findById(int itemId);
    Flux<ItemEntity> findAll();
}
