package com.farangbank.firebaseday.operatives.accounts;


import com.farang.firebaseday.domain.interactors.AccountsInteractor;
import com.farangbank.firebaseday.repository.AccountsRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class AccountsPresenter {
    private final AccountsInteractor accountsInteractor;
    private AccountsView accountsView;

    public AccountsPresenter() {
        AccountsRepository repository = new AccountsRepository();
        this.accountsInteractor = new AccountsInteractor(repository);

    }

    public void initView(AccountsView accountsView) {
        this.accountsView = accountsView;
    }

    public void getAccounts() {
        accountsInteractor.getAccounts()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(accounts -> accountsView.loadAccounts(accounts),
                        error -> accountsView.showError(error));
    }

}
