package com.example.bank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    List<Operation> findByBankAccountId(String accountId);

}
