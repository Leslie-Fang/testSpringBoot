package org.intel.dcg.web;

import org.intel.dcg.domain.User;
import org.intel.dcg.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @ResponseBody
    public String loginPost(@RequestBody User user) {
//        loginService.addUser(user);
        return loginService.checkUser(user)?"true":"false";
    }

    //for test
    @RequestMapping(value="/showAllUsers", method = RequestMethod.GET)
    public List<User> showAllUsers() {
        return loginService.getAllUsers();
    }
}
