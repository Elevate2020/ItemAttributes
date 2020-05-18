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
            @Mapping(target = "rating", source = "itemApi.user_rating"),
            @Mapping(target = "manufacturedDate", source = "itemApi.manufactured_date"),
            @Mapping(target = "expiryDate", source = "itemApi.expiry_date"),
            @Mapping(target = "purchaseDate", source = "itemApi.purchase_date"),
            @Mapping(target = "manufacturerId", source = "itemApi.manufacturer_id"),
            @Mapping(target = "manufacturerName", source = "itemApi.manufacturer_name"),
            @Mapping(target = "unitsPerPack", source = "itemApi.units_per_pack"),
            @Mapping(target = "vendorCasePack", source = "itemApi.vendor_case_pack"),
            @Mapping(target = "isFragile", source = "itemApi.is_fragile"),
            @Mapping(target = "isReturnable", source = "itemApi.is_returnable"),
            @Mapping(target = "isItemHazardous", source = "itemApi.is_item_hazardous"),
            @Mapping(target = "createdBy", source = "itemApi.created_by"),
            @Mapping(target = "updatedBy", source = "itemApi.updated_by")
    })
    ItemEntity apiToEntity(Item itemApi);

    @Mappings({
            @Mapping(target = "user_rating", source = "itemEntity.rating"),
            @Mapping(target = "manufactured_date", source = "itemEntity.manufacturedDate"),
            @Mapping(target = "expiry_date", source = "itemEntity.expiryDate"),
            @Mapping(target = "purchase_date", source = "itemEntity.purchaseDate"),
            @Mapping(target = "manufacturer_id", source = "itemEntity.manufacturerId"),
            @Mapping(target = "manufacturer_name", source = "itemEntity.manufacturerName"),
            @Mapping(target = "units_per_pack", source = "itemEntity.unitsPerPack"),
            @Mapping(target = "vendor_case_pack", source = "itemEntity.vendorCasePack"),
            @Mapping(target = "is_fragile", source = "itemEntity.isFragile"),
            @Mapping(target = "is_returnable", source = "itemEntity.isReturnable"),
            @Mapping(target = "is_item_hazardous", source = "itemEntity.isItemHazardous"),
            @Mapping(target = "created_by", source = "itemEntity.createdBy"),
            @Mapping(target = "updated_by", source = "itemEntity.updatedBy")
    })
    Item entityToApi(ItemEntity itemEntity);

    List<ItemEntity> apiListToEntityList(List<Item> apiList);

    List<Item> entityListToApiList(List<ItemEntity> entityList);

}
