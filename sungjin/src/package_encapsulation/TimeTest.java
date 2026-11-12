package package_encapsulation;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
// 필드를 private으로 숨기고, 값을 바꾸거나 읽는 통로를 getter/setter로만 열어두면서, 
// setter 안에서 값의 유효성을 검사하는 구조


// 한 파일에 public 클래스(TimeTest)와 함께 넣을 수 있는 이유도 Time이 public이 아니기 때문
class Time {        
    private  int hour;
    private  int minute;
    private  int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute); 
        setSecond(second);
    }
    public int getHour() {return hour;}
    public void setHour(int hour) {
        if (hour < 0 || hour> 23) return;
        this.hour = hour;
    }
    public int getMinute() {return minute;}
    public void setMinute(int minute) {
        if (minute < 0 || minute> 59) return;
        this.minute = minute;
    }
    public int getSecond() {return second;}
    public void setSecond(int second) {
        if (second < 0 || second> 59) return;
        this.second = second;
    }
    public  String toString() {
        return hour + ":" + minute + ":"+ second;
    }
    
}


