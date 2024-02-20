import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulo{
    
    private String imagem;
    private Scanner escane = new Scanner(System.in);
    private ArrayList<Escolha> escolhas;

    public CapituloImagem(HashMap<String, Capitulo> capitulos,
    HashMap<String, Personagem> personagens,
    Scanner escaneadorArquivoCapitulos)
    {
        super(capitulos, personagens, escaneadorArquivoCapitulos);
        String imagemCapitulo = lerImg(escaneadorArquivoCapitulos);
        setImagem(imagemCapitulo);
    }
    public void setImagem(String imagem){
        this.imagem = imagem;
    }
    public String getCapituloImagem(){
        return this.nome;
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
    public void mostrar(){
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }
    //Lê uma imagem num txt
    public String lerImg(Scanner escaneadorArquivoCapitulos)
    {
                String imagem = "";
                String linha = escaneadorArquivoCapitulos.nextLine();
                while(!linha.equals("IMG_END")){
                    linha = escaneadorArquivoCapitulos.nextLine();
                    if(!linha.equals("IMG_END")){
                        linha += "\n";
                        imagem += linha;
                    }
                }
                return imagem;
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