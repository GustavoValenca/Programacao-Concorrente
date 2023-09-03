package P03_Exercicio01;

public class FourThreads {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        int a = 1;
        int b = 1000000;
        int fraction = (b - a) / 4;

        MainThread t1 = new MainThread(a, a + fraction);
        t1.start();

        MainThread t2 = new MainThread(a + fraction + 1, a + 2 * fraction);
        t2.start();

        MainThread t3 = new MainThread(a + 2 * fraction + 1, a + 3 * fraction);
        t3.start();

        MainThread t4 = new MainThread(a + 3 * fraction + 1, a + 4 * fraction);
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long finish = System.nanoTime();
        long timeElapsed = (finish - start) / 1000000;
        System.out.println("Tempo em milisegundos: " + timeElapsed);
    }
}
