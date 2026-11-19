package package_vector_example;

public class Board {
    public String subject;
    public String content;
    String writer;

    public Board(int inputId, String content, String writer) {
        this.subject = inputId;
        this.content = content;
        this.writer = writer;
    }
}
