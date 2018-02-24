package org.intel.dcg.web;

import org.intel.dcg.domain.User;
import org.intel.dcg.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public List<User> loginPost(@RequestBody User user) {
        System.out.println(user);
        loginService.addUser(user);
        return loginService.getAllUsers();
//        ModelAndView modelAndView = new ModelAndView("main");
//        return modelAndView;
    }

    //for test
    @RequestMapping(value="/showAllUsers", method = RequestMethod.GET)
    public List<User> showAllUsers() {
        return loginService.getAllUsers();
    }
}
