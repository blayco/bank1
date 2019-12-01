package bank_group_work;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Client {

    private String name, surname;

    private String customerNumber;

    private String pesel;



    public String getPesel() {
        return pesel;
    }

    public Client(String name, String surname, String customerNumber) {
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
        accountList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    private List<Account> accountList;

    //public List<Client>
String  accountNumber;
    AccountType accountType;

public boolean addAccount(AccountType accountType, String accountNumber) {
   return accountList.add(
           new Account(accountNumber, accountType));
}

    public boolean deleteAccount(String accountNumber) {
        for(Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber))
                if(account.getBalance().equals(BigDecimal.ZERO))
                    return accountList.remove(account);
        }
        return false;
    }

    public boolean deposit(String accountNumber, BigDecimal amount){
        for(Account account: accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account.deposit(amount);
        }
        return false;
}

    public boolean withdraw(String accountNumber, BigDecimal amount) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account.withdraw(amount);
        }
        return false;
    }
}
