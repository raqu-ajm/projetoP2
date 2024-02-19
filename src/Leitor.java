import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leitor {
    public HashMap<String, Personagem> fazerPersonagem (String indexPersonagens)
    {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File meusPersonagens = new File(indexPersonagens);

        try
        {
            Scanner Leitor = new Scanner (meusPersonagens, "UTF-8");

            String nomePersonagem;
            int dano;
            int energiaMax;
            String linha = "";

            while (Leitor.hasNextLine())
            {
                while(!linha.equals("PERSONAGEM"))
                {
                    linha = Leitor.nextLine();
                }
                nomePersonagem = Leitor.nextLine();
                dano = Integer.parseInt(Leitor.nextLine());
                energiaMax = Integer.parseInt(Leitor.nextLine());

                personagens.put(nomePersonagem, new Personagem(nomePersonagem, dano, energiaMax));
                linha = "";
            }

            Leitor.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return personagens;
    }
    
    public HashMap<String, Capitulo> lerCapitulos (String indexCapitulos,
    HashMap<String, Personagem> personagens, Scanner ScannerMain)
    {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File SaveCapitulos = new File(indexCapitulos);

        try
        {
            Scanner sc = new Scanner(SaveCapitulos, "UTF-8");
            String linha = "";

            while(sc.hasNextLine())
            {
                while(!linha.equals("CAPITULO") &&
                !linha.equals("ESCOLHAS"))
                {
                    linha = sc.nextLine();
                }

                if (linha.equals("CAPITULO"))
                {
                    lerCapitulos(personagens, ScannerMain, capitulos, sc);
                    linha = "";
                }
                else if (linha.equals("ESCOLHAS"))
                {
                    lerEscolhas(capitulos, sc);
                    linha = "";
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        return capitulos;
    }

    private void lerCapitulos (HashMap<String,Personagem> personagens,
    Scanner ScanerMain, HashMap<String, Capitulo> capitulos, Scanner sc)
    {
        String CapituloNome;
        String texto;
        String nomePersonagem;
        int dano;
        CapituloNome = sc.nextLine();
        texto = sc.nextLine();
        nomePersonagem = sc.nextLine();
        dano = Integer.parseInt(sc.nextLine());

        capitulos.put(CapituloNome, new Capitulo(CapituloNome, texto ,personagens.get(nomePersonagem), dano));
    }

    private void lerEscolhas (HashMap<String,Capitulo> capitulos,
    Scanner sc)
    {
        String NomeCapitulo;
        String texto;
        String ProximoCapitulo;
        NomeCapitulo = sc.nextLine();
        texto = sc.nextLine();
        ProximoCapitulo = sc.nextLine();
    
        Capitulo CapituloOrigem = capitulos.get(NomeCapitulo);
        Capitulo CapituloProximo = capitulos.get(ProximoCapitulo);
        CapituloOrigem.adicionarEscolha(new Escolha(texto, CapituloProximo));
    }

    
}
