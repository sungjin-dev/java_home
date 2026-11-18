package package_generic_full_example;

public interface Stroage<T> {
    public void add(T item, int index);
    public T get(int index);
}
