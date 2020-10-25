package com.event.web.event.service.impl;

import com.event.dao.AccountMapper;
import com.event.entry.Account;
import com.event.web.event.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/25 1:49
 * @description
 * @version: v1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account selectByPrimaryKey(String accountNo) {
        return accountMapper.selectByPrimaryKey(accountNo);
    }
}
