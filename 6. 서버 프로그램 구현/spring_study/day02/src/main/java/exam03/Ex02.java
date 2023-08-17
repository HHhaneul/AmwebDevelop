package exam03;

import java.sql.*;
import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "BOARDTEST";
        String password = "aA123456";
        String sql = "SELECT * FROM BOARD_";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                long id = rs.getLong("ID");
                String poster = rs.getString("POSTER");
                String subject = rs.getString("SUBJECT");
                String content = rs. getString("CONTENT");
                LocalDateTime regdt = rs.getTimestamp("REGDT").toLocalDateTime();

                System.out.printf("id=%d, poster=%s, subject=%s, content=%s, regdt=%s%n", id, poster, subject, content, regdt);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
