package springMvc.learn.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springMvc.learn.service.AccountService;

public class TestSpring {


    @Test
    public void testSpring(){

        /**
         * 测试spring框架
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();









    }






}
