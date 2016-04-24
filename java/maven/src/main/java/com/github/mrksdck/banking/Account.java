package com.github.mrksdck.banking;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbdecke on 4/24/16.
 */
public class Account {
    private List<Statement> history;
    private Money balance;

    public Account() {
        history = new ArrayList<>();
        balance = Money.of(CurrencyUnit.EUR, 0.0);
    }

    public List<Statement> getHistory() {
        return history;
    }

    public void process(Deposit deposit) {
        balance = balance.plus(deposit.getAmount());
        history.add(new Statement(deposit, balance));
    }

    public void process(Withdrawal withdrawal) {
        balance = balance.minus(withdrawal.getAmount());
        history.add(new Statement(withdrawal, balance));
    }

    public Money getBalance() {
        return balance;
    }
}
