package com.farang.firebaseday.domain.interactors;


import com.farang.firebaseday.domain.usecases.GetAccount;
import com.farangbank.firebaseday.entities.Account;
import com.farangbank.firebaseday.repository.AccountsRepository;

import java.util.List;

import io.reactivex.Observable;

public class AccountsInteractor implements GetAccount {

    private final AccountsRepository accountsRepository;

    public AccountsInteractor(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @Override
    public Observable<List<Account>> getAccounts() {
        return accountsRepository.getAccounts();
    }

    @Override
    public Observable<Account> getAccount(long id) {
        return null;
    }
}
