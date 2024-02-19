import java.util.HashMap;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        Leitor leitor = new Leitor();
        HashMap<String,Personagem> personagens = leitor.fazerPersonagem(
        "recursos\\Personagens");
        HashMap<String,Capitulo> capitulos = leitor.lerCapitulos(
        "recursos\\Capitulos",
        personagens, Leitor);

        Capitulo raiz = capitulos.get("Capitulo 1");

        //executando livro interativo
        raiz.exibir(Leitor);
    // Fechar o scanner
    Leitor.close();
    }
}
