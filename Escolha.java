public class Escolha {
    private Capitulo proximoCapitulo;
    private String escolha;

    Escolha (String escolha, Capitulo proximo){
        this.escolha = escolha;
        this.proximoCapitulo = proximo;
    }

    public String getEscolha() {
        return escolha;
    }

    public Capitulo getProximoCapitulo() {
        return proximoCapitulo;
    }
}
