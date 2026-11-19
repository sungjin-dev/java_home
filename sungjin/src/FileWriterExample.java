import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) throws Exception{
        String tempPath1 = "C:/Temp/file.txt"; 

        File file = new File(tempPath1);
        FileWriter fw = new FileWriter(file, true);
        fw.write("FileWriter는 한글로된 " + "\r\n");
        fw.write("문자열을 바로 출력할 수 있다. " + "\r\n");
        fw.write("그런데 이런걸로 뭘 할 수 있을지 궁금하다 " + "\r\n");
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다.");
    }
}
