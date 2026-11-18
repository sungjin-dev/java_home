package package_generics;

public class Data<T> {
    T obj;
    Data(T ob) {
        obj = ob;
    }
    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T: " + obj.getClass().getName());
    }
}
