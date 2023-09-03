package P04_InterfaceThread;

public class Processo {
    public static void main(String[] args){
        System.out.println("Processo que cria Threads");

        MeuRunnable run1 = new MeuRunnable("R1");        MeuRunnable run2 = new MeuRunnable("R2");

        Thread t1 = new Thread(run1);
        t1.start();

        Thread t2 = new Thread(run2);
        t2.start();

        System.out.println("Processo Finalizado");
    }
}
