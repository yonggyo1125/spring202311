package proxyex;

public class ImplCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            long total = 1L;

            for (long i = 1L; i <= num; i++) {
                total *= i;
            }

            return total;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
