package testbackup;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Management interfaceManager = new BookManager();
        interfaceManager.loadAll();

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 저장 및 종료");
            
            int inputInt = Integer.parseInt(scanner.nextLine().trim());

            switch (inputInt) {
                case 1:
                System.out.println("메뉴 선택 >> 1");    
                System.out.println("도서 ID를 입력하세요");
                int inputId = Integer.parseInt(scanner.nextLine().trim());

                System.out.println("책제목을 입력하세요");
                String inputTitle = (scanner.nextLine().trim());
                
                System.out.println("저자을 입력하세요");
                String inputAuthor= (scanner.nextLine().trim());

                interfaceManager.addItem(new Book(inputId, inputTitle, inputAuthor));
                break;

                case 2:
                    System.out.println("메뉴 선택 >> 2"); 
                    interfaceManager.displayAll();
                    break;
                case 3:
                    System.out.println("메뉴 선택 >> 3"); 
                    System.out.println("검색할 도서의 ID를 입력해주세요.");

                    int searchId = Integer.parseInt(scanner.nextLine().trim());
                    interfaceManager.searchBook(searchId);
                    break;
                case 4:
                    System.out.println("메뉴 선택 >> 4"); 
                    interfaceManager.saveAll();
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

    
