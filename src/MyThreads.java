import java.util.Random;

public class MyThreads {
    public static final int THREADS = 10;

    public static void main(String[] args) {
        System.out.println("helllooooo");

        Random rnd = new Random();

        final int[] starts = new int [THREADS];

        for (int i = 0; i < THREADS; i++) {
            starts[i] = rnd.nextInt(50) + 1;
        }

        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            final int k = i;
            threads[i] = new Thread(()->{
                for (int j = 0; j < 101; j++) {
                    System.out.printf("%s: %d\n", Thread.currentThread().getName(), j);
                }
            });
        }

        for (Thread t: threads) {
            t.start();
        }
    }
}
