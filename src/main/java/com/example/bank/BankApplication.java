package com.example.bank;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bank.entities.AccountStatus;
import com.example.bank.entities.CurrentAccount;
import com.example.bank.entities.Customer;
import com.example.bank.entities.Operation;
import com.example.bank.entities.OperationType;
import com.example.bank.entities.SavingAccount;
import com.example.bank.repositories.BankAccountRepository;
import com.example.bank.repositories.CustomerRepository;
import com.example.bank.repositories.OperationRepository;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	 // Ajout du code pour insérer des données lors du démarrage
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, 
                            BankAccountRepository bankAccountRepository, 
                            OperationRepository operationRepository) {
        return args -> {
            // Créer un utilisateur
            Customer customer1 = new Customer();
            customer1.setName("John Doe");
            customer1.setEmail("johndoe@example.com");
            customerRepository.save(customer1);

            // Créer un compte courant pour cet utilisateur
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.setId("CA123");
            currentAccount.setBalance(5000.0);
            currentAccount.setCreatedAt(new Date());
            currentAccount.setStatus(AccountStatus.CREATED);
            currentAccount.setCurrency("USD");
            currentAccount.setOverDraft(1000.0);
            currentAccount.setCustomer(customer1);
            bankAccountRepository.save(currentAccount);

            // Créer un compte épargne pour cet utilisateur
            SavingAccount savingAccount = new SavingAccount();
            savingAccount.setId("SA123");
            savingAccount.setBalance(10000.0);
            savingAccount.setCreatedAt(new Date());
            savingAccount.setStatus(AccountStatus.CREATED);
            savingAccount.setCurrency("USD");
            savingAccount.setInterestRate(2.5);
            savingAccount.setCustomer(customer1);
            bankAccountRepository.save(savingAccount);

            // Ajouter une opération à un des comptes
            Operation operation1 = new Operation();
            operation1.setDate(new Date());
            operation1.setAmount(200.0);
            operation1.setType(OperationType.CREDIT);
            operation1.setBankAccount(currentAccount);
            operationRepository.save(operation1);

            System.out.println("Initial data has been loaded!");
        };
    }

}
