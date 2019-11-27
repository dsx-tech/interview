package uk.dsxt.interview;

import uk.dsxt.interview.core.AccountLoadingProvider;
import uk.dsxt.interview.core.DefaultAccountLoadingProviderImpl;
import uk.dsxt.interview.core.TransferService;
import uk.dsxt.interview.core.TransferServiceImpl;

public class Main {
    public static void main(String[] args) {
        AccountLoadingProvider defaultAccountLoadingProvider = new DefaultAccountLoadingProviderImpl();
        TransferService transferService = new TransferServiceImpl(defaultAccountLoadingProvider);
        //TODO add some infrastructure code here
    }
}
