package com.farangbank.firebaseday.repository;


import com.farangbank.firebaseday.entities.Account;
import com.farangbank.firebaseday.entities.AccountType;
import com.farangbank.firebaseday.entities.Currency;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public class AccountsRepository {

    public AccountsRepository() {
    }

    public Observable<List<Account>> getAccounts() {
        return Observable.just(getMockAccounts());
    }

    public List<Account> getMockAccounts() {
        List<Account> accountList = new ArrayList<>();
        Account savings = Account.createAccount(1, "Main Account", AccountType.SAVINGS,
                Currency.BTH, 232100, true, 1);
        Account deposits = Account.createAccount(2, "Deposits", AccountType.DEPOSIT,
                Currency.BTH, 5000, true, 1);
        Account longTerm = Account.createAccount(3, "Long Term", AccountType.SAVINGS,
                Currency.USD, 23200, true, 1);
        Account loanCar = Account.createAccount(4, "Car Loan", AccountType.LOAN,
                Currency.BTH, 130405, true, 1);

        accountList.add(savings);
        accountList.add(deposits);
        accountList.add(longTerm);
        accountList.add(loanCar);
        return accountList;
    }
}
