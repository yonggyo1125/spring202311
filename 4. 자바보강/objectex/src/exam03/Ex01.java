package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2023;
        //s1.month = 2;
        //s1.day = 31; // 잘못된 값이 들어가도 통제 X

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(31);

        //s1.showDate();
        System.out.println(s1); // s1.toString();
    }
}
