package library_system;

import java.util.Scanner;

/** 메뉴(UI)만 담당. 실제 일은 Manageable에게 시킨다. */
public class RunLibrary {

    private static final Scanner scanner = new Scanner(System.in);

    // nextInt() 대신: 한 줄을 통째로 읽고 숫자로 변환 (엔터 문자 꼬임 방지)
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        // CSV 구분자(,)와 충돌하지 않도록 쉼표 제거
        return scanner.nextLine().trim().replace(",", " ");
    }

    public static void main(String[] args) {
        Manageable manager = new BookManager();   // 인터페이스 타입으로 사용
        manager.loadFromFile();                       // 요구사항-01

        boolean run = true;
        while (run) {
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            int menu = readInt("메뉴 선택 >> ");

            switch (menu) {
                case 1:
                    System.out.println("\n[도서 등록]");
                    int id = readInt("ID: ");
                    String title = readText("제목: ");
                    String author = readText("저자: ");
                    manager.addItem(new Book(id, title, author));
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    manager.saveToFile();             // 요구사항-04
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        scanner.close();
    }
}
