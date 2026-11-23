package test1120;

public class Member {
    private int id; 
    private String u_id;
    private String password;
    private String name;
    private String phone;

    public Member() {
    }

    public Member(int id, String u_id, String password) {
        this.id = id;
        this.name = u_id;
        this.phone = password;
    }

     public Member(String u_id, String name, String phone) {
        this.u_id = u_id;
        this.name = name;
        this.phone = phone;
    }
     public Member(int id, String u_id, String name, String phone) {
        this.id = id;
        this.u_id = u_id;
        this.name = name;
        this.phone = phone;
    }

     public Member(String u_id, String password, String name, String phone) {
        this.u_id = u_id;
        this.phone = password;
        this.name = name;
        this.phone = phone;
    }
    public Member(int id, String u_id, String password, String name, String phone) {
        this.id = id;
        this.u_id = u_id;
        this.phone = password;
        this.name = name;
        this.phone = phone;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
