package package_generic_ex01;

public class Box<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("hello");
        String str = box.get();
        System.out.println(str);

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        String str2 = box.get();
        System.out.println(str2);
    }
}
