package exam05;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        UnaryOperator<Integer> func = a -> a * a;
                // a.intValue() * a.intValue()

        IntUnaryOperator func2 = a -> a * a;
    }
}
