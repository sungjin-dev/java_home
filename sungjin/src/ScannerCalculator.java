import java.util.Scanner;

public class ScannerCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("원하는 기능 선택 :  1. 덧셈 , 2 뺄셈, 3.곱하기, 4.나눗셈, 99.종료 ");
            int UserNum = scanner.nextInt();

            if (UserNum == 99) {
                System.out.println("종료합니다");
                break;  
            } else if (UserNum < 1 || UserNum > 4){
                System.out.println("입력을 잘못 눌렀습니다. 다시 입력해주세요");
                continue;  // while의 처음으로 돌아가기
            }

            System.out.println("첫번째 숫자를 입력하세요");
            int x = scanner.nextInt();
            
            System.out.println("두번째 숫자를 입력하세요");
            int y = scanner.nextInt();

            try {
                 int result = 0;

            if (UserNum == 1) {
                result = x + y;
                System.out.println("x + y는 " + result + "입니다");

            } else if (UserNum == 2){
                result = x - y;
                System.out.println("x - y는 " + result + "입니다");
                
            } else if (UserNum == 3){
                long result1 = (long) x * y; 
                if (result1 > Integer.MAX_VALUE || result1 < Integer.MIN_VALUE) {
                    throw new ArithmeticException("오류 : 오버플로우 발생");
                } else {
                    result = (int)result1;
                    System.out.println("x * y는 " + result+ "입니다");
            }
            } else if (UserNum == 4) {
                if (y == 0) {
                    throw new ArithmeticException("오류 : 0으로 나눌 수 없음(Infinty)");
                } else {
                    double result2 = (double) x / y;
                    result = (int)result2;
                    System.out.println("x / y는 " + result+ "입니다");
            }
        }
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage()); //예외 객체가 이 문자열을 내부 필드에 저장해 두고, getMessage()를 부르면 그 문자열을 꺼내 돌려줌
            }   
    } 
    scanner.close();    // while문 끝나는 시점에 두기
}
}
                

                   
           
        
                
           
           

        


