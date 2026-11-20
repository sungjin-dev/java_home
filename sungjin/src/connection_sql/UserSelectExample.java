package connection_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
    public static void main(String[] args) {
         Connection conn = null;

         try {
            //JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");   //forName이 드라이버 찾음

            //연결하기
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","1234");
            System.out.println("연결 성공");

            //매개변수화된 SQL문 작성
            String sql = ""+
                "SELECT userid, username, userpassword, userage, usermail " + 
                "FROM users " +
                "WHERE userid=?";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql); //SQL 인젝션 방어
            pstmt.setString(1, "winter");

            //SQL 문 실행 후, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setUserage(rs.getInt(4));
                user.setUserid(rs.getString(5));
                System.out.println(user);
            } else {
                System.out.println("사용자 아이디가 존재하지 않음");
            }
            rs.close();;

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    //연결 끊기
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}