package com.cheer.mini.ums.dao;

import java.util.List;

import com.cheer.mini.ums.model.User;

public interface UserDao {

    public User getByAccount(String account);

    public User login(String account, String password);

    public int save(User user);
    
    public List<User> queryAll();
    
    public void update(User user);

}
