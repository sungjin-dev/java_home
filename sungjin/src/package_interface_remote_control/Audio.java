package package_interface_remote_control;

public class Audio implements RemoteControl{
    private int volume;

    //turnOn() 추상 메서드의 실체 메서드
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    //turnOff() 추상 메서드의 실체 메서드
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }
    //setVolume() 추상 메서드의 실체 메서드
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + volume); 
    }
}

// 인터페이스나 추상 클래스의 추상 메서드는 전부 구현해야 합니다. 하나라도 빠지면 컴파일 에러