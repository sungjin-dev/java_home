package book_management_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookControl implements Manageable{

    private int id;
    private String title;
    private String author;

    public static void main(String[] args) {
        inputFunction();

    }
    public static void inputFunction() {
        
                Scanner scanner = new Scanner(System.in);
                System.out.println("도서 ID를 입력하세요");
                int inputId = scanner.nextInt();

                // if (inputId == id) {
                //     System.out.println("id는 중복이 불가합니다. ");
                //     continue;
                // }

                System.out.println("책제목을 입력하세요");
                String inputTitle = scanner.nextLine();
                
                System.out.println("저자을 입력하세요");
                String inputAuthor= scanner.nextLine();

                Generic<Books> Bookinfo = new Generic<Books>(inputId,inputTitle,inputAuthor,30);         
    }

    public void displayAll() {
        findall;
    }

    public void saveToFile() {
        
        Map<Integer, String, String> map = new HashMap<Integer, String, String>();

        map.put(inputId, title, author);
    }    

    public void loadFromFile() {

    }      
    
    
}
