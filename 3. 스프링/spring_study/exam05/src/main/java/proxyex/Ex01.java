package proxyex;

public class Ex01 {
    public static void main(String[] args) {
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 : %d%n", result1);


        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 : %d%n", result2);

    }
}
