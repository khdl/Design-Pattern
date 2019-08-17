package com.yu.template;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: Template
 * @author: yu.liu
 * @date: 2019/8/17 09:47
 * @description:
 */
public   class JdbcTemplate {

    private DataSource dataSource;
    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }
    private Connection getConnection() throws SQLException {
        return  this.dataSource.getConnection();
    }
    private PreparedStatement creatPreparedStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement psmt,Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            psmt.setObject(i, values[i]);
        }
        return psmt.executeQuery();
    }

    private void closeStatement(Statement statement)  throws Exception{
        statement.close();
    }

    private void closeResultSet(ResultSet resultSet)  throws Exception{
        resultSet.close();
    }

    private void closeConnection(Connection connection)  throws Exception{
        connection.close();
    }
    private List<?> processResultSet(ResultSet rs, RowMapper<?> rowMapper) throws SQLException {
          List<Object> result = new ArrayList<>();
          int num = 1;
          while (rs.next()){
              result.add(rowMapper.mapRow(rs,num++));
          }
          return result;
    }


    public  List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        try {
            Connection connection = getConnection();
            PreparedStatement psmt = creatPreparedStatement(connection,sql);
            ResultSet rs = executeQuery(psmt,values);
            //解析语句集
            List<?>  result =processResultSet(rs,rowMapper);

            this.closeResultSet(rs);
            this.closeStatement(psmt);
            this.closeConnection(connection);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //  protected abstract Object processResult(ResultSet rs, int i);


}
