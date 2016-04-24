package com.github.mrksdck.banking;

import org.joda.money.Money;

import java.time.LocalDate;

/**
 * Created by mbdecke on 4/24/16.
 */
public class Withdrawal implements AccountActivity {
    private Money amount;
    private LocalDate date;

    public Withdrawal(LocalDate date, Money amount) {

        this.date = date;
        this.amount = amount;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public Money getAmount() {
        return amount;
    }
}
