package bank_group_work;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance;    public Account(String accountNumber, AccountType accountType, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }    public Account(String accountNumber, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance=BigDecimal.ZERO;
    }    public String getAccountNumber() {

        return accountNumber;
    }
    public AccountType getAccountType() {

        return accountType;
    }
    public BigDecimal getBalance() {
        return balance;
    }
}
