package com.target.itemattributes.mapper;

import com.target.itemattributes.model.ItemEntity;
import com.target.itemattributes.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "rating", source = "itemApi.user_rating")
    })
    ItemEntity apiToEntity(Item itemApi);

    @Mappings({
            @Mapping(target = "user_rating", source = "itemEntity.rating")
    })
    Item entityToApi(ItemEntity itemEntity);

    List<ItemEntity> apiListToEntityList(List<Item> apiList);

    List<Item> entityListToApiList(List<ItemEntity> entityList);

}
