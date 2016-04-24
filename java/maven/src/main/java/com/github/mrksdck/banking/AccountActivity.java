package com.github.mrksdck.banking;

import org.joda.money.Money;

import java.time.LocalDate;

/**
 * Created by mbdecke on 4/24/16.
 */
public interface AccountActivity {
    LocalDate getDate();

    Money getAmount();


}
