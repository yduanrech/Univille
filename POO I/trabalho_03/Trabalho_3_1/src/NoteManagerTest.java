import org.junit.*;

public class NoteManagerTest {
    @Test
    public void testCreateListNotes() {
        NoteManager noteManager = new NoteManager();
        noteManager.createNote("note1.txt");
        noteManager.createNote("note2.txt");
        noteManager.createNote("note3.txt");
    }

    @Test
    public void testEditNote() {
        NoteManager noteManager = new NoteManager();
        noteManager.createNote("note1.txt");
        noteManager.editNote("note1.txt", "Conteúdo editado.");

        Note note = new Note("note1.txt");
        Assert.assertEquals("Conteúdo editado.", note.readContent());
    }
}
