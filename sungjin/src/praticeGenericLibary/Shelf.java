package praticeGenericLibary;

/**
 * [제네릭 2단계] "배열 + count" 로직만 따로 뽑아낸 제네릭 선반.
 * 책(Book)이든 회원(Member)이든 T 자리에 넣기만 하면 같은 선반을 쓸 수 있다.
 */
public class Shelf<T> {

    private T[] items;
    private int count = 0;

    // new T[capacity] 는 자바에서 허용되지 않는다 (T가 뭔지 실행 중엔 지워지기 때문).
    // 그래서 Object[]를 만들어서 T[]로 "간주"한다. (경고가 뜨는 게 정상이라 억제)
    @SuppressWarnings("unchecked")
    public Shelf(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        items[count] = item;
        count = count + 1;
    }

    public T get(int index) {
        return items[index];
    }

    // 주의: 배열 자체(T[])를 밖으로 꺼내 주는 getter는 만들지 않는다.
    // 안쪽은 사실 Object[]라서, 밖에서 Book[]로 받으면 실행 중 오류가 난다.
}
