/**
O * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import learning.java.web.constant.Constants;
import learning.java.web.dao.UserDao;
import learning.java.web.entity.User;
import learning.java.web.model.RestResponse;

/**
 * 首页
 * 
 * @author Rayliu40k
 * @version $Id: IndexController.java, v 0.1 Oct 30, 2020 3:15:30 PM Rayliu40k Exp $
 */
@RestController
public class LoginController {

    /** 日志 */
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserDao             userDao;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public RestResponse<?> login(String username, String password) {

        //校验
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return new RestResponse<>(Constants.FAILURE, "用户名或密码不存在", "用户名或密码不存在");
        }

        try {
            User user = this.userDao.getUserByUsername(username);
            if (null == user) {
                return new RestResponse<>(Constants.FAILURE, "用户登录失败", "用户不存在");
            }
            //对密码做MD5
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
            if (!StringUtils.equals(md5Password, user.getPassword())) {
                return new RestResponse<>(Constants.FAILURE, "用户登录失败", "密码错误");
            }
        } catch (Exception e) {
            logger.error("用户登录失败", e);
            return new RestResponse<>(Constants.FAILURE, "用户登录失败", ExceptionUtils.getStackTrace(e));
        }

        return new RestResponse<>(Constants.SUCCESS);
    }

    /**
     * 用户注册
     */
    @PostMapping("/doRegister")
    public RestResponse<?> register(String username, String password) {

        try {
            //对密码做MD5
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
            this.userDao.addUser(new User(username, md5Password));
        } catch (Exception e) {
            logger.error("用户注册失败", e);
            return new RestResponse<>(Constants.FAILURE, "用户注册失败", ExceptionUtils.getStackTrace(e));
        }

        return new RestResponse<>(Constants.SUCCESS);
    }

    @PostMapping("/modifyPassword")
    public RestResponse<?> modifyPassword(String username, String password1, String password2) {

        //校验
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password1)
            || StringUtils.isEmpty(password2)) {
            return new RestResponse<>(Constants.FAILURE, "用户名或密码不存在", "用户名或密码不存在");
        }
        if (!password1.equals(password2)) {
            return new RestResponse<>(Constants.FAILURE, "密码不一致", "密码不一致");
        }
        return new RestResponse<>(Constants.SUCCESS);
    }
}
