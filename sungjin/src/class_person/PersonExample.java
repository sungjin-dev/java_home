package class_person;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234556", "계백");

        System.err.println(p1.nation);
        System.err.println(p1.ssn);
        System.err.println(p1.name);

        //p1.nation = "usa"; 불가능
        //p1.ssn = "654321-7654321"; 불가능
        p1.name = "을지문덕";
        System.err.println(p1.name);

    }
}
