package com.training.springboot.aop.springbootaopbeforeadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.training.springboot.aop.springbootaopbeforeadviceexample.model.Account;
import com.training.springboot.aop.springbootaopbeforeadviceexample.service.impl.AccountService;
import com.training.springboot.aop.springbootaopbeforeadviceexample.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringbootAopAfterReturningAdviceExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(SpringbootAopAfterReturningAdviceExampleApplication.class, args);
//Fetching the account object from the application context
        AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
        Account account;
        try {
            account = accountService.getAccountByCustomerId("K2434567");
            if (account != null)
                System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
