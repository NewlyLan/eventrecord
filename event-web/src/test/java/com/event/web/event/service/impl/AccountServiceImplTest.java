package com.event.web.event.service.impl;

import com.event.entry.Account;
import com.event.web.event.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/25 15:51
 * @description
 * @version: v1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    void selectByPrimaryKey() {
        Account account = accountService.selectByPrimaryKey("18833003550");
        System.out.println("查询结果：" + account);
    }
}