package package_try_catch_example;

public class TryCatchFinallyRuntimeExceptionExample {

    public static add(a, b, c) {
     String a = "10";
     String b = "20";
     String c = "30";
     return a,b,c
    };
     
     

    public static void main() {
        add();
        
        String[] array = 

        try {
            date1 = array[0];
            date2 = array[1];
            date3 = array[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행방법]");
            System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
            return;
          }

          try {
            int value1 = Integer.parseInt(date1);
            int value2 = Integer.parseInt(date2);
            int value3 = Integer.parseInt(date3);
            int result = value1+value2+value3;
            System.out.println(date1 + "+" + date2 + "+"+ date3+"="+ result);
          } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
          } finally {
            System.out.println("다시 실행하세요.");
          }   
        
        }                 
};