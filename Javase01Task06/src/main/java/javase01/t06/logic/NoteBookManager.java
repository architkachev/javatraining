package javase01.t06.logic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NoteBookManager {

    private NoteBook noteBook;

    public NoteBookManager(NoteBook noteBook) {
        this.noteBook = noteBook;
    }

    public void manage(NoteBook noteBook){
        this.noteBook = noteBook;
    }

    public void addNote(String noteString){
        this.noteBook.getNotes().add(new Note(noteString,this.noteBook.incLastID()));
    }

    public List<Note> getUnmodifiableListNotes(){
        return Collections.unmodifiableList(noteBook.getNotes());
    }

    private LinkedList<Note> getLinkedListNotes(){
        return noteBook.getNotes();
    }

    public boolean deleteNote(int ID){
        if(ID<0){
            return false;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getID()==ID){
                    this.getLinkedListNotes().remove(note);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean deleteNote(String noteString){
            for(Note note: this.getLinkedListNotes()){
                if(note.getNote().equals(noteString)){
                    this.getLinkedListNotes().remove(note);
                    return true;
                }
            }
            return false;
    }

    public boolean setNote(int idIdentifier, String newNote){
        if(idIdentifier<0){
            return false;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getID()==idIdentifier){
                    note.setNote(newNote);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean setNote(String stringNoteIdentifier, String newNote){
        for(Note note: this.getLinkedListNotes()){
            if(note.getNote().equals(stringNoteIdentifier)){
                note.setNote(newNote);
                return true;
            }
        }
        return false;
    }

    public Note getNote(int idIdentifier){
        if(idIdentifier<0){
            return null;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getID()==idIdentifier){
                    return note;
                }
            }
            return null;
        }
    }

    public Note getNote(String stringNoteIdentifier){
        for(Note note: this.getLinkedListNotes()){
            if(note.getNote().equals(stringNoteIdentifier)){
                return note;
            }
        }
        return null;
    }
}
