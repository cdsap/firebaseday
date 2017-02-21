package com.farangbank.firebaseday.operatives.cards;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.farangbank.firebaseday.BaseActivity;
import com.farangbank.firebaseday.R;
import com.farangbank.firebaseday.entities.Card;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CardsActivity extends BaseActivity implements CardsView {

    @BindView(R.id.cards_activity_recycler)
    RecyclerView recyclerView;

    private CardsAdapter cardsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_activity);
        ButterKnife.bind(this);
        initDrawer();
        initAdapter();
        initPresenter();
    }

    private void initPresenter() {
        CardsPresenter cardsPresenter = new CardsPresenter();
        cardsPresenter.initView(this);
        cardsPresenter.getCards();
    }

    @Override
    public void loadCards(List<Card> cardList) {
        cardsAdapter.setCardList(cardList);
    }

    @Override
    public void showError(Throwable error) {
        // Snackbar.make(this, "Replace with your own action", Snackbar.LENGTH_LONG).show();
    }

    private void initAdapter() {
        cardsAdapter = new CardsAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cardsAdapter);

    }
}
