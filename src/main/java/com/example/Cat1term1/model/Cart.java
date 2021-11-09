package com.example.Cat1term1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Data
@NoArgsConstructor
public class Cart {
    @Id
    private Long id;
//    private String Name;
    @Transient
    private int total_items;
    @Transient
    private float total_price;
    private List<Item> items;
    private User user;

    public Cart(Long id, int total_items, float total_price){
        this.id = id;
        this.total_items = total_items;
        this.total_price = total_price;
    }
    public Cart(Long id, int total_items, float total_price, List<Item> items,User user){
        this.id = id;
        this.total_items = total_items;
        this.total_price = total_price;
        this.items = items;
        this.user = user;
    }

}
