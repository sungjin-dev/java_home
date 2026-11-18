package SystemOutExample;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        String path = PropertiesExample.class.getResource("database.properties").getPath();

        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String customerid = properties.getProperty("customerid");
        String accountnum = properties.getProperty("accountnum");
        String balance = properties.getProperty("balance");
        String username = properties.getProperty("username");
        String accountpassword = properties.getProperty("accountpassword");

        System.out.println("customerid : " + customerid);
        System.out.println("accountnum : " + accountnum);
        System.out.println("username : " + username);
        System.out.println("accountpassword : " + accountpassword);
        System.out.println("balance : " + balance);

        UserBank<String, Integer> account = new UserBank<>();

    }


    public <M> getBalance(Integer balance);
}
