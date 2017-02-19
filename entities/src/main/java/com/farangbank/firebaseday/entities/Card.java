package com.farangbank.firebaseday.entities;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Card {

    public abstract long id();

    public abstract long accountId();

    public abstract double balance();

    public abstract double limit();

    public abstract Currency currency();

    public abstract boolean active();

    public static Card createCard(long id, long accountId, double balance, double limit,
                                  Currency currency, boolean active) {
        return new AutoValue_Card(id, accountId, balance, limit, currency, active);
     }
}
