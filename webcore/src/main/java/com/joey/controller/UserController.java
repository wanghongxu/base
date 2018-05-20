package com.joey.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.joey.model.User;
import com.joey.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
        User user = new User();
        user.setUserName("Joey");
        logger.info("Start to Index");
        model.addAttribute("user", user);
        return "showUser";
    }

    @ResponseBody
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public User getUser(@PathVariable("id")String id){

        User user = new User();
        user.setUserName("Joey");

        return user;
    }


}