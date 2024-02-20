import java.util.HashMap;
import java.util.Scanner;

public class Escolha {
    //Define os atributos da classe Escolha que servirá para fazer as listas ligadas
    private String texto; //Armazena o texto da escolha
    private Capitulo proximo; /*Caso o jogador opte por esta escolha, este atributo indicará qual capítulo virá como
    consequência dessa escolha*/
    
    public void setEscolha(String texto, Capitulo proximo){
        this.texto = texto;
        this.proximo = proximo;
    }
    public void lerEscolha(Escolha escolha, HashMap<String, Capitulo> capitulos, Scanner escaneadorArquivoCapitulos){
        escaneadorArquivoCapitulos.nextLine();
        String origemEscolha = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();
        String textoEscolha = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();
        String proximoEscolha = escaneadorArquivoCapitulos.nextLine();
        escolha.setEscolha(textoEscolha, capitulos.get(proximoEscolha));
        capitulos.get(origemEscolha).getEsc().add(escolha);

    }
    public String getTextoEsc(){
        String textoParaCapitulo = texto;
        return textoParaCapitulo;
}
    public Capitulo getProximoEsc(){
        Capitulo proximoParaCapitulo = proximo;
        return proximoParaCapitulo;
}
}
