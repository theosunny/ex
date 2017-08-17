package com.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/8/17 0017.
 */
@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderDao orderDao ;
//
//    public void setOrderDao(OrderDao orderDao) {
//        this.orderDao = orderDao;
//    }
    public void accountMoney(){
        //转账先少钱
        orderDao.lessMoney();
        int s=100/0;
        //转账后多钱
        orderDao.moreMoney();
    }
}
