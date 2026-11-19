package book_management_system;

public class Generic<T> {
    private int id;
    private String title;
    private String author;
    private T[] books;

    public Generic(int id, String title, String author, int capacity) {
        this.id = id;
        this.title = title;
        this.author = author;

        books = (T[]) (new Object[capacity]);
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public T[] getBooks() {
        return books;
    }

    public void addItem(T t) {
        for(int i=0; i<books.length; i++) {
            if(books[i] == null) {
                books[i] = t;
                break;
            }
        }
    }

}

