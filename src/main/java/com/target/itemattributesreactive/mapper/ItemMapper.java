package com.target.itemattributesreactive.mapper;

import com.target.itemattributesreactive.model.Item;
import com.target.itemattributesreactive.model.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mappings({
            @Mapping(target = "rating", source = "itemApi.user_rating"),
            @Mapping(target = "id", ignore = true)
    })
    ItemEntity apiToEntity(Item itemApi);

    @Mappings({
            @Mapping(target = "user_rating", source = "itemEntity.rating")
    })
    Item entityToApi(ItemEntity itemEntity);

    List<ItemEntity> apiListToEntityList(List<Item> apiList);

    List<Item> entityListToApiList(List<ItemEntity> entityList);

}
