package com.farangbank.firebaseday.operatives.accounts;


import com.farangbank.firebaseday.entities.Account;

import java.util.List;

public interface AccountsView {
    void loadAccounts(List<Account> accountList);

    void showError(Throwable error);
}
