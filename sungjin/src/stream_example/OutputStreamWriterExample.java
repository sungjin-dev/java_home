package stream_example;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;



public class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception{
        String filePath = "C:/Temp/sungjin.txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        Writer writer = new OutputStreamWriter(fos);

        String data = "나의 꿈과 희망 미소";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다.");
    }
}
