package com.example.bank.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bank.entities.Customer;
import com.example.bank.repositories.CustomerRepository;

@Service
public class BankService {
     private final CustomerRepository customerRepository;

    public BankService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
