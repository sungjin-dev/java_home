package string_replace_example;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import test1120.Book;
import test1120.Manageable;


public class BookManager implements Manageable{

    private ArrayList<Book> books = new ArrayList<>();

    @Override 
    public void loadFromFile() {

        // try {
        //     FileInputStream fis = new FileInputStream("C:/Temp/book.txt");
        //     BufferedInputStream bis = new BufferedInputStream(fis);
        //     while (bis.read() != -1) {
        //     }
        //     String data = new String(bis);
        //     bis.close();
        //     fis.close();

        // } catch(Exception e) {
        //     e.printStackTrace();
        // }


        try {
            FileReader fr = new FileReader("C:/Temp/book.txt");
            if (fr == null) {
                return;
            }
            int readCharNo;
            char[] cbuf = new char[100];
            while ((readCharNo = fr.read(cbuf)) != -1) {
                String data = new String(cbuf, 0 , readCharNo);
                String sample = split(data, ",");
                int id = integerParseInt(sample[0]);
                String title  = sample[1];
                String author  = sample[2];
                Book book = new Book(id,title,author);
                books = add(book);
                System.out.println("로드 되었습니다.");
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
  
    private ArrayList<Book> add(Book book) {   //밑줄 누르니까 생김 원인은 모르겠음
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    private String split(String data, String string) {
        throw new UnsupportedOperationException("Unimplemented method 'split'");
    }

    @Override 
    public void addItem(Book book) {
            for (Book b : books) {
                if (b.getId() == book.getId()) {
                    System.out.println("결과 : 이미 있는 ID입니다");
                    return;
                }
            }

        books.add(book);
        System.out.println("결과: 성공적으로 등록되었습니다.");
        System.out.println();
    }
    
    @Override
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        System.out.println("ID\t제목\t저자");
        System.out.println("-------------------------");
        for (Book b : books) {
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
        }
    }

      @Override
        public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("C:/Temp/books.txt");
            for (Book b : books) {
                writer.write(b.toFileString()+ "\n");
            }
            writer.close();
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (Exception e) {
            System.out.println("저장 중 오류가 발생했습니다.");
        }
    }

}
 
    

 