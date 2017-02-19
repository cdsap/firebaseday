package com.farangbank.firebaseday.repository;


import com.farangbank.firebaseday.entities.Card;
import com.farangbank.firebaseday.entities.Currency;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public class CardsRepository {

    public CardsRepository() {
    }

    public Observable<List<Card>> getCards() {
        return Observable.fromArray(getMockCards());
    }

    public List<Card> getMockCards() {
        List<Card> mockCards = new ArrayList<>();
        Card cardGold = Card.createCard(1, 1, 5000, 17000, Currency.BTH, true);
        Card cardInternational = Card.createCard(1, 1, 5000, 17000, Currency.USD, true);
        Card shoppingCard = Card.createCard(1, 1, 0, 4000, Currency.BTH, true);
        mockCards.add(cardGold);
        mockCards.add(cardInternational);
        return mockCards;
    }
}
