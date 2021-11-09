package com.example.Cat1term1.repository;

import com.example.Cat1term1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
