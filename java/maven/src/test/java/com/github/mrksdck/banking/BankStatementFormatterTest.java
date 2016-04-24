package com.github.mrksdck.banking;

import org.assertj.core.util.Lists;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mbdecke on 4/24/16.
 */
public class BankStatementFormatterTest {
    /**
     * Given a client makes a deposit of 1000 on 10-01-2012
     * And a deposit of 2000 on 13-01-2012
     * And a withdrawal of 500 on 14-01-2012
     * When she prints her bank statement
     * Then she would see
     * date       || credit   || debit    || balance
     * 14/01/2012 ||          || 500.00   || 2500.00
     * 13/01/2012 || 2000.00  ||          || 3000.00
     * 10/01/2012 || 1000.00  ||          || 1000.00
     */

    BankStatementPrinter bankStatementFormatter = new BankStatementPrinter();
    Account account = mock(Account.class);

    @Test
    public void testOutputFormat() {

        List<Statement> statements = new ArrayList<>();

        statements.add(new Statement(new Withdrawal(LocalDate.of(2012, 1, 14), Money.of(CurrencyUnit.EUR, 500)), Money.of(CurrencyUnit.EUR, 2500)));
        statements.add(new Statement(new Deposit(LocalDate.of(2012, 1, 13), Money.of(CurrencyUnit.EUR, 2000)), Money.of(CurrencyUnit.EUR, 3000)));
        statements.add(new Statement(new Deposit(LocalDate.of(2012, 1, 10), Money.of(CurrencyUnit.EUR, 1000)), Money.of(CurrencyUnit.EUR, 1000)));

        when(account.getHistory()).thenReturn(statements);

        List<String> output = bankStatementFormatter.getStatements(account);

        assertThat(output.get(0)).isEqualTo("date\t||\tcredit\t||\tdebit\t||\tbalance");
        assertThat(output.get(1)).isEqualTo("14/01/2012\t||\t\t||\tEUR 500.00\t||\tEUR 2500.00");
        assertThat(output.get(2)).isEqualTo("13/01/2012\t||\tEUR 2000.00\t||\t\t||\tEUR 3000.00");
        assertThat(output.get(3)).isEqualTo("10/01/2012\t||\tEUR 1000.00\t||\t\t||\tEUR 1000.00");
    }

}
