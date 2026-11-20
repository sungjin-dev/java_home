package connection_sql;

import lombok.Data;

@Data //Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class User {
    private String userid;
    private String username;
    private String userpassword;
    private int userage;
    private String usermail;
}
