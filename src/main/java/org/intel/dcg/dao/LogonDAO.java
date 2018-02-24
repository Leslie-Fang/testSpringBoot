package org.intel.dcg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LogonDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean saveUser(int id, String name, String password){
        String sql="insert into spring_user (id,username,password) values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{id, name,password});
        return true;
    }
}
