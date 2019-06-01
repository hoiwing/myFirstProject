package test;

import org.junit.Test;

import java.sql.*;

public class TestUtils {
    @Test
    public void JDBCTest(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String drive = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day17?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "lhr802312";
        try{
            Class.forName(drive);
            conn = DriverManager.getConnection(url,user,password);
            if(!conn.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
