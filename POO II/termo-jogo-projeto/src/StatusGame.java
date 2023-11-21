import java.util.ArrayList;
import java.util.List;

public class StatusGame {
    // Armazena as tentativas do usuário e a palavra secreta atual.
    private String palavraSecreta; //palavra secreta
    private List<String> tentativas; //palavras tentadas
    private int maxTentativas = 5; //num max de tentativas

    public StatusGame(String palavraSecreta, int maxTentativas) {
        this.palavraSecreta = palavraSecreta;
        this.tentativas = new ArrayList<>();
        this.maxTentativas = maxTentativas;
    }

    public void addTentativa(String tentativa) {
        if (tentativas.size() < maxTentativas) {
            tentativas.add(tentativa);
        }
    }

    public boolean venceu() {
        return tentativas.contains(palavraSecreta);
    }

    public boolean fimDeJogo() {
        return venceu() || tentativas.size() >= maxTentativas;
    }



    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public List<String> getTentativas() {
        return tentativas;
    }

    public int getMaxTentativas() {
        return maxTentativas;
    }

    public int getNumeroDeTentativas() {
        return tentativas.size();
    }

}
