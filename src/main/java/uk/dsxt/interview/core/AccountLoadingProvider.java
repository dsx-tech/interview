package uk.dsxt.interview.core;

import uk.dsxt.interview.datamodel.Account;

import java.util.Map;

public interface AccountLoadingProvider {
    void load(Map<Integer, Account> accountById);
}
