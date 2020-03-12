package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

//表现层

public interface AccountService {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
