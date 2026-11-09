public class FallThroughExample {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("VVIP 혜택");
            
            case 'B':
                System.out.println("VIP 혜택");
            
            case 'C':
                System.out.println("COMMON 혜택");
            break;    
            default:
               System.out.println("혜택 없음");
        }
    }
}
