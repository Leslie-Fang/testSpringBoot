package org.intel.dcg.service;

import org.intel.dcg.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private List<User> myUsers = new ArrayList<User>();

    public LoginService(){
        myUsers.add(new User(1,"leslie","hhh"));
        myUsers.add(new User(2,"mango","hhh2"));
    }

    public void addUser(User user){
        myUsers.add(user);
    }

    public List<User> getAllUsers(){
        return myUsers;
    }
}
