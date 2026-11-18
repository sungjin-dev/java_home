package SystemOutExample;

public class Course<T> {
    private String username;
    private T[] accounts;
    private T[] userInfos;
    

    public Course(String username, int capacity) {
        this.username = username;
        accounts = (T[]) (new Object[capacity]);
        userInfos = (T[]) (new Object[capacity]);
    }

    public String getName()
    
}
