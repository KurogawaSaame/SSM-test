package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

//账户DAO接口（持久层）
public interface AccountDao {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
