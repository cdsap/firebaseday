package com.farangbank.firebaseday.operatives.cards;

import com.farang.firebaseday.domain.interactors.CardsInteractor;
import com.farangbank.firebaseday.repository.CardsRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CardsPresenter {
    private final CardsInteractor cardsInteractor;
    private CardsView cardsView;

    public CardsPresenter() {
        CardsRepository repository = new CardsRepository();
        this.cardsInteractor = new CardsInteractor(repository);

    }

    public void initView(CardsView cardsView) {
        this.cardsView = cardsView;
    }

    public void getCards() {
        cardsInteractor.getCards()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(cards -> cardsView.loadCards(cards),
                        error -> cardsView.showError(error));
    }

}
