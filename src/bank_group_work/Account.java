package bank_group_work;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance;


    public Account(String accountNumber, AccountType accountType, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Account(String accountNumber, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = BigDecimal.ZERO;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return true;
    }

    public boolean withdraw(BigDecimal amount) {
        if (this.balance.compareTo(amount) >= 0) {
            this.balance = this.balance.subtract(amount);
            return true;
                    }
        return false;
    }
}