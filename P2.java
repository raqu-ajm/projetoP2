import java.util.Scanner;

public class P2{
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Personagem personagemJoao = new Personagem("João", 100);
    // Criar capítulo 1
    Capitulo capitulo1 = new Capitulo("Capítulo 1",
    "Era uma vez um jovem chamado João que vivia em uma pequena aldeia no topo de uma montanha. Ele sempre sonhou em explorar o mundo além da aldeia, mas nunca teve a chance. Certa vez, João saiu para buscar lenha na floresta, essa floresta tinha o nome de Trevamata, por causa da sua fama de ter monstros e bruxas. João nunca viu nenhuma bruxa ou monstro, então ele não temia a floresta igual os outros moradores da aldeia. João entra na floresta e caminha um pouco, até se deparar com dois caminhos diferentes.",
    "João decide explorar a floresta, seguindo o caminho da esuqerda que estava mais claro",
    "João decide explorar a floresta, seguindo o caminho da direita que estava um pouco escuro",
    personagemJoao, 0, entrada);

// Mostrar e escolher capítulo 1
capitulo1.mostrar();
int escolhaCapitulo1 = capitulo1.escolher();
if (escolhaCapitulo1 == 1) {
System.out.println("Depois de um breve momento de reflexão, João tomou sua decisão. Optou pelo caminho da esquerda, atraído pela luz e pela promessa de descobertas mais suaves. Seus passos ecoaram no solo enquanto ele se aventurava mais profundamente na Trevamata, deixando para trás a segurança da aldeia.");
} else {
System.out.println("João lançou um último olhar ao caminho iluminado pela esquerda antes de se decidir pelo caminho da direita, mergulhando na sombra densa da Trevamata. A escuridão parecia abraçá-lo, e os contornos das árvores ganhavam formas mais imponentes.");
}

// Criar capítulo 2
Capitulo capitulo2 = new Capitulo("Capítulo 2",
    "Na clareira, João sentiu uma atmosfera peculiar, carregada de uma energia única. A luz filtrava-se através das folhas, criando um espetáculo de sombras e reflexos dançantes. Enquanto ele explorava a clareira, um suave murmúrio parecia ecoar ao seu redor, como se a Trevamata estivesse contando suas histórias por meio do vento . João avistou um circulo no chão, curioso, ele foi investigar. - Um circulo de sal? O que é isso no centro do circulo, parece uma caixa. ",
    "Pegar a caixa para investigar o que pode conter dentro dela",
    "Deixa a caixa no local dela e ir explorar a clareira",
    personagemJoao, 10, entrada);

// Mostrar e escolher capítulo 2
capitulo2.mostrar();
int escolhaCapitulo2 = capitulo2.escolher();
if (escolhaCapitulo2 == 1) {
    int dano = capitulo2.percaEnergia();
    personagemJoao.alterarEnergia(-dano);
    System.out.println("João tomou um dano de 10");


} else {
System.out.println("João ignora a caixa e vai explorar a clareira.");
}

// Fechar o scanner
entrada.close();
} }
