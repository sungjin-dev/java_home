package package_calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
     myCalc.powerOn();

     int result1 = myCalc.plus(5, 6);
     System.out.println("result1: " + result1);

     byte x = 10;   
     byte y = 4;
     
     double result2 = myCalc.divide(x, y);   /* 자동 형변환(widening conversion) 때문입니다. 작은 타입에서 큰 타입으로는 컴파일러가 알아서 변환  */
        System.out.println("result2: " + result2);

    
     myCalc.powerOff();   
    }
}
    

