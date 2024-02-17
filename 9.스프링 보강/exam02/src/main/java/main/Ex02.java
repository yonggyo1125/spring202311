package main;

import exam01.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex02 {
    public static void main(String[] args) {
        //Student s1 = new Student("1000", "이이름");
        Class cls = Student.class; // .class -> 정적 변수 -> JVM

        // 기본 자료형 -> 클래스 X
        int num = 100;

        for (Method method : cls.getMethods()) {
            System.out.println(method);
        }

        for (Constructor constructor : cls.getConstructors()) {
            System.out.println(constructor);
        }
    }
}
