package com.github.mrksdck.banking;

import org.joda.money.Money;

import java.time.LocalDate;

/**
 * Created by mbdecke on 4/24/16.
 */
public class Statement {

    private Money credit;
    private Money debit;
    private final Money balance;
    private final LocalDate date;

    public Statement(Deposit deposit, Money balance) {
        this.credit = deposit.getAmount();
        this.balance = balance;
        this.date = deposit.getDate();
    }

    public Statement(Withdrawal withdrawal, Money balance) {
        this.debit = withdrawal.getAmount();
        this.balance = balance;
        this.date = withdrawal.getDate();
    }

    public Money getCredit() {
        return credit;
    }

    public Money getBalance() {
        return balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public Money getDebit() {
        return debit;
    }
}
