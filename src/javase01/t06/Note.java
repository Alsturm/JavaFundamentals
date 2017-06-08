package javase01.t06;

/**
 * Created by acorned on 06.06.17.
 */

public class Note {
    private NoteRecord[] notes = new NoteRecord[50];
    private int numberOfRecords = 0;

    boolean addRecord(NoteRecord record) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
             notes[i] = record;
             return true;
            }
        }
        return false;
    }
    void removeRecordByIndex(int index) throws IndexOutOfBoundsException, NoEntryException {

        if (index > notes.length)
            throw new IndexOutOfBoundsException();
        else if (notes[index] == null)
            throw new NoEntryException();
        else
            notes[index] = null;
    }

    void printRecords() {
        for (NoteRecord note : notes) {
            if (note != null) System.out.printf("%s %s%n", note.getHeader(), note.getText());
        }
    }
}

