package com.github.mrksdck.banking;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by mbdecke on 4/24/16.
 */
public class AccountTest {

    @Test
    public void testDeposit(){
        Account account = new Account();
        Deposit deposit = new Deposit(LocalDate.of(2016, 1, 1), Money.of(CurrencyUnit.EUR, 100.00));
        account.process(deposit);
        assertThat(account.getBalance().toString()).isEqualTo("EUR 100.00");
    }

    @Test
    public void testWithdrawal(){
        Account account = new Account();
        Withdrawal withdrawal = new Withdrawal(LocalDate.of(2016, 1, 1), Money.of(CurrencyUnit.EUR, 100.00));
        account.process(withdrawal);
        assertThat(account.getBalance().toString()).isEqualTo("EUR -100.00");
    }

}