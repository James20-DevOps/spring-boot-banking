package com.example.bank.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class SavingAccount extends BankAccount {
    private double interestRate; 

}
