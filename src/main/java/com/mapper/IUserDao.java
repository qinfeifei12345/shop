package com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dao")
public interface IUserDao {

    List queryAll();

  /*  void insert(User u);

    User queryUserByName(String name);*/

    void updateUserMoney(@Param("uname") String uname, @Param("money") int money);

}
