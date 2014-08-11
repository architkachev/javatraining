package javase01.t06.logic;

import java.util.LinkedList;

public class NoteBook {
    private LinkedList<Note> notes;
    private int lastID;

    public NoteBook() {
        this.notes = new LinkedList<Note>();
        this.lastID = 0;
    }

    LinkedList<Note> getNotes() {
        return notes;
    }

    int incLastID(){
       return this.lastID++;
    }




}
