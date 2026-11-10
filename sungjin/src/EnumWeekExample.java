import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1: 
                today = Week.SUNDAY_일요일; break;
            case 2: 
                today = Week.MONDAY_월요일; break;
            case 3: 
                today = Week.TUESDAY_화요일; break;
            case 4: 
                today = Week.WEDNESDAY_수요일; break;
            case 5: 
                today = Week.THURSDAY_목요일; break;
            case 6: 
                today = Week.FRIDAY_금요일; break;
            case 7: 
                today = Week.SATURDAY_토요일; break;
        }

        System.out.println("오늘 요일: " + today);

        if(today == Week.SUNDAY_일요일) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }
    }
}
