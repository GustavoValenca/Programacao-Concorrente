package P03_Exercicio01;

public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        int a = 1;
        int b = 1000000;

        MainThread t1 = new MainThread(a, b / 2);
        t1.start();

        MainThread t2 = new MainThread((b / 2) + 1, b);
        t2.start();

        t1.join();
        t2.join();

        long finish = System.nanoTime();
        long timeElapsed = (finish - start) / 1000000;
        System.out.println("Tempo em milisegundos: " + timeElapsed);
    }
}
