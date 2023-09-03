package P05_Exercicio02;

public class MyRunnable implements Runnable {
    int[][] a;
    int[][] b;
    int pos1;
    int pos2;
    int size;
    int result = 0;

    public MyRunnable(int[][] a, int[][] b, int pos1, int pos2, int size){
        this.a = a;
        this.b = b;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.size = size;
    }

    public void run(){
        for (int i = 0; i < size; i++){
            this.result += a[pos1][i] * b[i][pos2];
        }
    }

    public int getResult() {
        return result;
    }
}
