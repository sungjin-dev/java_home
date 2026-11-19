package library_system;

/** 도서 한 권의 데이터를 담는 모델 클래스 (캡슐화: private 필드 + Getter/Setter) */
public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    /** 파일에 저장할 한 줄(CSV) 만들기: 101,Java Programming,kang eunhee */
    public String toFileString() {
        return id + "," + title + "," + author;
    }

    /** 파일의 한 줄을 Book 객체로 되돌리기. 형식이 틀리면 null 반환 */
    public static Book fromFileString(String line) {
        String[] parts = line.split(",");
        if (parts.length != 3) {
            return null;
        }
        try {
            return new Book(Integer.parseInt(parts[0].trim()), parts[1].trim(), parts[2].trim());
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
