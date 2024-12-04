package com.example.bank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> findByEmail(String email);
    List<Customer> findByNameContaining(String keyword);

}
