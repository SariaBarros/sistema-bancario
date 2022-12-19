package services;

import models.Bank;
import models.CurrentAccount;
import models.Customer;
import models.SavingAccount;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OpenAccount {
    static public void customerRegister(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o seu nome:");
        String name = scanner.nextLine();
        System.out.println("Entre com o seu email:");
        String email = scanner.next();
        System.out.println("Entre com o seu CPF: ");
        String cpf = scanner.next();

        Customer customer = Customer.CustomerBuilder.aCustomer()
                .customerName(name).customerEmail(email)
                .cpf(cpf).build();
        Bank.customers.add(customer);
        openCurrentAccount(customer);
        openSavingAccount(customer);

    }
    static public void openCurrentAccount(Customer customer){
        CurrentAccount currentAccount = CurrentAccount.CurrentAccountBuilder
                .aCurrentAccount()
                .accountOwner(customer)
                .creationDate(LocalDateTime.now())
                .build();
        Bank.currentAccounts.add(currentAccount);
    }
    static public void openSavingAccount(Customer customer){
        SavingAccount savingAccount = SavingAccount
                .SavingAccountBuilder
                .aSavingAccount()
                .accountOwner(customer)
                .creationDate(LocalDateTime.now())
                .build();
        Bank.savingAccounts.add(savingAccount);
    }
}
