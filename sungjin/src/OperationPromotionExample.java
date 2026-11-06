public class OperationPromotionExample {
    public static void main(String[] args) {

        byte result1 = 10+20;
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        byte result2 = (byte) (v1+v2);

        System.out.println("result2: " + result2);

        byte v3 = 10;            /* byte + short, byte + char, byte-byte*/       
        byte v4 = 20;
        int result3 = v3+v4;    /* int형이 프로세서 입장에서 계산하기 좋기 때문에 그 미만의 타입들은
                                  정수형 int타입 4byte에서 처리한다 */

        System.out.println("result2: " + result3);

        byte v5 = 10;
        int v6 = 100;
        long v7 = 1000L;            /* 더 큰 범위로 감싸기 */
        long result4 = v5+v6+v7;
        System.out.println("result4: "+ result4);

        char v8 = 'A';
        char v9 = 1;
        int result5 = v8+v9;            
        System.out.println("result5: "+ result5);
        System.out.println("result5: "+ (char)result5);
        
        int v10 = 10;
        int result6 = v10 / 4;      /* 정수 연산의 결과는 정수 */
        System.out.println("result6" + result6);

        int v11 = 10;
        double result7 = v11 / 4.0;     /* double 타입으로 변환 후 연산 */
        System.out.println("result7" + result7);

        int v12 = 1;
        int v13 = 2;
        double result8 = (double) v12 / v13;  /* double 타입으로 변환 후 연산 */
        System.out.println("result8"+ result8 );
    }
}
