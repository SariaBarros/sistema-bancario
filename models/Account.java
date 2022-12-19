package models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Account {
    private long accountNumber;
    private LocalDateTime creationDate;
    private Customer accountOwner;
    private BigDecimal balance;

    public Account(LocalDateTime creationDate, Customer accountOwner) {
        this.creationDate = creationDate;
        this.accountOwner = accountOwner;
        this.accountNumber = accountOwner.getCustomerId();
        this.balance = BigDecimal.valueOf(0);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        if (balance.intValue() > 0)
            this.balance = balance;
        else
            System.out.println("Valor inválido");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", creationDate=" + creationDate +
                ", accountOwner=" + accountOwner +
                ", balance=" + balance +
                '}';
    }
}
