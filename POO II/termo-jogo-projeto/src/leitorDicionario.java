import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class leitorDicionario {
    private List<String> dicionario; //lista para armazenar o dicionario
    private Random aleatorio;



    public leitorDicionario(String filePatch) { // construtor que inicia a leitura
        this.dicionario = new ArrayList<>();
        this.aleatorio = new Random();
        carregaPalavrasDoArquivo(filePatch);

    }

    private void carregaPalavrasDoArquivo(String filePatch) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(filePatch))) {
            String linha;
            while ( (linha = leitor.readLine() ) != null) {
                dicionario.add(linha.trim()); //add cada linha à lista após remover espaços em branco
            }
        } catch (IOException e) {
            e.printStackTrace(); //tratar exeções
        }
    }

    public List<String> getDicionario() {
        return dicionario;
    }

    public String getPalavraAleatoria() {
        if (dicionario.isEmpty()) {
            return null; //retorna null se n tiver nada
        }
        int i = aleatorio.nextInt(dicionario.size());
        return dicionario.get(i);
    }



}