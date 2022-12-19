package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentAccount extends Account{


    private CurrentAccount(LocalDateTime creationDate, Customer accountOwner) {
        super(creationDate, accountOwner);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static final class CurrentAccountBuilder {
        private long accountNumber;
        private LocalDateTime creationDate;
        private Customer accountOwner;

        private CurrentAccountBuilder() {
        }

        public static CurrentAccountBuilder aCurrentAccount() {
            return new CurrentAccountBuilder();
        }

        public CurrentAccountBuilder accountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public CurrentAccountBuilder creationDate(LocalDateTime creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public CurrentAccountBuilder accountOwner(Customer accountOwner) {
            this.accountOwner = accountOwner;
            return this;
        }

        public CurrentAccount build() {
            CurrentAccount currentAccount = new CurrentAccount(creationDate, accountOwner);
            //.accountNumber = this.accountNumber;
            return currentAccount;
        }
    }
}
