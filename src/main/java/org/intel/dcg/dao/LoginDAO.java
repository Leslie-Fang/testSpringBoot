package org.intel.dcg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List getAllUsers(){
        // create or drop tables
//        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
//        jdbcTemplate.execute("CREATE TABLE customers(" +
//                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        List rows = jdbcTemplate.queryForList("SELECT * FROM spring_user");
        System.out.println(rows);
        return rows;
    }

    public boolean saveUser(int id, String name, String password){
        String sql="insert into spring_user (id,username,password) values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{id, name,password});
        return true;
    }

    public boolean checkUser(int id, String name, String password){
        String sql="SELECT * FROM spring_user where username='"+name+"' and password='"+password+"'";
        System.out.println(sql);
        List rows = jdbcTemplate.queryForList(sql);
        System.out.println(rows);
        return !rows.isEmpty();
    }
}
