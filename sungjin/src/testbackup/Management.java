package testbackup;

public interface Management {
    void addItem(Book book);    // 데이터 추가
    void displayAll();          // 전체 목록 출력
    void saveAll();          // 파일로 데이터 저장
    void loadAll();        // 파일에서 데이터 로드
    void searchBook(int id);
}
