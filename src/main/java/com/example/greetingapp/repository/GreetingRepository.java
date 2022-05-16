package com.example.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.greetingapp.entity.User;

@Repository
public interface GreetingRepository extends JpaRepository<User, Integer> {

}