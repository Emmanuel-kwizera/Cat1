package com.example.Cat1term1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Item {

    @Id
    private Long id;
    private String itemName;
    private float itemPrice;

    public Item(Long id, String itemName, float itemPrice){
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

}
