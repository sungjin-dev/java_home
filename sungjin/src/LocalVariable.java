public class LocalVariable {
    public static void main(String[] args) {
        int v1 = 15;

        if(v1>10) {
            int v2;
            v2 = v1 - 10;
            v1 += v2;
        }

        int v3 = v1 + 5;
        int result = v3;

        System.out.println(result);

    }
}

