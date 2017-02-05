package com.farang.firebaseday.domain.usecases;

public interface GetAccount {

    List<Account>  getAccounts();

    Account getAccount(long id);
}
