package test1120;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Management dbManager = new DBbookManager();

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 정보 변경");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 목록 조회");
            System.out.println("5. 도서 검색");
            System.out.println("6. 종료");
            
           int inputInt = readInt(scanner, "메뉴를 선택하세요");

            switch (inputInt) {
                case 1:
                    System.out.println("메뉴 선택 >> 1");    
                    System.out.println("책제목을 입력하세요");
                    String inputTitle = (scanner.nextLine().trim());
                    System.out.println("저자을 입력하세요");
                    String inputAuthor= (scanner.nextLine().trim());

                    dbManager.addItem(new Book(inputTitle, inputAuthor));
                    break;

                case 2:
                    System.out.println("메뉴 선택 >> 2"); 
                    int updateId = readInt(scanner, "변경할 책 ID를 입력하시오");
                    System.out.println("변경할 제목을 입력하시오");
                    String updateTitle = (scanner.nextLine().trim());
                    System.out.println("변경할 저자 이름을 입력하시오");
                    String updateAuthor = (scanner.nextLine().trim());

                    dbManager.updateItem(new Book(updateId, updateTitle, updateAuthor));
                    break;
                case 3:
                    System.out.println("메뉴 선택 >> 3"); 
                    int deleteId = readInt(scanner, "삭제할 책 ID를 입력하시오");
                    dbManager.deleteItem(deleteId);
                    break;
                case 4:
                    System.out.println("메뉴 선택 >> 4"); 
                    dbManager.findAll();
                    break;
                case 5:
                    System.out.println("메뉴 선택 >> 5"); 
                    int searchId = readInt(scanner, "검색할 책 ID를 입력하시오");
                    Book found = dbManager.findById(searchId);
                    if (found == null) {
                        System.out.println("해당 ID의 도서를 찾을 수 없습니다.");
                    } else {
                        System.out.println("제목: " + found.getTitle() + " / 저자: " + found.getAuthor());
                    }
                    break;
                case 6:
                    System.out.println("메뉴 선택 >> 6"); 
                    scanner.close();
                    run = false;
                    break;
            
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
    private static int readInt(Scanner scanner, String message) {
    while (true) {
        System.out.println(message);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요.");
        }
    }
}
}

    
