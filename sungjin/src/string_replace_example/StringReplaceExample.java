package string_replace_example;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        String neoStr = newStr.replace("JAVA", "자바");

        System.out.println(oldStr);
        System.out.println(newStr);
        System.out.println(neoStr);

        if (oldStr==newStr) {
            System.out.println("같은 객체 주소");
        } else {
            System.out.println("다른 객체 주소");
        }

        if (oldStr==neoStr) {
            System.out.println("같은 객체 주소");
        } else {
            System.out.println("다른 객체 주소");
        }
    }
    

}
