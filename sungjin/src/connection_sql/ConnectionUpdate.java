
            //매개변수화된 SQL문 작성
            String sql = new StringBuilder()   //가변 객체라서 이어서 붙이나 봄 쭉 이어서 SQL쿼리를 만듦
                .append("UPDATE boards SET ")
                .append("btitle=?, ")
                .append("bcontent=?, ")
                .append("bfilename=?, ")
                .append("bfiledata=? ")
                .append("WHERE bno=?")
                .toString();    // StringBuilder객체를 다시 String 문자열로 변환시켜줌.

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "javasql.jpg");
            pstmt.setBlob(4, new FileInputStream("C:/java_home/sungjin/images/javasql.jpg"));
            pstmt.setInt(5, 5);

            //SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수 : " + rows);

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
