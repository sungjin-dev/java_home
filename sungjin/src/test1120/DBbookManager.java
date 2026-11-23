package test1120;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBbookManager implements Management<Book>{
    
    @Override 
    public void addItem(Book book) {
        String sql = "INSERT INTO book(title, author) VALUES (?, ?)";

    try (Connection conn = DBconnector.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());

        int rows = pstmt.executeUpdate();
        System.out.println("저장된 행 수 : " + rows);

    } catch (SQLException e) {
         e.printStackTrace();
        }
    }
    @Override 
    public void updateItem(Book book) {

            String sql = new StringBuilder()   
                .append("UPDATE book SET ")
                .append("title=?, ")
                .append("author=? ")
                .append("WHERE id=?")  // WHERE 앞에 쉼표 오는거 주의
                .toString();    // StringBuilder객체를 다시 String 문자열로 변환시켜줌.
            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
                
                pstmt.setString(1, book.getTitle());
                pstmt.setString(2, book.getAuthor());
                pstmt.setInt(3, book.getId());
    
                int rows = pstmt.executeUpdate();
                System.out.println(rows == 0 ? "해당 ID의 도서가 없습니다." : "수정된 행 수 : " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
    @Override 
    public void deleteItem(int id) {

         String sql = "DELETE FROM book WHERE id=?";

            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
                //DB 연결(Connection)과 SQL 실행 도구(PreparedStatement)는 쓰고 나서 반드시 닫기
                // 안 닫으면 DB 연결이 계속 쌓이다가 어느 순간 접속이 막힘
                pstmt.setInt(1, id);
            
                int rows = pstmt.executeUpdate();
                System.out.println(rows == 0 ? "해당 ID의 도서가 없습니다." : "삭제된 행 수 : " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }  
    @Override
        public List<Book> findAll() {
            List<Book> list = new ArrayList<>();
            String sql = "SELECT id, title, author FROM book";

            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    list.add(new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;
            
        }

    @Override
        public Book findById(int id) {

            String sql = "SELECT id, title, author FROM book WHERE id = ?";
            try (Connection conn = DBconnector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;   
        }
}    





  
   




    
 
    

 