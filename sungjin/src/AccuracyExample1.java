public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;

        double PiecesUnit = 0.1;
        int number = 7;
        
        double result = apple - number * PiecesUnit;
    
        System.out.println("사과 한개에서");
        System.out.println("0.7조각을 빼면, ");
        System.out.println(result + "조각이 남는다.");
    }
}
