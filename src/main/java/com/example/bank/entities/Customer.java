package com.example.bank.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Customer {
    @Id
    private String id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;

}
