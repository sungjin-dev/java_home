package field_method_acess2;

import field_method_acess1.A;

public class C {
    public C() {
        A a = new A();
        a.field1 = 1;
        // a.field2 = 1;
        // a.field3 = 1; Private은 클래스 내부

        a.method1();
        // a.method2(); import했다고 하더라도 default는 본질적으로 패키지가 다르면 불가능 
        // a.method3(); Private은 클래스 내부
    }    
}
