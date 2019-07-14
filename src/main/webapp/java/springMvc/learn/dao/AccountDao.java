package springMvc.learn.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import springMvc.learn.domain.Account;

import java.util.List;

/**
 * mybatis框架帮我们实现一个类
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

}
