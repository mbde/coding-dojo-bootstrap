package com.github.mrksdck.banking;

import org.joda.money.Money;

import java.time.LocalDate;

/**
 * Created by mbdecke on 4/24/16.
 */
public class Deposit implements AccountActivity {

    private final Money amount;
    private final LocalDate date;

    public Deposit(LocalDate date, Money amount) {

        this.amount = amount;
        this.date = date;
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
