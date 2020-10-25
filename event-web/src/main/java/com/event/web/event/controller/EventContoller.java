package com.event.web.event.controller;

import com.event.entry.Account;
import com.event.web.event.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 21:04
 * @description
 * @version: v1.0
 */
@RestController
public class EventContoller {
    @Autowired
    AccountService accountService;
    @RequestMapping("/hello")
    public Account getAccount(@Param("accountNo")String accountNo){
        return accountService.selectByPrimaryKey(accountNo);
    }
}
