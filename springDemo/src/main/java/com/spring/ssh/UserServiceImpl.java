package com.spring.ssh;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/8/23 0023.
 */
@Transactional
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("---------service-------------");
        userDao.add();
    }
}
