package org.intel.dcg.service;

import org.intel.dcg.domain.User;
import org.intel.dcg.web.LoginController;
import org.intel.dcg.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginDAO loginDAO;

    private List<User> myUsers = new ArrayList<User>();

    public LoginService(){
//        myUsers.add(new User(1,"leslie","hhh"));
//        myUsers.add(new User(2,"mango","hhh2"));
//        this.getAllUsers();
    }

    public void addUser(User user){
//        myUsers.add(user);
        //save data to databases
        loginDAO.saveUser(user.getId(),user.getName(),user.getPassword());
    }

    public List<User> getAllUsers(){
//        System.out.println(loginDAO.getAllUsers());
//        List<User> myUsers2 = loginDAO.getAllUsers();
        myUsers = loginDAO.getAllUsers();
        return myUsers;
    }

    public boolean checkUser(User user){
        return loginDAO.checkUser(user.getId(),user.getName(),user.getPassword());
    }
}
