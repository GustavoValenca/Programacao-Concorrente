package P03_Exercicio01;

public class MainThread extends Thread {
    private int limiteInferior, limiteSuperior;

    public MainThread(int limiteInferior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    
    @Override
    public void run(){
        for (int i = limiteInferior; i <= limiteSuperior; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
