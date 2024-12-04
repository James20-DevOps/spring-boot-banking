package com.example.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entities.CurrentAccount;

public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, String> {

}
