package com.github.mrksdck.banking;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.joda.money.CurrencyUnit.EUR;


/**
 * Created by mbdecke on 4/24/16.
 */
public class AccountTest {
    Account account = new Account();
    Deposit deposit = new Deposit(LocalDate.of(2016, 1, 1), Money.of(EUR, 123.45));
    Withdrawal withdrawal = new Withdrawal(LocalDate.of(2016, 1, 1), Money.of(EUR, 543.21));

    @Test
    public void testDeposit() {
        account.process(deposit);
        assertThat(account.getBalance().toString()).isEqualTo("EUR 123.45");
    }

    @Test
    public void testWithdrawal() {
        account.process(withdrawal);
        assertThat(account.getBalance().toString()).isEqualTo("EUR -543.21");
    }

    @Test
    public void testEmptyHistory() {
        assertThat(account.getHistory()).isEmpty();
    }

    @Test
    public void testInitialBalance() {
        assertThat(account.getBalance()).isEqualTo(Money.of(EUR,0));
    }

}