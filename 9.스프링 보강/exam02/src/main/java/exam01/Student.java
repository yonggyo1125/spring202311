package exam01;

public class Student {
    private String id;
    private String name;

    private static int staticNum;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void study() {
        System.out.println(name + "이 공부한다.");
    }
}

