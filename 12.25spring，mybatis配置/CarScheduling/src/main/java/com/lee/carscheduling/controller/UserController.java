package com.lee.carscheduling.controller;

import com.lee.carscheduling.model.User;
import com.lee.carscheduling.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

//    @RequestMapping("/showUser")
//    public String toIndex(HttpServletRequest request, Model model) {
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserByID(userId);
//        //绑定对象到User.jsp
//        model.addAttribute("user", user);
//        return "User";
//
//    }
    @ResponseBody
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserByID(userId);
    //绑定对象到User.jsp
        model.addAttribute("user", user);
    //return "User";
        return "这里直接输出："+ user.getUserName();
    }
}

