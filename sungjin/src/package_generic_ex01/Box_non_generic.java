package package_generic_ex01;

//non generic 

public class Box_non_generic {
    private Object object;
    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        Box_non_generic box = new Box_non_generic();
        box.set("hello");
        String str = (String) box.get();  

        System.out.println(str);
    }
    
}
