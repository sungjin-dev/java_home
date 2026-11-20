package connection_sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionInsert {
    public static void main(String[] args) throws FileNotFoundException {
        Connection conn = null; // conn을 try 블록 바깥에서 선언한 이유는 finally에서도 접근해 닫아야 하기 때문

        try {
            //JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");   //forName이 드라이버 찾음

            //연결하기
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","1234");
            System.out.println("연결 성공");

            //매개변수화된 SQL문 작성
            String sql = ""+
                "INSERT INTO boards(btitle, bcontent, bfilename, bfiledata, bno)" + " VALUES(?, ?, ?, ?, ?)";
            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql); //SQL 인젝션 방어
            pstmt.setString(1, "돌하루방");
            pstmt.setString(2, "화강암 석상");
            pstmt.setString(3, "harubang.jpg");
            pstmt.setBlob(4, new FileInputStream("C:/java_home/sungjin/images/harubang.jpg"));     //(BLOB) 이런식으로 저장됨
            pstmt.setInt(5, 3);

            //SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수 : " + rows);

            //PreparedStatement 닫기
            pstmt.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {   //null 체크 없이 close()를 부르면 연결 실패 때 오히려 NPE가 추가로 터집니다
                try {
                    //연결 끊기
                    conn.close();
                    System.out.println("연결 끊기");
                } catch(SQLException e) {}
            }
        }
    }
}
