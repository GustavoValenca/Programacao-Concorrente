package P03_Exercicio01;
// import java.util.*;

public class NoThreads {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in); 
        // System.out.print("Range start number: ");
        // int a = sc.nextInt();

        // System.out.print("End of range number: ");
        // int b = sc.nextInt();

        long start = System.nanoTime();

        int a = 1;
        int b = 1000000;

        for (int i = a; i <= b; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

        long finish = System.nanoTime();
        long timeElapsed = (finish - start) / 1000000;
        System.out.println("Tempo em milisegundos: " + timeElapsed);

        // sc.close();
    }
}
