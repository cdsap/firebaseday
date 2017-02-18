package com.farang.firebaseday.domain.usecases;


import com.farangbank.firebaseday.entities.Account;

import java.util.List;

import io.reactivex.Observable;

public interface GetAccount {

    Observable<List<Account>> getAccounts();

    Observable<Account> getAccount(long id);
}
