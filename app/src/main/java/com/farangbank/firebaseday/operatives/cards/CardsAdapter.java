package com.farangbank.firebaseday.operatives.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.farangbank.firebaseday.R;
import com.farangbank.firebaseday.entities.Card;

import java.util.ArrayList;
import java.util.List;


public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.ViewHolder> {

    private List<Card> cardList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, balance, currency,available;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.card_name);
            currency = (TextView) view.findViewById(R.id.card_currency);
            balance = (TextView) view.findViewById(R.id.card_balance);
            available = (TextView) view.findViewById(R.id.card_available);
        }
    }

    public CardsAdapter() {
        this.cardList = new ArrayList<>();
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cards, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card card = cardList.get(position);
        holder.name.setText(card.name());
        holder.currency.setText(card.currency().name());
        holder.balance.setText(card.balance() + "");
        holder.available.setText(card.limit()+"");
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}