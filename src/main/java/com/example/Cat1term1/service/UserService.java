package com.example.Cat1term1.service;

import com.example.Cat1term1.model.Cart;
import com.example.Cat1term1.model.User;
import com.example.Cat1term1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> users = userRepository.findAll();
//        for (Cart item : carts) {
//            item.setTotal_price();
//        }
        return users;
    }
}
