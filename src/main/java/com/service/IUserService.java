package com.service;

import com.entity.User;

import java.util.List;

public interface IUserService {

     boolean register(User user);

     List getAllUser();

     /**
      * ��userAccount�˺ŵ�money���ת��User
      * @param userAccount
      * @param user
      * @param money
      * @return
      */
     boolean zhuanzhang(String userAccount,String user,int money);

     void A(String userAccount,int money);

     void B(String user,int money) ;
}
