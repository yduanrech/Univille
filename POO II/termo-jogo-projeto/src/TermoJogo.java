import java.util.Scanner;

public class TermoJogo {
    public static void main(String[] args) {
        String filePatch = "D:\\Usuários\\Yduan\\OneDrive\\Univille\\2023 - 2 Ano\\2 Semestre\\POO II\\termo-jogo-projeto\\src\\dicionario-termo.txt";
        TermoLogica termoLogica = new TermoLogica(filePatch);
        Scanner scanner = new Scanner(System.in);

        while (!termoLogica.isFimDeJogo()) {
            System.out.println("Digite sua tentativa: ");
            String entradaUsuario = scanner.nextLine();

            boolean acertou = termoLogica.processarEntradaUsuario(entradaUsuario);

            if (acertou) {
                System.out.println("Parabéns! Você acertou a palavra secreta!");
                System.out.println("A palavra secreta era: " + termoLogica.getPalavraSecreta());
                break;
            }

            System.out.println("Tentativas restantes: " + (termoLogica.getMaxTentativas() - termoLogica.getNumeroDeTentativas()));
        }

        scanner.close();
    }
}
