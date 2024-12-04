package com.example.bank.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class CurrentAccount extends BankAccount {
    private double overDraft; 

}
