package com.example.mw.dao;

import com.example.mw.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    //新增一个用户
    void insertUser(User user);

    //通过id查询用户
    User selectUser(int id);

    //通过id删除一个用户
    void deleteUserById(int id);

    //修改用户信息
    void updateUser(User user);
}
