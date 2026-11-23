

            //매개변수화된 SQL문 작성
            String sql = "DELETE FROM boards WHERE btitle=?";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");
        

            //SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수 : " + rows);

            //PreparedStatement 닫기
            pstmt.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
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
