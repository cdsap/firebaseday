package com.farangbank.firebaseday.operatives.accounts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.farangbank.firebaseday.R;
import com.farangbank.firebaseday.entities.Account;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AccountsActivity extends AppCompatActivity implements AccountsView {

    @BindView(R.id.accounts_activity_recycler)
    RecyclerView recyclerView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private AccountsAdapter accountsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts_activity);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initAdapter();
        initPresenter();
    }

    private void initPresenter() {
        AccountsPresenter accountsPresenter = new AccountsPresenter();
        accountsPresenter.initView(this);
        accountsPresenter.getAccounts();
    }

    @Override
    public void loadAccounts(List<Account> accountList) {
        accountsAdapter.setAccountList(accountList);
    }

    @Override
    public void showError(Throwable error) {
       // Snackbar.make(this, "Replace with your own action", Snackbar.LENGTH_LONG).show();
    }

    private void initAdapter() {
        accountsAdapter = new AccountsAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(accountsAdapter);

    }
}
