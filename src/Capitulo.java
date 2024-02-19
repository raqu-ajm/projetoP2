import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
    private Personagem personagem;
    private int alteracaoEnergia;
    
    public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void adicionarEscolha (Escolha escolha){
        escolhas.add(escolha);
    }

    public void exibir(Scanner leitor){
        mostrar();
        if (this.escolhas.size() != 0){
            escolher(leitor).exibir(leitor);
        }
    }

    public void mostrar() {
        System.out.println("Capítulo: " + nome);
        System.out.println(texto);
        this.personagem.mudarEnergia(alteracaoEnergia);
    }

    public Capitulo escolher(Scanner leitor) {
        while(true){
            for (int i=0 ; i<this.escolhas.size() ;i++){
                System.out.println("escolha numero " + (i+1) + ": " + this.escolhas.get(i).getEscolha());
            }

            System.err.println("digite o numero da sua escolha:");
            int resposta = leitor.nextInt();
            if (resposta == 1){
                return escolhas.get(resposta-1).getProximoCapitulo();
            }
            else if (resposta == 2){
                return escolhas.get(resposta-1).getProximoCapitulo();
            }
            else {
                System.out.println("digito incorreto, tente de novo!");
            }
        }
    }
}