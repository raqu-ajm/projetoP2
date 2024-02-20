import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    protected Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Opções, Array de Escolhas e String edmessage
    protected String nome;
    protected String texto;
    protected String opçoes;
    protected ArrayList<Escolha> escolhas;
    protected String edmessage;
    protected Personagem alteravida;//Usado para indicar qual personagem terá a vida alterada em cada capt.
    //Define a variável int ateracaoEnergia e a variável ganhar ou perder
    protected int alteracaoEnergia;
    protected int gop;
    public Capitulo(HashMap<String, Capitulo> capitulos,
    HashMap<String, Personagem> personagens, Scanner escaneadorArquivoCapitulos)
    {
        escaneadorArquivoCapitulos.nextLine(); //NOME
        String nomeCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//TEXTO
        String textoCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//OPÇOES
        String opçoesCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//PERSONAGEM
        String personagemCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//EDMESSAGE
        String edMessageCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//ALTERA ENERGIA
        int alteraEnergiaCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
        escaneadorArquivoCapitulos.nextLine();//GANHA OU PERDE
        int gopCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
        if(edMessageCapitulo.equals("null"))
        {
            edMessageCapitulo = null;
        }
        if(opçoesCapitulo.equals("null"))
        {
            opçoesCapitulo = null;
        }
        setCapitulo(nomeCapitulo, textoCapitulo, opçoesCapitulo, personagens.get(personagemCapitulo),
                    edMessageCapitulo, alteraEnergiaCapitulo, gopCapitulo);
    }
    public String getCapitulo(){
        return this.nome;
    }
    //Define o capitulo e todos os atributos
    public void setCapitulo(String nome, String texto, String opçoes, Personagem alteravida, String edmessage,
    int alteracaoEnergia, int gop){
        this.nome = nome;
        this.texto = texto;
        this.opçoes = opçoes;
        this.alteravida = alteravida;
        this.edmessage = edmessage;
        this.gop = gop;
        this.alteracaoEnergia = alteracaoEnergia;

    }
    public void setEsc()
    {
        escolhas = new ArrayList<>();
    }
    public ArrayList<Escolha> getEsc()
    {
        return escolhas;
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    protected void mostrar(){
        System.out.println();
        System.out.println(nome);
        System.out.println();
        System.out.println(texto);
        System.out.println();
        if(alteracaoEnergia != 0){
            alteravida.alterarSaude(gop, alteracaoEnergia);
            System.out.println();
        }
        if(opçoes != null){
            System.out.println(opçoes);
            System.out.println();
        }
        if(edmessage != null){
            System.out.println(edmessage);
            System.out.println();
        }
    }
    /*Cria método que detecta a palavra/frase que o jogador digitou
    e retorna como variável int 1 ou 2*/
    protected Capitulo escolher(){
        Capitulo qual = null;
        Boolean check = false;
        while(check == false){
            String resposta = escane.nextLine();
            if(resposta.equalsIgnoreCase(escolhas.get(0).getTextoEsc())){
                check = true;
                qual = escolhas.get(0).getProximoEsc();}
            else if(resposta.equalsIgnoreCase(escolhas.get(1).getTextoEsc())){
                check = true;
                qual = escolhas.get(1).getProximoEsc();}
            else{System.out.println("Não existe uma resposta: '"+ resposta +"'.");}}
        return qual;
    }
    //Método principal que executa o código
    public void executar(){
        mostrar();
        if(opçoes != null){
            Capitulo x = escolher();
            x.executar();}
    }
}