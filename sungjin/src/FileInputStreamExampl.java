import java.io.FileInputStream;

public class FileInputStreamExampl {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/java_home/sungjin/src/FileInputStreamExampl.java");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
                // System.out.println(data);
            }
            fis.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
