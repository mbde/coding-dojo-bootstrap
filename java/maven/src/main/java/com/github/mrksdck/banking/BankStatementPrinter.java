package com.github.mrksdck.banking;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mbdecke on 4/24/16.
 */
public class BankStatementPrinter {

    String headline = "date\t||\tcredit\t||\tdebit\t||\tbalance";
    private String coloumnseperator;

    public List<String> getStatements(Account account) {
        List<String> output = new ArrayList<>();
        output.add(headline);
        return account.getHistory().stream()
                .map(statement -> format(statement))
                .collect(Collectors.toCollection(() -> output));
    }

    private String format(Statement statement) {
        coloumnseperator = "\t||\t";
        return new StringBuilder()
                .append(statement.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .append(coloumnseperator)
                .append(statement.getCredit() != null ? statement.getCredit() : "")
                .append(coloumnseperator)
                .append(statement.getDebit() != null ? statement.getDebit() : "")
                .append(coloumnseperator)
                .append(statement.getBalance())
                .toString();
    }


}
