public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "그린컴퓨터";
        String strVar2 = "그린컴퓨터";
        String strVar3 = new String("그린컴퓨터"); 

        System.out.println( strVar1 == strVar2);
        System.out.println( strVar1 == strVar3);
        System.out.println();
        System.out.println( strVar1.equals(strVar2));
        System.out.println( strVar1.equals(strVar3));
    }
}
