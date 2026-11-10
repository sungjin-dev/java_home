import java.util.ArrayList;
import java.util.Scanner;

public class KeyControlExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> calculator = new ArrayList<>();

        boolean run = true;
        int sum = 0;

        while (run) {
            System.out.println("---------------------------");
            System.out.println("1. 합계 | 2. 평균 | 3. 종료");
            System.out.println("---------------------------");

            System.out.println("선택: ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")){

                    while (run) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("1. 입력 | 2. 삭제 | 3. 합계 | 4. 초기화 99. 종료");
                        System.out.println("-----------------------------------------------");
                        
                        String UserNum_sum = scanner.nextLine();

                        if(UserNum_sum.equals("1")) {
                            System.out.println("추가할 숫자를 입력하시오.");
                            String sumNum = scanner.nextLine();
                            int x = Integer.parseInt(sumNum);

                            calculator.add(x);

                        } else if (UserNum_sum.equals("2")) {
                            System.out.println("제거할 숫자를 입력하시오.");
                            String sumNum = scanner.nextLine();
                            int x = Integer.parseInt(sumNum);

                            calculator.remove(Integer.valueOf(x));

                        } else if (UserNum_sum.equals("3")) {
                            for (int i = 0; i<calculator.size(); i++)
                                sum+=calculator.get(i);
                            System.out.println("현재 총합 = " + sum);

                        } else if (UserNum_sum.equals("4")){
                            calculator = new ArrayList<>();
                            System.out.println("초기화 하였습니다.");

                        }else if (UserNum_sum.equals("99")){
                            System.out.println("합계 작업을 종료합니다.");
                            run = false;
                        } else {
                            System.out.println("잘못 입력하였습니다.");
                            continue;
                        }
                    }

                } else if (strNum.equals("2")) {
                    for (int i = 0; i<calculator.size(); i++)
                        sum+=calculator.get(i);
        
                    double avg = (double) sum / calculator.size();
                    System.out.println("현재 평균 = " + avg);
                
                } else if (strNum.equals("3")) {
                    run = false;
                }
        } 
        scanner.close();
        System.out.println("종료합니다.");
    }
}

