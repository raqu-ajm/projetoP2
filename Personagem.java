import java.util.HashMap;
import java.util.Scanner;

public class Personagem {

    // define os atributos vida(string) e saude(int)
    private String nomechar;
    private int saude;
    private final int maxSaude = 100;

    public void setPersonagem(String nomechar, int saude){
        this.nomechar = nomechar;
        this.saude = saude;
    }
    // recebe a string nome
    public String getNome() {
        return nomechar;
    }
    // recebe int saúde
    public int getSaude() {
        return saude;
    }
    // define o método para alterar vida
    public void alterarSaude(int x, int y) {
        if(x == 1){
            if(saude <= maxSaude){
                saude = saude + y;
                if(saude > maxSaude){
                    saude = maxSaude;
                }
                System.out.println(nomechar + " ganhou " + y + " pontos de vida.");
                System.out.println("agora possui: " +saude+ " de vida");
            }
            else{
                System.out.println(nomechar + " já está com a saúde cheia.");
            }}
        else if(x == 2){
            saude = saude - y;
            System.out.println(nomechar + " perdeu " + y + " pontos de vida.");
            System.out.println("agora possui: " +saude+ " de vida");
            if(saude <= 0){
                System.out.println(getNome()+" perdeu todos os pontos de vida.");
            }
        }
    }
    public void lerPersonagem(HashMap<String, Personagem> personagens,
    String linhaEscaneada, Personagem personagem,
    Scanner escaneadorArquivoPersonagens){
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//NOME
        String nomePerso = escaneadorArquivoPersonagens.nextLine();
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//VIDA
        int vidaPerso = Integer.parseInt(escaneadorArquivoPersonagens.nextLine());
        personagem.setPersonagem(nomePerso, vidaPerso);
        personagens.put(nomePerso, personagem);
    }

}