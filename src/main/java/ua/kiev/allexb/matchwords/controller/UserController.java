package ua.kiev.allexb.matchwords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.allexb.matchwords.model.User;
import ua.kiev.allexb.matchwords.service.UserService;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {

    public UserController() {
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users_list", method = RequestMethod.GET)
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = userService.getAll();

        modelAndView.addObject("users_list", users);
        modelAndView.setViewName("users-list");

        return modelAndView;
    }

}
