package springMvc.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springMvc.learn.dao.AccountDao;
import springMvc.learn.domain.Account;
import springMvc.learn.service.AccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");


        return accountDao.findAll();
        //return null;
    }


    public void saveAccount(Account account) {
        System.out.println("业务层保存账户");

        accountDao.saveAccount(account);
    }
}
