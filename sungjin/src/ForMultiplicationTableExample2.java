public class ForMultiplicationTableExample2 {
    public static void main(String[] args) {
        for (int m=9; m>=1; m--) {
            System.out.println("---------------------------");
            System.out.println("*** " + m + "단 ***");
            System.out.println("---------------------------");

            for (int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + "=" + (m*n));
            }
        }
    }
}
