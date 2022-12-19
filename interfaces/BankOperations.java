package interfaces;

import java.math.BigDecimal;

public interface BankOperations {
    public void deposit(BigDecimal deposit);
    public void withdraw(BigDecimal withdraw);
}
