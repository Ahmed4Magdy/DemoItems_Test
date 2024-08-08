package com.example.item.controller;

import com.example.item.model.Item;
import com.example.item.service.Itemserviceimpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerTest {

    @MockBean
    private Itemserviceimpl impl;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddItem() throws Exception {
        Item newItem = new Item(4, "Item4", 6);
        when(impl.addItem(newItem)).thenReturn(newItem);

        mockMvc.perform(MockMvcRequestBuilders.post("/items/items/id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"IDitem\": 4, \"nameitem\": \"Item4\", \"codeitem\": 6}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetItemById() throws Exception {
        Item item = new Item(1, "Item1", 3);
        when(impl.getItemById(1)).thenReturn(item);

        mockMvc.perform(MockMvcRequestBuilders.get("/items/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetAllItems() throws Exception {
        List<Item> items = Arrays.asList(
                new Item(1, "Item1", 3),
                new Item(2, "Item2", 4),
                new Item(3, "Item3", 5)
        );
        when(impl.getAllItems()).thenReturn(items);

        mockMvc.perform(MockMvcRequestBuilders.get("/items")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testDeleteItemById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/items/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}