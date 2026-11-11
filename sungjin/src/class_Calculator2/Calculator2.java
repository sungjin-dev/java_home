package class_Calculator2;

public class Calculator2 {


    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    
    double avg(int x, int y){
        double sum = plus(0, 0);
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7, 10);
        System.err.println("실행결과: " + result);
    }

    void execute(float x, float y) {
        float result = (float)avg(0, 0);
        System.err.println("실행결과: " + result);
    }

    void execute(int x, int y) {
        int result = (int)avg(0, 0);
        System.err.println("실행결과: " + result);
    }



    void println(String message) {
        System.err.println(message);
    }
}
