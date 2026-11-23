package testbackup;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 저장 시 사용할 문자열 반환
    public String toFileString() {
        return id + "," + title + "," + author;
    }
}
