package com.bridgelabz.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greetingapp.entity.User;

@Repository
public interface GreetingRepository extends JpaRepository<User, Integer> {

}