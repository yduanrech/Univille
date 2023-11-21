public class TermoLogica {
    private StatusGame statusGame;
    private leitorDicionario leitor;

    public TermoLogica(String filePatch) {
        leitor = new leitorDicionario(filePatch);

        // Obtém uma palavra aleatória do dicionário
        String palavraSecreta = leitor.getPalavraAleatoria();

        // Cria uma instância de StatusGame com a palavra secreta
        statusGame = new StatusGame(palavraSecreta, 5);
    }

    public void imprimirPalavraSecreta() {
        // Imprime a palavra secreta
        System.out.println("Palavra Secreta: " + statusGame.getPalavraSecreta());
    }

    // Método main para teste
    /*public static void main(String[] args) {
        TermoLogica termoLogica = new TermoLogica("C://dic.txt");
        termoLogica.imprimirPalavraSecreta();
    }*/

    public boolean processarEntradaUsuario(String entrada) {
        statusGame.addTentativa(entrada);
        UsuarioInterface ui = new UsuarioInterface(statusGame);
        return ui.verificarEntrada(entrada);
    }

    public String getPalavraSecreta() {
        return statusGame.getPalavraSecreta();
    }


    public boolean isFimDeJogo() {
        return statusGame.fimDeJogo();
    }

    public boolean venceu() {
        return statusGame.venceu();
    }

    public int getMaxTentativas() {
        return statusGame.getMaxTentativas();
    }

    public int getNumeroDeTentativas() {
        return statusGame.getNumeroDeTentativas();
    }

}
