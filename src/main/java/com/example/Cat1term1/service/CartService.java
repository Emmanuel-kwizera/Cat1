package com.example.Cat1term1.service;

import com.example.Cat1term1.model.Cart;
import com.example.Cat1term1.model.Item;
import com.example.Cat1term1.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAll() {
        List<Cart> carts = cartRepository.findAll();

        return carts;
    }

    public Cart createCart(Long id, int items, float total_price){
        Cart cart = new Cart(id,0,0);
        return  cartRepository.save(cart);
    }


    public Item addItem(Long CartId, Item item){
        Cart cart = cartRepository.getById(CartId);

        if (cart == null) {
            return null;
        }
        cart.setItems((List<Item>) item);
        cart.setTotal_items(cart.getTotal_items() + 1);
        cart.setTotal_price(cart.getTotal_price() + item.getItemPrice());
        cartRepository.save(cart);

        return item;
    }

//    public void deleteItemOnCart(Long id){
//        cartRepository.findById(id)
//                .orElseThrow( ()->new RuntimeException("Cart with id: "+ id +" is not found with id"));
//
//        cartRepository.deleteById(id);
//    }

    public void deleteCart(Long id){
        cartRepository.findById(id)
                .orElseThrow( ()->new RuntimeException("Cart with id: "+ id +" is not found with id"));
        cartRepository.deleteById(id);
    }
}
