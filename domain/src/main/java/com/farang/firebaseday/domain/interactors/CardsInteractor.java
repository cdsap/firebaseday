package com.farang.firebaseday.domain.interactors;

import com.farang.firebaseday.domain.usecases.GetCard;
import com.farangbank.firebaseday.entities.Card;
import com.farangbank.firebaseday.repository.CardsRepository;

import java.util.List;

import io.reactivex.Observable;

public class CardsInteractor implements GetCard {

    private final CardsRepository cardsRepository;

    public CardsInteractor(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @Override
    public Observable<List<Card>> getCards() {
        return cardsRepository.getCards();
    }

    @Override
    public Observable<Card> getCard(long id) {
        return null;
    }
}
