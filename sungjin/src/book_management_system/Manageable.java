package book_management_system;

public interface Manageable {
    public void addItem(Book book);    // 데이터 추가
    void displayAll();          // 전체 목록 출력
    void saveToFile();          // 파일로 데이터 저장
    void loadFromFile();        // 파일에서 데이터 로드
}





























// // 5. 제네릭 클래스 구현
// class InMemoryRepository<T extends Identifiable>
//         implements Repository<T> {

//    
// }

// // 6. 제네릭 상속
// class BookRepository extends InMemoryRepository<Book> {
// }

// // 7. 멀티 타입 파라미터
// class Pair<K, V> {
//     private final K key;
//     private final V value;

//     public Pair(K key, V value) {
//         this.key = key;
//         this.value = value;
//     }

//     public K getKey() {
//         return key;
//     }

//     public V getValue() {
//         return value;
//     }
// }

// public class Main {

//     // 8. 제네릭 메소드
//     public static <T> void printAll(Collection<T> items) {
//         for (T item : items) {
//             System.out.println(item);
//         }
//     }

//     // 9. 상한 제한 와일드카드
//     public static void printCatalog(
//             List<? extends CatalogItem> items) {

//         for (CatalogItem item : items) {
//             System.out.println(item.getTitle());
//         }
//     }

//     // 10. 하한 제한 와일드카드
//     public static void copyBooks(
//             List<? extends Book> source,
//             List<? super Book> destination) {

//         for (Book book : source) {
//             destination.add(book);
//         }
//     }

//     // 11. 제한된 타입 파라미터
//     public static <T extends Number> double sum(List<T> numbers) {

//         double total = 0;

//         for (T number : numbers) {
//             total += number.doubleValue();
//         }

//         return total;
//     }

//     public static void main(String[] args) {

//         // 도서 객체 생성
//         Book book1 = new Book("B001", "Java", 2024);
//         Book book2 = new Book("B002", "Python", 2023);
//         Book book3 = new Book("B003", "SQL", 2025);

//         // 12. 제네릭 저장소
//         BookRepository repository = new BookRepository();

//         repository.save(book1);
//         repository.save(book2);
//         repository.save(book3);

//         System.out.println("=== 도서 전체 조회 ===");

//         List<Book> books = repository.findAll();
//         printAll(books);

//         // Map을 이용한 ID 조회
//         System.out.println("\n=== 도서 검색 ===");

//         repository.findById("B001")
//                 .ifPresent(System.out::println);

//         // 13. List: 순서와 중복 허용
//         List<Book> readingList = new ArrayList<>(books);

//         readingList.add(book1);

//         System.out.println("\n독서 목록 개수: "
//                 + readingList.size());

//         // 14. Set: 중복 제거
//         Set<String> tags = new HashSet<>();

//         tags.add("Java");
//         tags.add("Database");
//         tags.add("Java");

//         System.out.println("\n=== 태그 ===");
//         System.out.println(tags);

//         // 15. TreeSet: Comparable 기본 정렬
//         Set<Book> sortedBooks = new TreeSet<>(books);

//         System.out.println("\n=== 제목순 정렬 ===");
//         printAll(sortedBooks);

//         // 16. Comparator: 별도 정렬 기준
//         Set<Book> yearSorted = new TreeSet<>(
//                 Comparator.comparingInt(Book::getYear)
//                           .thenComparing(Book::getId)
//         );

//         yearSorted.addAll(books);

//         System.out.println("\n=== 출판연도순 정렬 ===");
//         printAll(yearSorted);

//         // 17. Wildcard: 상위 타입으로 조회
//         System.out.println("\n=== 카탈로그 조회 ===");
//         printCatalog(books);

//         // 18. Wildcard: 다른 컬렉션에 복사
//         List<CatalogItem> catalog = new ArrayList<>();

//         copyBooks(books, catalog);

//         System.out.println("\n카탈로그 복사 결과:");
//         printAll(catalog);

//         // 19. 제한된 타입 파라미터
//         List<Integer> scores = Arrays.asList(90, 80, 70);

//         System.out.println("\n점수 합계: " + sum(scores));

//         // 20. 멀티 타입 파라미터
//         Pair<String, Integer> bookInfo =
//                 new Pair<>("총 도서 수", books.size());

//         System.out.println("\n" + bookInfo.getKey()
//                 + ": " + bookInfo.getValue());

//         // 21. Queue: FIFO
//         Queue<String> borrowRequests = new LinkedList<>();

//         borrowRequests.offer("회원 A");
//         borrowRequests.offer("회원 B");
//         borrowRequests.offer("회원 C");

//         System.out.println("\n=== 대출 요청 처리 ===");

//         while (!borrowRequests.isEmpty()) {
//             System.out.println(borrowRequests.poll());
//         }

//         // 22. Stack: LIFO
//         Stack<String> history = new Stack<>();

//         history.push("도서 등록");
//         history.push("도서 수정");
//         history.push("도서 삭제");

//         System.out.println("\n=== 최근 작업 취소 ===");

//         System.out.println(history.pop());
//         System.out.println(history.peek());
//     }
// }