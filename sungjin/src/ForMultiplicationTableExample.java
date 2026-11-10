public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2; m<=19; m++) {
            System.out.println("*** " + m + "단 ***!!");

            for (int n=1; n<=19; n++) {
                System.out.println(m + " x " + n + "=" + (m*n));
            }
        }
    }
}
