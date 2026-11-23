package test_practice;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectedJava {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            //Oracle DB와 Java가 통신할 수 있도록 JDBC 드라이버 클래스를 로드하는 과정
            conn = (Connection) DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234");
            System.out.println("연결 성공");

            String sql = ""+
            "INSERT INTO books_test(bookId, bookTitle, bookAuthor)" + " VALUES(?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "세상에서 가장 짧은 경제사");
            pstmt.setString(3, "앤드루 리");

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행수 : " + rows); 
            pstmt.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                    System.out.println("연결 끊기");
                } catch(SQLException e) {}
        }
    }
}
}