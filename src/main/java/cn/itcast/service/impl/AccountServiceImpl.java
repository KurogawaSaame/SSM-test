package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

//实现类
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户信息...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户信息...");
    }
}
