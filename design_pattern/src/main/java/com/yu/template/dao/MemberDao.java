package com.yu.template.dao;

import com.yu.template.JdbcTemplate;
import com.yu.template.entity.Member;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @className: MemberDao
 * @author: yu.liu
 * @date: 2019/8/17 09:57
 * @description:
 */
public class MemberDao  {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query(){

        String sql ="select * from user";
        return jdbcTemplate.executeQuery(sql, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                System.out.println("具体不同的实现");
                return new Member();
            }
        },null);
    }

/*    protected Object processResult(ResultSet rs, int i) {
        System.out.println("具体不同的实现");
        return new Member();
    }*/
}
