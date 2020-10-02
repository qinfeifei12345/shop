package com.service.impl;

import com.entity.User;
import com.mapper.IUserDao;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "service")
public class IUserServiceImpl implements IUserService {

    @Resource
    private  IUserDao dao;
    public boolean register(User user) {
        return false;
    }

    public List getAllUser() {
        return dao.queryAll();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean zhuanzhang(String userAccount, String user, int money) {

            A(userAccount,money);

            B(user,money);

        return false;
    }
   /*  ¡±begin transation ¡°
    update user_tab set money =money +100 where uname='ÍõÎå'£»
    update user_tab set money =money -100 where uname='lisi';
    commit;*/

   @Transactional(propagation = Propagation.REQUIRED)
    public void A(String userAccount, int money) {
        dao.updateUserMoney(userAccount,-money);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void B(String user, int money){
       dao.updateUserMoney(user,+money);
    }
}
