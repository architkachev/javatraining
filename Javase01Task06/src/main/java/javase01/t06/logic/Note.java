package javase01.t06.logic;

public class Note {
    //private
    private String note;
    private final int id;
    //public
    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
    //friendly
    Note(String note, int id) {
        this.note = note;
        this.id = id;
    }

    void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note1 = (Note) o;

        if (id != note1.id) return false;
        if (note != null ? !note.equals(note1.note) : note1.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = note != null ? note.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
