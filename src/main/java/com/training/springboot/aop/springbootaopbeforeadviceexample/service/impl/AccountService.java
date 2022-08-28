package com.training.springboot.aop.springbootaopbeforeadviceexample.service.impl;

import com.training.springboot.aop.springbootaopbeforeadviceexample.model.Account;
//creating interface that throws exception if the customer id not found
public interface AccountService
{
    public abstract Account getAccountByCustomerId(String customerId)
            throws Exception;
}