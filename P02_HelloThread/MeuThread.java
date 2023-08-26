package P02_HelloThread;

public class MeuThread extends Thread {
    @Override
    public void run() {
        System.out.println("Sou o Thread " + this.getId() + ". Tchau.");
    }
}
