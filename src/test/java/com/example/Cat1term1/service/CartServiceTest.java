package com.example.Cat1term1.service;

import com.example.Cat1term1.model.Cart;
import com.example.Cat1term1.repository.CartRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CartServiceTest {

    @Mock
    private CartRepository cartRepository;

    @InjectMocks
    private CartService cartService;

    @Test
    public void getAll_returnExistingElements(){
        when(cartRepository.findAll()).thenReturn(Arrays.asList(
                new Cart(1L,0,0)
        ));

        assertEquals(0,cartService.getAll().get(0).getItems());
    }
//    @Test
//    public void createCart_test(){
//        when(cartRepository.save(ArgumentMatchers.any(Cart.class))).thenReturn(new Cart(1L,0,0));
//        assertEquals(2L"",cartService.createCart(2L,0,0).getId());
//    }


}
