package com.farang.firebaseday.domain.interactors;

import com.farang.firebaseday.domain.usecases.SendMoney;
import com.farangbank.firebaseday.entities.Transfer;

/**
 * Created by inaki on 05/02/2017.
 */

public class TransferInteractor implements SendMoney {

    @Override
    public boolean sendMoney(Transfer transfer) {

        return false;
    }
}
