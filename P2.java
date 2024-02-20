import java.util.HashMap;

public class P2 {
    public static void main(String[] args) throws Exception {

        Leitor leitor = new Leitor();
        HashMap<String, Personagem> personagens = leitor.lerPerso("Recursos\\Personagens");
        HashMap<String, Capitulo> capitulos = leitor.lerCap("Recursos\\Capitulos", personagens);
        //Define o capítulo raiz(primeiro capítulo)
        Capitulo raiz = capitulos.get("Capitulo 1");
        //Inicia a história e organiza os capítulos
        raiz.executar();
    }
}