package com.target.itemattributes.service;
import com.target.itemattributes.exceptions.InvalidInputException;
import com.target.itemattributes.exceptions.NotFoundException;
import com.target.itemattributes.mapper.ItemMapper;
import com.target.itemattributes.model.Item;
import com.target.itemattributes.model.ItemEntity;
import com.target.itemattributes.repository.ItemRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.*;

class ItemServiceTest {
     ItemRepository itemRepository = mock(ItemRepository.class);
     @Spy
     ItemMapper mapper = Mappers.getMapper(ItemMapper.class) ;
    @InjectMocks
    ItemService itemService = new ItemService(itemRepository, mapper);
    @Test
    void tc001_getItemAttributesWithValidId() {
        ItemEntity item = new ItemEntity();
        item.setId(1);
        item.setName("Test Product");
        when(itemRepository.findById(any())).thenReturn(Optional.of(item));
        assertNotNull( itemService.getItemAttributesWithId(1));
    }
    @Test
    void tc002_getItemAttributesWithInvalidId() {
        assertThrows(InvalidInputException.class,            ()->{
            itemService.getItemAttributesWithId(-1);
        });
    }
    @Test
    void tc003_getAllItemsWithAttributes() {
        List<ItemEntity> itemEntities = new ArrayList<>();
        ItemEntity item1 = new ItemEntity();
        item1.setId(1);
        item1.setName("Test Product 1");
        ItemEntity item2 = new ItemEntity();
        item2.setId(2);
        item2.setName("Test Product 2");
        itemEntities.add(item1);
        itemEntities.add(item2);
        when(itemRepository.findAll()).thenReturn(itemEntities);
        List<Item> items = itemService.getAllItemsWithAttributes();
        assertEquals(2, items.size());
    }
    @Test
    void tc004_getItemAttributesWhenNoRecords() {
        when(itemRepository.findAll()).thenReturn(new ArrayList<>());
        assertThrows(NotFoundException.class,            ()->{
            itemService.getAllItemsWithAttributes();
        });
    }
    @Test
    void tc005_createItemAttributes() {
        Item item = new Item();
        item.setName("Test Item saved");
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setId(1);
        itemEntity.setName("Test Item saved");
        when(itemRepository.save(any())).thenReturn(itemEntity);
        Item returnedItem = itemService.createItemAttributes(item);
        assertEquals(1, returnedItem.getId());
    }
    @Test
    void tc005_deleteItemAttributes() {
        itemService.deleteItemAttributes(1);
        verify(itemRepository,times(1)).deleteById(1);
    }
}