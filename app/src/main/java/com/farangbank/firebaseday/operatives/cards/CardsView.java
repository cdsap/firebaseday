package com.farangbank.firebaseday.operatives.cards;

import com.farangbank.firebaseday.entities.Card;

import java.util.List;

public interface CardsView {
    void loadCards(List<Card> cardlList);

    void showError(Throwable error);
}
