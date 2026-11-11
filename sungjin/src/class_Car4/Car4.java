package class_Car4;

public class Car4 {
    //필드
    int gas;

    //생성자

    //메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas==0) {
            System.err.println("gas가 없습니다.");
            return false;
        }
        System.err.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while(true) {
            if(gas > 0) {
                System.err.println("달립니다.(gas잔량: " + gas + ")");
                gas--;
            } else {
                System.err.println("멈춥니다.(gas잔량:" + gas + ")");
                return ;
            }
        }
    }
}
