package book_system;

public class Book implements Manageable{
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getAthor() {
        return author;
    }
        
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
   public String toFileString() {
        return id + "," + title + "," + author;
    }
}
