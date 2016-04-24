import com.github.mrksdck.banking.Account;
import com.github.mrksdck.banking.BankStatementPrinter;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.mockito.Mock;

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
     And a deposit of 2000 on 13-01-2012
     And a withdrawal of 500 on 14-01-2012
     When she prints her bank statement
     Then she would see
     date       || credit   || debit    || balance
     14/01/2012 ||          || 500.00   || 2500.00
     13/01/2012 || 2000.00  ||          || 3000.00
     10/01/2012 || 1000.00  ||          || 1000.00
     */

    BankStatementPrinter bankStatementFormatter = mock(BankStatementPrinter.class);
    Account account = mock(Account.class);

    @Test
    public void testOutputFormat(){

        when(bankStatementFormatter.getStatements(account))
                .thenReturn(Lists.newArrayList(
                        "date\t||\tcredit\t||\tdebit\t||\tbalance",
                        "14/01/2012\t||\t\t||\t500.00\t||\t2500.00",
                        "13/01/2012\t||\t2000.00\t||\t\t||\t3000.00",
                        "10/01/2012\t||\t1000.00\t||\t\t||\t1000.00"));

        List<String> statements = bankStatementFormatter.getStatements(account);

        assertThat(statements.get(0)).isEqualTo("date\t||\tcredit\t||\tdebit\t||\tbalance");
        assertThat(statements.get(1)).isEqualTo("14/01/2012\t||\t\t||\t500.00\t||\t2500.00");
        assertThat(statements.get(2)).isEqualTo("13/01/2012\t||\t2000.00\t||\t\t||\t3000.00");
        assertThat(statements.get(3)).isEqualTo("10/01/2012\t||\t1000.00\t||\t\t||\t1000.00");
    }

}
