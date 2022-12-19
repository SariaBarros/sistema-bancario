package models;

import java.time.LocalDateTime;

public class SavingAccount extends Account{
    private SavingAccount(LocalDateTime creationDate, Customer accountOwner) {
        super(creationDate, accountOwner);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static final class SavingAccountBuilder {
        private long accountNumber;
        private LocalDateTime creationDate;
        private Customer accountOwner;

        private SavingAccountBuilder() {
        }

        public static SavingAccountBuilder aSavingAccount() {
            return new SavingAccountBuilder();
        }

        public SavingAccountBuilder accountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public SavingAccountBuilder creationDate(LocalDateTime creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public SavingAccountBuilder accountOwner(Customer accountOwner) {
            this.accountOwner = accountOwner;
            return this;
        }

        public SavingAccount build() {
            SavingAccount savingAccount = new SavingAccount(creationDate, accountOwner);
            return savingAccount;
        }
    }
}
