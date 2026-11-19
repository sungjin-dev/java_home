package library_system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * BookManager
 * 핵심 아이디어 딱 2개:
 *   1) books  : 책을 꽂는 100칸짜리 선반 (처음엔 전부 비어 있음 = null)
 *   2) count  : 지금 꽂힌 책 권수 (= 다음에 꽂을 빈칸 번호)
 */
public class BookManager implements Manageable {

    private Book[] books = new Book[100];   // 선언과 동시에 100칸 생성
    private int count = 0;                  // 처음엔 0권

    // ---------- 1. 등록 ----------
    @Override
    public void addItem(Book book) {
        // 선반이 꽉 찼는지 확인
        if (count == books.length) {
            System.out.println("결과: 선반이 가득 찼습니다.");
            return;
        }

        // 같은 ID가 이미 있는지 확인 (꽂힌 칸만 0 ~ count-1 까지 검사)
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == book.getId()) {
                System.out.println("결과: 이미 있는 ID입니다.");
                return;
            }
        }

        books[count] = book;    // 1) 빈칸(count번)에 책을 꽂고
        count = count + 1;      // 2) 권수를 1 늘린다  (한 줄로 쓰면 books[count++] = book;)
        System.out.println("결과: 성공적으로 등록되었습니다.");
    }

    // ---------- 2. 조회 ----------
    @Override
    public void displayAll() {
        if (count == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        System.out.println("ID\t제목\t\t저자");
        System.out.println("------------------------------------");
        for (int i = 0; i < count; i++) {          // books.length(100)가 아니라 count까지!
            
            System.out.println(books[i].getId() + "\t" + books[i].getTitle() + "\t\t" + books[i].getAuthor());
        }
    }

    // ---------- 3. 저장 ----------
    @Override
    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("books.txt");   // 덮어쓰기 모드
            for (int i = 0; i < count; i++) {
                writer.write(books[i].toFileString() + "\n");  // 한 권 = 한 줄
            }
            writer.close();
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("저장 중 오류가 발생했습니다.");
        }
    }

    // ---------- 4. 불러오기 ----------
    @Override
    public void loadFromFile() {
        File file = new File("books.txt");
        if (!file.exists()) {
            return;     // 파일이 없으면 그냥 빈 상태로 시작
        }

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine() && count < books.length) {
                String line = fileScanner.nextLine();      // "101,Java Programming,kang eunhee"
                Book book = Book.fromFileString(line);     // 한 줄 -> Book 객체
                if (book != null) {
                    books[count] = book;
                    count = count + 1;
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("불러오기 중 오류가 발생했습니다.");
        }
    }
}