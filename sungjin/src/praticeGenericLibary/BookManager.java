package praticeGenericLibary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Manageable<Book>  : "T 자리에 Book을 넣어서 구현하겠다"
 * Shelf<Book>       : "T 자리에 Book을 넣은 선반을 쓰겠다"
 * 배열/count 관리는 Shelf가 하고, BookManager는 책에만 해당하는 일(ID 중복, 파일 변환)을 한다.
 */
public class BookManager implements Manageable<Book> {

    private Shelf<Book> shelf = new Shelf<>(100);

    // ---------- 1. 등록 ----------
    @Override
    public void addItem(Book book) {
        if (shelf.isFull()) {
            System.out.println("결과: 선반이 가득 찼습니다.");
            return;
        }

        for (int i = 0; i < shelf.size(); i++) {
            if (shelf.get(i).getId() == book.getId()) {   // 캐스팅 없이 바로 Book 메서드 사용
                System.out.println("결과: 이미 있는 ID입니다.");
                return;
            }
        }

        shelf.add(book);
        System.out.println("결과: 성공적으로 등록되었습니다.");
    }

    // ---------- 2. 조회 ----------
    @Override
    public void displayAll() {
        if (shelf.size() == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        System.out.println("ID\t제목\t\t저자");
        System.out.println("------------------------------------");
        for (int i = 0; i < shelf.size(); i++) {
            Book b = shelf.get(i);     // Shelf<Book>이라서 get()이 Book을 돌려준다
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t\t" + b.getAuthor());
        }
    }

    // ---------- 3. 저장 ----------
    @Override
    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("books.txt");
            for (int i = 0; i < shelf.size(); i++) {
                writer.write(shelf.get(i).toFileString() + "\n");
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
            return;
        }

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine() && !shelf.isFull()) {
                Book book = Book.fromFileString(fileScanner.nextLine());
                if (book != null) {
                    shelf.add(book);
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("불러오기 중 오류가 발생했습니다.");
        }
    }
}
