package package_java_multi_catch;

// import java.io.IOException;
// import java.net.Socket;
// import java.net.UnknownHostException;

// IOException(Input/Output Exception)은 파일 읽기/쓰기, 네트워크 통신, 데이터 스트림 처리 등 
// 입출력(I/O) 작업 중에 문제가 발생했을 때 던져지는 예외

// 자바 소켓(Java Socket)은 네트워크를 통해 두 프로그램(클라이언트와 서버)이 TCP/IP 기반으로 데이터를 
// 주고받을 수 있게 해주는 양방향 통신 엔드포인트(Endpoint) API입니다

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알수 없는 예외 발생");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
