import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leitor {
    HashMap<String, Personagem> lerPerso(String caminhoArquivoPersonagens){
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);

        try {
            Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");
            while(escaneadorArquivoPersonagens.hasNextLine()){
                String linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
                if(linhaEscaneada.equals("PERSONAGEM")){
                    Personagem personagem = new Personagem();
                    personagem.lerPersonagem(personagens, linhaEscaneada, personagem,
                    escaneadorArquivoPersonagens);
                }
            }
            escaneadorArquivoPersonagens.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personagens;
    }

    HashMap<String, Capitulo> lerCap(String caminhoArquivoCapitulos, HashMap<String, Personagem> personagens)
    {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
            Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");
            while(escaneadorArquivoCapitulos.hasNextLine())
            {
                String linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
                if(linhaEscaneada.equals("CAPITULO"))
                {
                    Capitulo capitulo = new Capitulo(capitulos, personagens, escaneadorArquivoCapitulos);
                    capitulos.put(capitulo.getCapitulo(), capitulo);
                    capitulos.get(capitulo.getCapitulo()).setEsc();
                }
                if(linhaEscaneada.equals("CAPITULO_IMAGEM"))
                {
                    CapituloImagem capituloImagem = new CapituloImagem(capitulos, personagens,
                    escaneadorArquivoCapitulos);
                    capitulos.put(capituloImagem.getCapituloImagem(), capituloImagem);
                    capitulos.get(capituloImagem.getCapituloImagem()).setEsc();
                }
                else if(linhaEscaneada.equals("ESCOLHA"))
                {
                    Escolha escolha = new Escolha();
                    escolha.lerEscolha(escolha, capitulos, escaneadorArquivoCapitulos);

                }
                
            }
            escaneadorArquivoCapitulos.close();
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return capitulos;
    }
}