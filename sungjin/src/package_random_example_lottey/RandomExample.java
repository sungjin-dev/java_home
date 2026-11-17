package package_random_example_lottey;

import java.util.Arrays;
import java.util.Random;


public class RandomExample {
    public static void main(String[] args) {

        int count = 0;
        Random random = new Random(); //루프 밖에서 한번만 실행되는게 좋음
        //선택번호
        
        //당첨여부
        while(true) {
            int [] selectNumber = new int[6];
            
           /*  System.out.println("선택 번호: "); */
            for (int i = 0; i<6; i++) {
                selectNumber[i] = random.nextInt(45) + 1;
                /* System.out.print(selectNumber[i]+" "); */
            }
            /* System.out.println(); */

            //당첨 번호
            int[] winningNumber = new int[6];
            /* System.out.println("당첨 번호: "); */
            for (int i = 0; i<6; i++) {
                winningNumber[i] = random.nextInt(45) + 1;
                /* System.out.print(winningNumber[i] + " "); */
            }
            /* System.out.println(); */

            Arrays.sort(selectNumber);
            Arrays.sort(winningNumber);

            boolean result = Arrays.equals(selectNumber, winningNumber);

            if(result) {
                /* System.out.println("1등에 당첨되셨습니다."); */
                break;
            } else {
                /* System.out.println("당첨되지 않았습니다."); */
                count += 1;   
            } 
        }
        
        System.out.println((count+1)+"몇"+"회만에 당첨");  
       
    }
}


// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Random;
// import java.util.Set;

// public class RandomExample {
//     static int[] pick(Random random) {
//         Set<Integer> set = new HashSet<>();
//         while (set.size() < 6) {
//             set.add(random.nextInt(45) + 1);   // Set이라 중복 자동 제거
//         }
//         int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
//         Arrays.sort(arr);
//         return arr;
//     }

//     public static void main(String[] args) {
//         Random random = new Random();
//         int[] selectNumber = pick(random);
//         System.out.println("선택 번호: " + Arrays.toString(selectNumber));

//         int count = 0;
//         while (true) {
//             int[] winningNumber = pick(random);   // 매 회차 새로 추첨
//             count++;
//             if (Arrays.equals(selectNumber, winningNumber)) {
//                 System.out.println("1등 당첨! " + count + "회 만에 당첨");
//                 break;
//             }
//         }
//     }
// }