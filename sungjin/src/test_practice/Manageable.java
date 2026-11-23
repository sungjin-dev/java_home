package test_practice;

public interface Manageable {
    void addItem(Book book);    // 데이터 추가
    void displayAll();          // 전체 목록 출력
    void loadALL();        // 파일에서 데이터 로드
}
