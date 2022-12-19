package tests;

import models.Bank;
import models.SavingAccount;
import services.OpenAccount;
import services.Screens;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int operation;
        Screens.initialScreen();
        do {
            Screens.menu();
            operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.println("Abrir conta");
                    OpenAccount.customerRegister();
                    break;
                case 2:
                    Bank.customers.forEach(print -> System.out.println(print.getCustomerName()));
                    break;
                case 3:
                    savingAccountDeposit();

            }
        }while (operation != 0);


    }

    private static void savingAccountDeposit() {
        System.out.println("Entre com o valor que será depositado");
        BigDecimal deposit = scanner.nextBigDecimal();
        System.out.println("Entre com o número da conta que receberá o dinheiro");
        long accountNumber = scanner.nextLong();
        Bank.savingAccounts.stream()
                .filter(value -> value.getAccountNumber() == accountNumber)
                .findAny().orElse(null).setBalance(deposit);
    }
}
