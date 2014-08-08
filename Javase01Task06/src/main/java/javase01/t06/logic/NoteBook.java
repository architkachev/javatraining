package javase01.t06.logic;

import java.util.LinkedList;

public class NoteBook {
    private LinkedList<Note> notes;
    private int lastID;

    NoteBook() {
        LinkedList<Note> notes = new LinkedList<Note>();
        this.notes = notes;
        this.lastID = 0;
    }

    LinkedList<Note> getNotes() {
        return notes;
    }

    int incLastID(){
       return this.lastID++;
    }




}
