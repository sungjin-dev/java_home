package package_interface_remote_control;

public class Television implements RemoteControl{
    //필드 
    private int volume;

    //turnOn() 추상 메서드의 실체 메서드
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    //turnOff() 추상 메서드의 실체 메서드
    public void turnOff() {
        System.out.println("TV를 끕니다.");
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
        System.out.println("현재 TV볼륨: " + volume); 
    }
}

// 그 구현을 딱 한 번만 쓸 때 (클래스 파일 만들기 번거로울 때)
// 이벤트 처리, 콜백 등 짧은 일회성 로직을 넘길 때