import java.util.Scanner;
// Construtores
public class Capitulo {
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int energia;
    private int alteracaoEnergia;
    private Scanner leitor;
    private int dano;
    
    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia, Scanner leitor) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;

        this.alteracaoEnergia = alteracaoEnergia;
        this.leitor = leitor;
    }

    public void mostrar() {
        System.out.println("Capítulo: " + nome);
        System.out.println(texto);
        System.out.println("Escolha 1: " + escolha1);
        System.out.println("Escolha 2: " + escolha2);
        System.out.println("Energia do Personagem: " + personagem.getEnergia());
    }


    public void alterarEnergia(int alteracao) {
        this.energia += alteracao;
    }

    public int escolher() {
        int escolha = 0;
        do {
            System.out.print("Escolha 1 ou 2: ");
            String resposta = leitor.nextLine();
            if (resposta.equals("1") || resposta.equals("2")) {
                escolha = Integer.parseInt(resposta);
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha == 0);
        
        // Atualiza a energia do personagem de acordo com a alteração definida no capítulo
        personagem.alterarEnergia(alteracaoEnergia);
        return escolha;
    }
        
        public int percaEnergia(){
            return dano;
        }
    

    public static void main(String[] args) {
        // Criar um objeto Scanner para entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Criar personagem
        Personagem personagem = new Personagem("João",70 );

        // Criar capítulos
        Capitulo capitulo1 = new Capitulo("Capítulo 1", "Texto do Capitulo", "Escolha A", "Escolha B", personagem, -10, entrada);
        Capitulo capitulo2 = new Capitulo("Capítulo 2", "Texto do Capítulo 2", "Escolha C", "Escolha D", personagem, 15, entrada);

        // Mostrar e escolher capítulo 1
        capitulo1.mostrar();
        int escolhaCapitulo1 = capitulo1.escolher();
        System.out.println("Escolha do Capítulo 1: " + escolhaCapitulo1);

        // Mostrar e escolher capítulo 2
        capitulo2.mostrar();
        int escolhaCapitulo2 = capitulo2.escolher();
        System.out.println("Escolha do Capítulo 2: " + escolhaCapitulo2);

        // Fechar o scanner
        entrada.close();
    }
}

class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void alterarEnergia(int alteracao) {
        this.energia += alteracao;
    }
}

