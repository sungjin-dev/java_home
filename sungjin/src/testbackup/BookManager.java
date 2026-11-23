package testbackup;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.Map;


public class BookManager implements Management{

    private final Map<Integer, Book> bookMap = new LinkedHashMap<Integer, Book>();
    
    @Override 
    public void loadAll() {
        try {
            if (!new File(Config.FILE_PATH).exists()) return;

            FileReader fr = new FileReader(Config.FILE_PATH);

            StringBuilder sb = new StringBuilder();
            
            int readCharNo;
            char[] cbuf = new char[100];
            while ((readCharNo = fr.read(cbuf)) != -1) {
               sb.append(cbuf,0,readCharNo);
            }
            fr.close();

            String[] lines = sb.toString().split("\\R");  //줄 단위 split StringBuilder는 객체라서 string으로 변환하기

            for (String line : lines) {
                if (line.isBlank()) continue;

                String[] sample = line.split(",");

                int id = Integer.parseInt(sample[0]);
                String title  = sample[1];
                String author  = sample[2];
                Book book = new Book(id,title,author);
                bookMap.put(id, book);
            } 
            System.out.println("로드 되었습니다.");
            
        }catch (Exception e) {
            e.printStackTrace();
        }        
    }
    @Override 
    public void addItem(Book book) {

            if (bookMap.containsKey(book.getId())) {
                System.out.println("이미 있는 ID입니다.");
                return ;
            }
            bookMap.put(book.getId(), book);
            System.out.println("결과: 성공적으로 등록되었습니다.");
            System.out.println();
            }

    @Override
    public void displayAll() {
        if (bookMap.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        System.out.println("ID\t제목\t저자");
        System.out.println("-------------------------");
        for (Book b : bookMap.values()) {
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
        }
    }
        
      @Override
        public void saveAll() {
        try {
            FileWriter writer = new FileWriter(Config.FILE_PATH);
            for (Book b : bookMap.values()) {
                writer.write(b.toFileString()+ "\n");
            }
            writer.close();
            System.out.println("파일 저장이 완료되었습니다.");

        } catch (Exception e) {
            System.out.println("저장 중 오류가 발생했습니다.");
        }
    }
      @Override
        public void searchBook(int id) {
            
        Book book = bookMap.get(id);

        if (book == null) {
        System.out.println("해당 ID의 도서를 찾을 수 없습니다.");
        return;
        }

        System.out.println("책 제목 : " + book.getTitle() + "\n" + "책 저자: " + book.getAuthor());    
    }

}
 
    

 