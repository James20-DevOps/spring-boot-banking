package com.example.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}
