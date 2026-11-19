package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookManager implements Manageable{
    
    private Book[] books = new Book[100];
    private int count = 0;

    @Override 
    public void addItem(Book book) {
        if(count == books.length) {
            System.out.println("결과: 선반이 가득 찼습니다.");
            return ;
        }

        for (int i = 0; i < count; i++) {
            if (books[i].getId() == book.getId()) {
                System.out.println("결과 :  이미 있는 ID입니다");
                return ;
            }
        }

        books[count] = book;
        count = count +1;
        System.out.println("결과: 성공적으로 등록되었습니다.");
    }

    @Override 
    public void displayAll() {
        if (count == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return ;
        }

        System.out.println("ID\t제목\t\t저자");
        System.out.println("-------------------------");
        for (int i = 0; i < count; i++) {
            Book b = books[i];
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
        }
    }

    @Override 
    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("C:/Temp/books.txt")
            for(int i = 0; i<count; i++) {
                writer.write(books[i].toFileString() + "\n");
            }
            writer.close();
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("저장 중 오류가 발생했습니다.");
        }
        
        
    }

    @Override 
    public void loadFromFile() {
        File file = new File("C:/Temp/books.txt");
        if(!file.exists()) {
            return ;
        }
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine() && count < books.length) {
                String line = fileScanner.nextLine();
                Book book = Book.fromFileString(line);
                if (book != null) {
                    books[count] = book;
                    count = count +1;
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("불러오기 중 오류가 발생했습니다.");
        }
    }
}
