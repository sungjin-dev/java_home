package test_practice;

import java.util.Scanner;

public class RunLibrary {
    public static void main(String[] args) {

        Manageable manager = new BookManager();
        manager.loadFromFile();

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while(run) {
            System.out.println();
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1.도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3.저장 및 종료");

            int inputNum = scanner.nextInt();
            
            switch(inputNum) {
                case 1 : 
                System.out.println("도서 ID를 입력하세요.");
                int inputId = scanner.nextInt();
                System.out.println("도서 제목을 입력하세요.");
                String inputTitle = scanner.nextLine();
                System.out.println("도서 저자를 입력하세요.");
                String inputAuthor = scanner.nextLine();

                Book book = new Book(inputId, inputTitle, inputAuthor);

                manager.addItem(book);
                break;
                // manager.addItem(new Book(inputId, inputTitle, inputAuthor));

                case 2 : 
                manager.displayAll();
                System.out.println();
                break;

                case 3 : 
                bookDAO.insert(book);
                System.out.println("저장 후 종료됩니다.");
                run = false;
                scanner.close();

                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            } 
        }
    }
}
