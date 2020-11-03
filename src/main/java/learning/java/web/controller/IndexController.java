/**
O * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * 
 * @author Rayliu40k
 * @version $Id: IndexController.java, v 0.1 Oct 30, 2020 3:15:30 PM Rayliu40k Exp $
 */
@Controller
public class IndexController {

    /**
     * 首页
     */
    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }

    /**
     * 首页
     */
    @RequestMapping("/home")
    public String home(String username, Model model) {
        model.addAttribute("username", username);
        return "home";
    }

    /**
     * 首页
     */
    @RequestMapping("/register")
    public String home() {
        return "register";
    }

}
