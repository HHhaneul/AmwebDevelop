package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl?user=BOARD_B1&password=_aA123456";
        String poster = "양식 데이터";
        String sql = "INSERT INTO BOARD_DATA (id, poster, subject, content)" +  "VALUES(board_data_seq.nextval, '" + poster + "', '제목3', '내용3')";

        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println(affectedRows);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
