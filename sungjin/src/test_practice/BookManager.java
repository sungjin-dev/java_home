package test_practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BookManager implements Manageable{

    private ArrayList<Book> books = new ArrayList<>();

    @Override 
    public void addItem(Book book) {
        for(Book b : books) {
            if(b.getId() == book.getId()) {
                System.out.println("ID 중복입니다.");
            }; 
        }
        books.add(book);
        System.out.println("저장이 완료되었습니다.");
    }

    @Override 
    public void displayAll() {
        if(books.isEmpty()) {
            System.out.println("목록이 비어있습니다.");
            return ;
        } 
        System.out.println("ID\t제목\\t저자");
        for(Book b: books) {
            System.out.println(b.getId()+ "\t"+ b.getTitle()+"\t"+b.getAuthor());
        }
    }

    @Override 
    public void loadALL() {
        try {
            FileReader fr = new FileReader("C:/Temp/books.txt");

            StringBuilder sb = new StringBuilder();

            int readCharNo; //이 변수는 fr.read(cbuf)가 반환하는 값을 저장

            char[] cbuf = new char[100]; //임시저장공간
            //read()는 읽은 문자의 개수를 반환(더 이상 읽을 내용이 없다면 → -1)
            while ((readCharNo = fr.read(cbuf)) != -1) {
                sb.append(cbuf, 0 ,readCharNo);
                //sb.append(문자배열, 시작위치, 추가할문자개수);
            }   //cbuf는 최종 저장 공간이 아니라 임시 버퍼(Buffer) 역할
            fr.close();

            String[] lines = sb.toString().split("\\R");
            //sb는 StringBuilder 객체이기 때문에 String의 split()을 직접 사용할 수 없음
            //toString()으로 String 타입으로 변환

            for (String line : lines) {
                if (line.isBlank()) {
                    continue;
                }

                String[] sample = line.split(",", -1);

                int id = Integer.parseInt(sample[0].trim());
                String title = sample[1].trim();
                String author = sample[2].trim();

                Book book = new Book(id, title, author);

                addItem(book);
            }

        }catch (Exception e) {
            System.out.println("로드 중 오류가 발생했습니다.");
        }

    }

    
}
