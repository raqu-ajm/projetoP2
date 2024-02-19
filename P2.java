import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Personagem personagemJoao = new Personagem("João", 100, 100);
        Scanner leitor = new Scanner(System.in);
    
    // Criar capítulo 1
    String cap1 = "Era uma vez um jovem chamado João que vivia em uma pequena aldeia no topo de uma montanha."
    +" Ele sempre sonhou em explorar o mundo além da aldeia, mas nunca teve a chance."
    +" Certa vez, João saiu para buscar lenha na floresta, essa floresta tinha o nome de Trevamata, "
    +"por causa da sua fama de ter monstros e bruxas. João nunca viu nenhuma bruxa ou monstro,"
    +"então ele não temia a floresta igual os outros moradores da aldeia. João entra na floresta e caminha um pouco,"
    +" até se deparar com dois caminhos diferentes.";
    Capitulo capitulo1 = new Capitulo("Capítulo 1", cap1, personagemJoao, 20);

    //criar final ruim 1
    String final1 = "João lançou um último olhar ao caminho iluminado pela esquerda antes de se"
    +"decidir pelo caminho da direita, mergulhando na sombra densa da Trevamata. A escuridão parecia abraçá-lo,"
    +"e os contornos das árvores ganhavam formas mais imponentes, até que nada fosse visto, nem mesmo João..."
    +"nunca mais...";
    Capitulo finalruim1 = new Capitulo("Perdido para sempre", final1, personagemJoao, 100);

    //criar capitilo 2
    String cap2 = "Depois de um breve momento de reflexão, João tomou sua decisão. Optou pelo caminho da esquerda,"
    +"atraído pela luz e pela promessa de descobertas mais suaves. Seus passos ecoaram no solo enquanto ele se aventurava"
    +"mais profundamente na Trevamata, deixando para trás a segurança da aldeia."
    +"Na clareira, João sentiu uma atmosfera peculiar, carregada de uma energia única."
    +"A luz filtrava-se através das folhas, criando um espetáculo de sombras e reflexos dançantes."
    +"Enquanto ele explorava a clareira, um suave murmúrio parecia ecoar ao seu redor,"
    +"como se a Trevamata estivesse contando suas histórias por meio do vento ."
    +"João avistou um circulo no chão, curioso, ele foi investigar. - Um circulo de sal?"
    +"O que é isso no centro do circulo, parece uma caixa. ";
    Capitulo capitulo2 = new Capitulo("capitulo 2", cap2, personagemJoao, 30);

    //criar final ruim 2
    String final2 = "Ao abrir a caixa, João é puxado por mãos verdes e irrugadas para dentro de um vazio negro"
    +" aonde apenas escuta a voz da bruxa da floresta: 'menino curioso, sua mãe nunca lhe ensinou que a curiosidade"
    +" matou o gato?'. dizem que ainda se ouve o choro de arrependimento de João, que nunca mais foi visto....";
    Capitulo finalruim2 = new Capitulo("agora você é meu", final2, personagemJoao, 100);

    //criar final bom 3
    String final3 = "João fica maravilhado com a vista exuberante da floresta, mas uma epifania o vem "
    +"a mente: 'mamãe adoraria ver as belezas da floresta, sinto saudade de casa', acontece que João so tinha 8 anos,"
    +" então e o amor e saudade"
    +" de sua mãe o guia de volta a aldeia em segurança, fim.";
    Capitulo finalbom = new Capitulo("Saudades da mamãe", final3, personagemJoao, -50);

    //escolhas do capitulo 1
    Escolha e1 = new Escolha("João decide explorar a floresta, seguindo o caminho da esuqerda que estava mais claro", capitulo2);
    Escolha e2 = new Escolha ("João decide explorar a floresta, seguindo o caminho da direita que estava um pouco escuro", finalruim1);
    capitulo1.adicionarEscolha(e1);
    capitulo1.adicionarEscolha(e2);

    //Escolhas capitulo 2
    Escolha e3 = new Escolha ("Pegar a caixa para investigar o que pode conter dentro dela", finalruim2);
    Escolha e4 = new Escolha ("Deixa a caixa no local dela e ir explorar a clareira", finalbom);
    capitulo2.adicionarEscolha(e3);
    capitulo2.adicionarEscolha(e4);

    capitulo1.exibir(leitor);

    // Fechar o scanner
    leitor.close();
    }
}
