package com.event.web.event.service;


import com.event.entry.Account;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/25 1:45
 * @description
 * @version: v1.0
 */
public interface AccountService {
    Account selectByPrimaryKey(String accountNo);
}
