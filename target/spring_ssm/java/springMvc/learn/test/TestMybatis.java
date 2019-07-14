package springMvc.learn.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import springMvc.learn.dao.AccountDao;
import springMvc.learn.domain.Account;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void testMybatis() throws IOException {
        //加载配置文件

        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> list= dao.findAll();

        for(Account account:list){
            System.out.println(account);
        }
        session.close();
        in.close();
    }


    @Test
    public void testSave() throws IOException {

        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account(3,"linick",1000.2);

        dao.saveAccount(account);

        // 提交事务,否则不会保存到数据库
        session.commit();

        List<Account> list= dao.findAll();

        for(Account account1:list){
            System.out.println(account1);
        }
        session.close();
        in.close();



    }


}
