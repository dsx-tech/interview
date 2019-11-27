package uk.dsxt.interview.core;

import uk.dsxt.interview.datamodel.Account;

public interface TransferService {

    Account getAccount(int id);

    void transfer(Account from, Account to, double amount);
}
