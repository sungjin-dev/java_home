package test1120;

import java.io.Console;
import java.util.Scanner;

import string_replace_example.BookManager;

public class LibraryMain {
    public static void main(String[] args) {
        Manageable interfaceManager = new BookManager();
        interfaceManager.loadFromFile();

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        boolean run =true;
        while (run) {
            System.out.println();
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1.도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3.저장 및 종료");
            
            int inputInt = scanner.nextInt();

            switch (inputInt) {
                case 1:
                System.out.println("메뉴 선택 >> 1");    
                System.out.println("도서 ID를 입력하세요");
                int inputId = scanner.nextInt();

                System.out.println("책제목을 입력하세요");
                String inputTitle = console.readLine();
                
                System.out.println("저자을 입력하세요");
                String inputAuthor= console.readLine();

                interfaceManager.addItem(new Book(inputId, inputTitle, inputAuthor));
                break;

                case 2:
                    System.out.println("메뉴 선택 >> 2"); 
                    interfaceManager.displayAll();
                    break;
                case 3:
                    System.out.println("메뉴 선택 >> 3"); 
                    interfaceManager.saveToFile();
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    run = false;
                    break;
            
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

    
