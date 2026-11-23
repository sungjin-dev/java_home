package test1120;

import java.util.List;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
       Management<Book> bookManager = new DBbookManager();
       Management<Member> memberManager = new DBmemberManager();
//객체 변수에는 "화살표(참조)"가 들어 있으니, 넘기면 화살표가 복사되어서 
// main의 scanner와 bookMenu 안의 scanner가 같은 하나의 객체를 가리킴
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. 도서 관리");
            System.out.println("2. 회원 관리");
            System.out.println("3. 종료");

            int inputMenu = readInt(scanner, "메뉴를 선택하세요");

            switch (inputMenu) {
                case 1 :
                    bookMenu(scanner, bookManager);
                    break;
                case 2 :
                    MemberMenu(scanner, memberManager);
                    break;
                case 3: 
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다."); 
               }
           }
        }
    private static void bookMenu(Scanner scanner, Management<Book> bookManager) {
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

                    bookManager.addItem(new Book(inputTitle, inputAuthor));
                    break;

                case 2:
                    System.out.println("메뉴 선택 >> 2"); 
                    int updateId = readInt(scanner, "변경할 책 ID를 입력하시오");
                    System.out.println("변경할 제목을 입력하시오");
                    String updateTitle = (scanner.nextLine().trim());
                    System.out.println("변경할 저자 이름을 입력하시오");
                    String updateAuthor = (scanner.nextLine().trim());

                    bookManager.updateItem(new Book(updateId, updateTitle, updateAuthor));
                    break;
                case 3:
                    System.out.println("메뉴 선택 >> 3"); 
                    int deleteId = readInt(scanner, "삭제할 책 ID를 입력하시오");
                    bookManager.deleteItem(deleteId);
                    break;
                case 4:
                    System.out.println("메뉴 선택 >> 4"); 
                    List<Book> list = bookManager.findAll();      // ① 받는다

                    if (list.isEmpty()) {                        // ② 비었는지 확인
                        System.out.println("등록된 도서가 없습니다.");
                    } else {
                        for (Book b : list) {                    // ③ 한 권씩 꺼내서 출력
                            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("메뉴 선택 >> 5"); 
                    int searchId = readInt(scanner, "검색할 책 ID를 입력하시오");
                    Book found = bookManager.findById(searchId);
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
    private static void MemberMenu(Scanner scanner, Management<Member> memberManager) {
        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("===== MemberShip SYSTEM =====");
            System.out.println("1. 계정 생성(ID, 비밀번호 등)");
            System.out.println("2. 회원정보 변경");
            System.out.println("3. 회원탈퇴");
            System.out.println("4. 회원정보 조회");
            System.out.println("5. 종료");
            
           int inputInt = readInt(scanner, "메뉴를 선택하세요");

            switch (inputInt) {
                case 1:
                    System.out.println("메뉴 선택 >> 1");    
                    System.out.println("ID를 입력하세요. (특수문자 불가)");
                    String inputU_id = (scanner.nextLine().trim());
                    System.out.println("비밀번호를 입력하세요");
                    String inputPassword = (scanner.nextLine().trim());
                    System.out.println("이름을 입력하세요");
                    String inputName = (scanner.nextLine().trim());
                    System.out.println("전화번호를 입력하세요");
                    String inputPhone = (scanner.nextLine().trim());

                    memberManager.addItem(new Member(inputU_id, inputPassword, inputName, inputPhone));
                    break;

                case 2:
                    System.out.println("메뉴 선택 >> 2"); 
                    int checkId = readInt(scanner, "회원번호를 입력하시오");
                    System.out.println("변경할 비밀번호를 입력하시오");
                    String updatePassword = (scanner.nextLine().trim());
                    System.out.println("변경할 전화번호를 입력하시오");
                    String updatePhone = (scanner.nextLine().trim());

                    memberManager.updateItem(new Member(checkId, updatePassword, updatePhone));
                    break;
                case 3:
                    System.out.println("메뉴 선택 >> 3"); 
                    int deleteId = readInt(scanner, "삭제할 회원번호를 입력하시오");
                    memberManager.deleteItem(deleteId);
                    break;
                    
                case 5:
                    System.out.println("메뉴 선택 >> 5"); 
                    int searchId = readInt(scanner, "검색할 책 ID를 입력하시오");
                    Book found = memberManager.findById(searchId);
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

    
