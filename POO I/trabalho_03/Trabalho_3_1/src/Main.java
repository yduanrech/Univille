import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteManager noteManager = new NoteManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar nota");
            System.out.println("2. Editar nota");
            System.out.println("3. Listar notas");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // consome a linha restante

            switch (option) {
                case 1:
                    System.out.print("Nome do arquivo para a nova nota: ");
                    String newFileName = scanner.nextLine();
                    noteManager.createNote(newFileName);
                    System.out.print("Conteúdo da nova nota: ");
                    String newContent = scanner.nextLine();
                    noteManager.editNote(newFileName, newContent);
                    break;

                case 2:
                    System.out.println("Notas existentes:");
                    noteManager.listNotes();
                    System.out.print("Nome do arquivo da nota a editar: ");
                    String existingFileName = scanner.nextLine();
                    System.out.print("Novo conteúdo da nota: ");
                    String content = scanner.nextLine();
                    noteManager.editNote(existingFileName, content);
                    break;

                case 3:
                    noteManager.listNotes();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
