package class_Calculator3;

public class Calculator3 {
    static double pi = 3.14159;

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y) {
        return x-y;
    }
    static int multiply(int x, int y) {
        return x*y;
    }
    static int divide(int x, int y) {
        if(y==0){
            return 1;
        }
        return x/y;
    }
}
