package exam03;

import java.sql.*;
import java.time.LocalDateTime;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "BOARD_B1";
        String password = "_aA123456";
        String sql = "INSERT INTO BOARD_DATA (id, poster, subject, content) VALUES (board_data_seq.nextval, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[]{"ID"})) {
            pstmt.setString(1, "작성자1");
            pstmt.setString(2, "제목1");
            pstmt.setString(3, "내용1");

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0){
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    long id = rs.getLong(1);
                    System.out.printf("게시글 번호: %d%n", id);
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
