package com.github.mrksdck.banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbdecke on 4/24/16.
 */
public class Account {
    private List<Statement> history;

    public Account() {
        history = new ArrayList<>();
    }

    public List<Statement> getHistory() {
        return history;
    }
}
