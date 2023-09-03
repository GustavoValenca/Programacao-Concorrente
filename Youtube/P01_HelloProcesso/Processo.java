package P01_HelloProcesso;
import java.io.IOException;;

public class Processo {
    public static void main(String[] args) throws IOException {
        System.out.println("Primeiro Processo.");
        System.out.println("Pressione Enter para sair. ");
        // Aguarda usuario pressionar Enter
        System.in.read();
        System.out.println("Terminei");
    }
}