package org.intel.dcg.service;

import org.intel.dcg.dao.LogonDAO;
import org.intel.dcg.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogonService {
    @Autowired
    private LogonDAO logonDAO;

    public boolean addUser(User user){
//        myUsers.add(user);
        //save data to databases
        return logonDAO.saveUser(user.getId(),user.getName(),user.getPassword());
    }
}
