package com.farangbank.firebaseday.entities;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Transfer {
    public abstract Account origin();

    public abstract String destinationAccount();

    public abstract String destinationBank();

    public abstract double amount();

    public abstract String concept();

    public abstract Currency currency();

    public static Transfer createTransfer(Account account, String destinationAccount,
                                          String destinationBank, double amount, String concept,
                                          Currency currency) {
        return new AutoValue_Transfer(account, destinationAccount, destinationBank, amount, concept,
                currency);

    }
}

