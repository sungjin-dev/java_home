public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {

        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");   /* "" 빈 문자열은 NumberFormatException: empty String */
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str1: " + str2);
        System.out.println("str1: " + str3);

    }
}
