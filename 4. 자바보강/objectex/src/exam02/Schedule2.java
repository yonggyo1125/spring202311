package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printThis() {
        System.out.println(System.identityHashCode(this));
    }

    @Override
    public String toString() {
        return "Schedule2{" +
                "year=" + this.year +
                ", month=" + this.month +
                ", day=" + this.day +
                '}';
    }
}
