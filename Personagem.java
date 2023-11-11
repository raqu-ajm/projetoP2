public class Personagem {
    private String nome;
    private int energia;
    private int maxEnergia;
    private StringBuilder historia;

    public Personagem(String nome, int energia, int maxEnergia, String historiaInicial) {
        this.nome = nome;
        this.energia = energia;
        this.maxEnergia = maxEnergia;
        this.historia =  new StringBuilder(historiaInicial);
    }

    

    //métodos 
    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getMaxEnergia() {
        return maxEnergia;
    }

    public void adicionarCapitulo(String capitulo) {
        this.historia.append("\n").append(capitulo);
    }

    public void mostrarHistoria() {
        System.out.println(nome + ": " + historia.toString());
    }


    public void setEnergia(int energia) {
        if (energia > maxEnergia) {
            this.energia = maxEnergia;
        } else if (energia < 0) {
            this.energia = 0;
            System.out.println(nome + " ficou esgotado!");
        } else {
            this.energia = energia;
        }
    }
    public static void main(String[] args){
        Personagem personagem1 = new Personagem("João", 50, 50, "João é um jovem corajoso que adora um desafio");
        Personagem personagem2 = new Personagem("Lobo Mau", 35, 40, "Adora atrapalhar os humanos que entram na floresta");
        Personagem personagem3 = new Personagem("Bler", 70,70, "Uma bruxa que pode ser boa ou má dependendo do humor que ele estiver naquele dia");
    }
}

