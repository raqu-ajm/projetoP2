import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<String> escolhas = new ArrayList<String>();
    private Personagem personagem;
    private int alteracaoEnergia;
    
    public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void adicionarEscolha (String escolha){
        escolhas.add(escolha);
    }

    public void mostrar() {
        System.out.println("Capítulo: " + nome);
        System.out.println(texto);
        this.personagem.mudarEnergia(alteracaoEnergia);
    }

    public int escolher(Scanner leitor) {
        while(true){
            for (int i=0 ; i<this.escolhas.size() ;i++){
                System.out.println("escolha numero " + (i+1) + ": " + this.escolhas.get(i));
            }

            System.err.println("digite o numero da sua escolha:");
            int respostaFinal = leitor.nextInt();

                if (respostaFinal <= this.escolhas.size() && respostaFinal > 0){
                    return respostaFinal;
                }
                else{
                    continue;
                }
            }
            

        }
    }