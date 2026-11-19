package praticeGenericLibary;

/**
 * [제네릭 1단계] 인터페이스에 <T> 붙이기
 * 예전: void addItem(Book book);   -> Book만 받을 수 있음
 * 지금: void addItem(T item);      -> T 자리에 뭘 넣느냐에 따라 달라짐 (Book, Member, ...)
 */
public interface Manageable<T> {
    void addItem(T item);       // 데이터 추가
    void displayAll();          // 전체 목록 출력
    void saveToFile();          // 파일로 데이터 저장
    void loadFromFile();        // 파일에서 데이터 로드
}
