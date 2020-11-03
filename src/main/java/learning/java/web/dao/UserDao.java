/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.dao;

import org.apache.ibatis.annotations.Mapper;

import learning.java.web.entity.User;

/**
 * 用户持久化类
 * 
 * @author Rayliu40k
 * @version $Id: UserDao.java, v 0.1 Oct 30, 2020 3:54:00 PM Rayliu40k Exp $
 */
@Mapper
public interface UserDao {

    /**
     * 添加用户
     */
    void addUser(User user);

    /**
     * 根据用户名查询用户
     */
    User getUserByUsername(String username);

}
