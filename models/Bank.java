package models;

import interfaces.BankOperations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank implements BankOperations {
    static public List<Customer> customers = new ArrayList<>();
    static public List<CurrentAccount> currentAccounts = new ArrayList<>();
    static public List<SavingAccount> savingAccounts = new ArrayList<>();

    @Override
    public void deposit(BigDecimal deposit) {

    }

    @Override
    public void withdraw(BigDecimal withdraw) {

    }
}
