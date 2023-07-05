import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class NoteManager {
    public void createNote(String fileName) {
        Note note = new Note(fileName);
        note.writeContent("");
    }

    public void editNote(String fileName, String content) {
        Note note = new Note(fileName);
        note.writeContent(content);
    }

    public void listNotes() {
        try (Stream<Path> paths = Files.list(Paths.get(""))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".txt")) // Filtra para listar apenas arquivos .txt
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Erro ao listar arquivos.");
            e.printStackTrace();
        }
    }
}
