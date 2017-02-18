package com.farangbank.firebaseday.entities;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Account {

    public abstract long id();

    public abstract String accountName();

    public abstract AccountType accountType();

    public abstract Currency mainCurrency();

    public abstract double balance();

    public abstract boolean active();

    public abstract long userId();

    public static Account createAccount(long id, String name,
                                        AccountType accountType, Currency currency,
                                        double balance, boolean active, long userId) {
        return new AutoValue_Account(id, name, accountType,
                currency, balance, active, userId);
    }
}
