package org.intel.dcg.dao;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.intel.dcg.domain.Topic;
import java.util.List;

@Repository
public class TopicDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List test(){
        // create or drop tables
//        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
//        jdbcTemplate.execute("CREATE TABLE customers(" +
//                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        List rows = jdbcTemplate.queryForList("SELECT * FROM users");
        System.out.println(rows);
        return rows;
    }


}

