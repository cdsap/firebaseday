package com.farang.firebaseday.domain.usecases;


import com.farangbank.firebaseday.entities.Card;

import java.util.List;

import io.reactivex.Observable;

public interface GetCard {

    Observable<List<Card>> getCards();

    Observable<Card> getCard(long id);
}
