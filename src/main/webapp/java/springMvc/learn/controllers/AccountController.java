package springMvc.learn.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springMvc.learn.domain.Account;
import springMvc.learn.service.AccountService;
import springMvc.learn.service.impl.AccountServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

//    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountService accountService;


    @RequestMapping("/test")
    public String test(Model model){
        System.out.println("表现层:查询所有客户");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);

        for(Account ac:list){
            System.out.println(ac);
        }
        //调用service的方法
        return "list";
    }

    @RequestMapping("/testMybatisSave")
    public void testMybatis(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {

        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/test");

    }










}
