package com.example.Cat1term1.repository;

import com.example.Cat1term1.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
