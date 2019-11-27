package uk.dsxt.interview.core;

import lombok.SneakyThrows;
import uk.dsxt.interview.datamodel.Account;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class DefaultAccountLoadingProviderImpl implements AccountLoadingProvider {
    @Override
    @SneakyThrows
    public void load(Map<Integer, Account> accountById) {
        URL resource = Thread.currentThread().getContextClassLoader().getResource("accounts.txt");
        if (resource == null)
            return;
        List<String> lines = Files.readAllLines(Paths.get(resource.toURI()), StandardCharsets.UTF_8);
        lines.stream().forEach(s -> {
            String[] split = s.split(";");
            if (split.length != 2)
                return;
            int id = Integer.parseInt(split[0]);
            double balance = Double.parseDouble(split[1]);
            accountById.put(id, new Account(id, balance));
        });
    }
}
