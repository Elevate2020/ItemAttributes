package com.target.itemattributes.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.target.itemattributes.model.Item;
import com.target.itemattributes.model.ItemEntity;
import com.target.itemattributes.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemController.class)
class ItemControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ItemService itemService;
    @Test
    void tc001_getAllItemsWithAttributes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setId(1);
        item1.setName("Test Product 1");
        Item item2 = new Item();
        item2.setId(2);
        item2.setName("Test Product 2");
        items.add(item1);
        items.add(item2);
        when(itemService.getAllItemsWithAttributes()).thenReturn(items);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/items")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void tc002_getItemAttributes() throws Exception {
        Item item1 = new Item();
        item1.setId(1);
        item1.setName("Test Product 1");
        when(itemService.getItemAttributesWithId(1)).thenReturn(item1);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/items/1")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void tc003_deleteItemAttributes() throws Exception {
        Item item1 = new Item();
        item1.setId(1);
        item1.setName("Test Product 1");
        itemService.deleteItemAttributes(1);
        this.mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/items/1")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void tc004_createItemAttributes() throws Exception {
        Item inputItem = new Item();
        inputItem.setName("Test Item saved");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        Item itemReturnedByService = new Item();
        itemReturnedByService.setId(1);
        itemReturnedByService.setName("Test Item saved");
        when(itemService.createItemAttributes(inputItem)).thenReturn(itemReturnedByService);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/items")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ow.writeValueAsString(inputItem ))).andDo(print()).andExpect(status().isOk());
    }
}


