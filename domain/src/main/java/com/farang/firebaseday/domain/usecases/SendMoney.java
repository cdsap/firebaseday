package com.farang.firebaseday.domain.usecases;

import com.farangbank.firebaseday.entities.Transfer;

/**
 * Created by inaki on 05/02/2017.
 */

public interface SendMoney {
    boolean sendMoney(Transfer transfer);
}
