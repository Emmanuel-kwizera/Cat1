package com.example.Cat1term1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class User {

    @Id
    private Long id;
    private String UserName;

    public User(Long id,String UserName){
        this.id = id;
        this.UserName = UserName;
    }
}
