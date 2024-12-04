package com.example.bank.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entities.Customer;
import com.example.bank.services.BankService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
     private final BankService bankService;

    public CustomerController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return bankService.listCustomers();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return bankService.saveCustomer(customer);
    }

}
