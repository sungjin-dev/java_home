package field_method_acess1;

public class B {
    public B() {
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
        // a.field3 = 1; Private은 클래스 내부

        a.method1();
        a.method2();
        // a.method3(); Private은 클래스 내부
}
}