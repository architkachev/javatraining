package javase01.t06.logic;

public class Note {
    //public
    public int getID() {
        return ID;
    }

    public String getNote() {
        return note;
    }
    //friendly
    Note(String note, int id) {
        this.note = note;
        ID = id;
    }

    void setNote(String note) {
        this.note = note;
    }
    //private
    private String note;
    private final int ID;
}
