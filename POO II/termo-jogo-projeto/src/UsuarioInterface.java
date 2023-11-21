public class UsuarioInterface {
    private StatusGame statusGame;

    public UsuarioInterface(StatusGame statusGame) {
        this.statusGame = statusGame;
    }

    public boolean verificarEntrada(String entrada) {
        String palavraSecreta = statusGame.getPalavraSecreta();

        if (entrada.equalsIgnoreCase(palavraSecreta)) {
            return true; // A entrada do usuário é correta
        } else {
            // Verifica letra por letra
            for (int i = 0; i < entrada.length(); i++) {
                char letra = entrada.charAt(i);
                if (palavraSecreta.indexOf(letra) >= 0) {
                    System.out.println("A letra " + letra + " existe na palavra secreta!");
                } else {
                    //System.out.println("A letra " + letra + " não existe na palavra secreta.");
                }
            }
        }
        return false; // A entrada do usuário é incorreta
    }
}
