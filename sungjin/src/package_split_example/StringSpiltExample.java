package package_split_example;

public class StringSpiltExample {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호/김두한@naver.com";
        String[] names = text.split("&|,|-|/|@");

        for(String name : names) {
            System.out.println(name);
        }
    }
}
