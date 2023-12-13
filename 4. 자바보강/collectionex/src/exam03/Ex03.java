package exam03;

import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(33);
        numbers.add(3);

        System.out.println(numbers);
    }
}

class Integer2 extends Integer {

    public Integer2(int value) {
        super(value);
    }
}
