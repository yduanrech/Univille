import java.io.*;
import java.nio.file.*;

public class Note {
    private String fileName;

    public Note(String fileName) {
        this.fileName = fileName + ".txt"; // Adiciona a extensão .txt ao nome do arquivo
    }

    public void writeContent(String content) {
        try {
            Path path = Paths.get(fileName);
            byte[] strToBytes = content.getBytes();

            Files.write(path, strToBytes);

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo " + fileName);
        }
    }

    public String readContent() {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + fileName);
            return null;
        }
    }
}
