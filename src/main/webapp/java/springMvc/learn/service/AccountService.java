package springMvc.learn.service;


import springMvc.learn.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();
    public void saveAccount(Account account);

}
