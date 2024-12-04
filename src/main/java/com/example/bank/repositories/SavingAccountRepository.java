package com.example.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entities.SavingAccount;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, String> {

}
