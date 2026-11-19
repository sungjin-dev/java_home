package library_system;

/** 시스템의 "할 일 목록"만 정의한 인터페이스 (어떻게 할지는 구현 클래스가 결정) */
public interface Manageable {
    void addItem(Book book);    // 데이터 추가
    void displayAll();          // 전체 목록 출력
    void saveToFile();          // 파일로 데이터 저장
    void loadFromFile();        // 파일에서 데이터 로드
}
