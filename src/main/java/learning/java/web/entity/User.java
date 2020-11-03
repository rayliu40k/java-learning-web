/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.entity;

import lombok.Data;

/**
 * 用户模型
 * 
 * @author Rayliu40k
 * @version $Id: User.java, v 0.1 Nov 3, 2020 3:17:01 PM Rayliu40k Exp $
 */
@Data
public class User {

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /**
     * 构造方法
     */
    public User() {
    }

    /**
     * 构造方法
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
