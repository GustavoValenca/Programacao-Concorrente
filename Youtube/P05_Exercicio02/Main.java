package P05_Exercicio02;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int linhas = 2;
        int colunas = 3;

        int[][] a = new int[linhas][colunas];
        int[][] b = new int[colunas][linhas];

        // Matriz A
        System.out.println("Matriz A Input: ");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                int x = sc.nextInt();

                a[i][j] = x;
            }
        }

        // Matriz B
        System.out.println("Matriz B Input: ");
        for (int i = 0; i < colunas; i++){
            for (int j = 0; j < linhas; j++){
                int x = sc.nextInt();

                b[i][j] = x;
            }
        }

        MyRunnable r1 = new MyRunnable(a, b, 0, 0, 3);
        Thread t1 = new Thread(r1);
        t1.start();

        MyRunnable r2 = new MyRunnable(a, b, 0, 1, 3);
        Thread t2 = new Thread(r2);
        t2.start();

        MyRunnable r3 = new MyRunnable(a, b, 1, 0, 3);
        Thread t3 = new Thread(r3);
        t3.start();

        MyRunnable r4 = new MyRunnable(a, b, 1, 1, 3);
        Thread t4 = new Thread(r4);
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        int[][] c = new int[2][2];
        c[0][0] = r1.getResult();
        c[0][1] = r2.getResult();
        c[1][0] = r3.getResult();
        c[1][1] = r4.getResult();

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Matriz C:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }

        sc.close();
    }   
}