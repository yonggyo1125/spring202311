package exam01;

public class Student {
    static int id;
    String name;
    String subject;

    /**
    public Student() {
        // 멤버변수의 초기화 작업을 주로 진행
        id = 1000;
        name = "이름1";
        subject = "과목1";
    }*/

    public Student(int _id, String _name, String _subject) {
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
