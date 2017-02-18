package com.farangbank.firebaseday.operatives.accounts;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.farangbank.firebaseday.R;
import com.farangbank.firebaseday.entities.Account;

import java.util.ArrayList;
import java.util.List;


public class AccountsAdapter extends RecyclerView.Adapter<AccountsAdapter.ViewHolder> {

    private List<Account> accountList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, balance, type;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.account_name);
            balance = (TextView) view.findViewById(R.id.account_balance);
            type = (TextView) view.findViewById(R.id.account_type);
        }
    }

    public AccountsAdapter() {
        this.accountList = new ArrayList<>();
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_accounts, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Account account = accountList.get(position);
        holder.name.setText(account.accountName());
        holder.balance.setText(account.balance() + "");
        holder.type.setText(account.accountType().name());
    }

    @Override
    public int getItemCount() {
        return accountList.size();
    }
}