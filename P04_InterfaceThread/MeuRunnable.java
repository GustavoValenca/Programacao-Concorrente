package P04_InterfaceThread;

public class MeuRunnable implements Runnable {
    private String nome;

    public MeuRunnable(String nome){
        this.nome = nome;
    }

    public void run(){
        System.out.println("Sou o runnable" + nome);
    }
}
