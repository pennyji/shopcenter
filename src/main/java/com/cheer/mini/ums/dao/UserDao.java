package com.cheer.mini.ums.dao;

import com.cheer.mini.ums.model.User;

public interface UserDao {

    public User getByAccount(String account);

    public User get(String id);

    public User login(String account, String password);

    public int save(User user);

}
