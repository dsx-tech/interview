package uk.dsxt.interview.core;

import uk.dsxt.interview.datamodel.Account;

import java.util.HashMap;
import java.util.Map;

public class TransferServiceImpl implements TransferService {

    private Map<Integer, Account> accountById = new HashMap<>();

    public TransferServiceImpl(AccountLoadingProvider accountLoadingProvider) {
        accountLoadingProvider.load(accountById);
    }

    @Override
    public Account getAccount(int id) {
        return accountById.get(id);
    }

    @Override
    public void transfer(Account from, Account to, double amount) {
        //TODO implement thread safety transfer logic here
    }
}
