package book_management_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class RunLibrary{
    public static void main(String[] args) throws Exception{

        boolean run = true;

        List<Books> list = new Vector<Books>();

        while(run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.도서 등록 , 2. 도서 목록 조회, 3.저장 및 종료");
            int inputInt = scanner.nextInt();

            if (inputInt == 1) {

                System.out.println("도서 ID를 입력하세요");
                int inputId = scanner.nextInt();
                
                System.out.println("책제목을 입력하세요");
                String inputTitle = scanner.nextLine();
                
                System.out.println("저자을 입력하세요");
                String inputAuthor= scanner.nextLine();

                list.add(new Books(inputId, inputTitle, inputAuthor));

            } else if (inputInt == 2){
                
                for(int i=0; i<list.size(); i++) {
                    Books books = list.get(i);
                    System.out.println(books.subject + "\t" + books.content + "\t" + books.writer);
                }

                try {
                    FileInputStream fis = new FileInputStream("C:/Temp/file/txt");
                    while ((fis.read()) !=-1) {
                        System.out.println(list);
                    }
                    fis.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }

            } else if (inputInt == 3) {
                    File file = new File("C:/Temp/file/txt");
                    FileWriter fw = new FileWriter(file);
                    
                    for(int i=0; i<list.size(); i++) {
                    Books books = list.get(i);
                        fw.write(books + "\r\n");
                    }

                    fw.flush();
                    fw.close();

                    System.out.println("파일이 저장이 완료 되었습니다.");

                    scanner.close();
                    run = false;

                } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;  
            } 
        }
    }
}

