package org.intel.dcg.web;

import org.intel.dcg.domain.User;
import org.intel.dcg.service.LogonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/logon")
public class LogonController {
    @Autowired
    private LogonService logonService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("logon");
        return modelAndView;
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    @ResponseBody
    public String loginPost(@RequestBody User user) {
//        loginService.addUser(user);
        return logonService.addUser(user)?"true":"false";
    }
}
