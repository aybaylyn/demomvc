package com.may.controller;

import com.may.domain.User;
import com.may.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


/**
 * Created by May on 3/16/17.
 */
@Controller
@RequestMapping("/users")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String userName, String password, Model model) {

        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()){
            subject.logout();
        }
        //传递token给shiro的realm
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);

        subject.login(token);

        User user = userService.findByName(userName);


        model.addAttribute("user", user);


        return "/index";
    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String initLogin() {
        return "/login";
    }

    @RequestMapping("/logout")
    public String logOut() {

        Subject subject = SecurityUtils.getSubject();
        if (null != subject){
            subject.logout();

        }

        return "/login";
    }


}
