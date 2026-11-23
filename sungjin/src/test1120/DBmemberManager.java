package test1120;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBmemberManager implements Management<Member>{
    
    @Override 
    public void addItem(Member member) {
        String sql = "INSERT INTO member(u_id, password, name, phone) VALUES (?, ?, ?, ?)";

    try (Connection conn = DBconnector.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"ID"})) {

        pstmt.setString(1, member.getU_id());
        pstmt.setString(2, member.getPassword());
        pstmt.setString(3, member.getName());
        pstmt.setString(4, member.getPhone());

        pstmt.executeUpdate();
                                 // 방금 INSERT된 행의 id 정보
        try (ResultSet rs = pstmt.getGeneratedKeys()) { 
            if (rs.next()) {
                System.out.println("등록 완료! 회원 번호: " + rs.getInt(1));
            }                            // member:  | u_id | password | name | phone | id | 
        }                                // rs.getInt("id") 이거나 마찬가지.    
    } catch (SQLException e) {
        if (e.getErrorCode() == 1) {         // 오류 번호 1	ORA-00001	중복 값 (UNIQUE, PK 위반)
            System.out.println("이미 사용 중인 아이디(또는 전화번호)입니다.");
        } else {
            e.printStackTrace();
        }
    }
}
    @Override 
    public void updateItem(Member member) {

            String sql = new StringBuilder()   
                .append("UPDATE member SET ")
                .append("password=?, ")
                .append("phone=? ")
                .append("WHERE id=?")  
                .toString();    
            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
                
                pstmt.setString(1, member.getPassword());
                pstmt.setString(2, member.getPhone());
                pstmt.setInt(3, member.getId());

                int rows = pstmt.executeUpdate();               
                System.out.println(rows == 0 ? "해당 ID의 회원이 없습니다." : "수정된 행 수 : " + rows);

            } catch (SQLException e) {
                if (e.getErrorCode() == 1) {                     // 전화번호 UNIQUE 위반 가능
                    System.out.println("이미 사용 중인 전화번호입니다.");
                } else {
                    e.printStackTrace();
                }
            }
        }
    @Override 
    public void deleteItem(int id) {

         String sql = "DELETE FROM member WHERE id=?";

            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
                //DB 연결(Connection)과 SQL 실행 도구(PreparedStatement)는 쓰고 나서 반드시 닫기
                // 안 닫으면 DB 연결이 계속 쌓이다가 어느 순간 접속이 막힘
                pstmt.setInt(1, id);
            
                int rows = pstmt.executeUpdate();
                System.out.println(rows == 0 ? "해당 ID가 없습니다." : "삭제된 행 수 : " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }  
    @Override
        public List<Member> findAll() {
            List<Member> list = new ArrayList<>();
            String sql = "SELECT id, u_id, name, phone FROM member";

            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    list.add(new Member(rs.getInt("id"), rs.getString("U_id"), rs.getString("name"), rs.getString("phone")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;
}

    @Override
        public Member findById(int id) {

            String sql = "SELECT id, u_id, name, phone FROM member WHERE id = ?";
            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return new Member(rs.getInt("id"), rs.getString("U_id"), rs.getString("name"), rs.getString("phone"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;   
        }
}    





  
   




    
 
    

 