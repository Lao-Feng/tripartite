package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.dao.BusAccountMapper;
import com.teamax.alleyoop.entity.BusAccount;
import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;

public class AccountUpdateRunnable implements Runnable{
    private BusAccount account;
    private BusAccountMapper accountMapper; // 这个就是注解注入

    public AccountUpdateRunnable(BusAccount account, BusAccountMapper accountMapper) {
        this.account = account;
        this.accountMapper = accountMapper;
    }

    @Override
    public void run() {
        accountMapper.updateByPrimaryKeySelective(account);
    }
}
