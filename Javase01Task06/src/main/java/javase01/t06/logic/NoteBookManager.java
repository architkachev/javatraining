package javase01.t06.logic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The {@code NoteBookManager} class represents manager of {@code NoteBook} class.
 * It include all methods to work with {@code NoteBook} class
 * <p>
 * For example:
 * <blockquote><pre>
 *     NoteBook noteBook1 = new NoteBook();
 *     NoteBook noteBook2 = new NoteBook();
 *     NoteBook noteBook3 = new NoteBook();
 *     NoteBookManager manager = new NoteBookManager(noteBook1);
 *     //...
 *     //Operation with notebook1;
 *     //...
 *     manager.manage(noteBook2);
 *     //...
 *     //Operation with notebook2;
 *     //...
 *     manager.manage(noteBook3);
 *     //...
 *     //Operation with notebook1;
 *     //...
 *
 * </pre></blockquote><p>
 *
 * @author  artsiom_tkachou
 * @see     javase01.t06.logic.NoteBook
 * @see     javase01.t06.logic.Note
 */
@SuppressWarnings("JavaDoc")
public class NoteBookManager {

    private NoteBook noteBook;

/**
 * Initializes a newly created {@code NoteBookManager} object, that manage {@code NoteBook} object.
 *
 * @param  noteBook
 */
    public NoteBookManager(NoteBook noteBook) {
        this.noteBook = noteBook;
    }
/**
 * Initializes a newly created {@code NoteBookManager}.
 */
    public NoteBookManager() {
    }
/**
 * Change {@code NoteBook} object, that {@code NoteBookManager} manage.
 *
 * @param  noteBook
 */
    public void manage(NoteBook noteBook){
        this.noteBook = noteBook;
    }
/**
 * Add newly created {@code Note} object, with noteString value to {@code NoteBook} object, that {@code NoteBookManager} manage.
 *
 * @param  noteString
 */
    public void addNote(String noteString){
        this.noteBook.getNotes().add(new Note(noteString,this.noteBook.incLastID()));
    }
/**
 * @return     the Unmodifiable  {@code List<Note>}
 */
    public List<Note> getUnmodifiableListNotes(){
        return Collections.unmodifiableList(noteBook.getNotes());
    }

    private LinkedList<Note> getLinkedListNotes(){
        return noteBook.getNotes();
    }
/**
 * @param  ID
 * @return the {@code true} if delete operation success, and {@code false} delete operation don't success
 */
    public boolean deleteNote(int ID){
        if(ID<0){
            return false;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getId()==ID){
                    this.getLinkedListNotes().remove(note);
                    return true;
                }
            }
            return false;
        }
    }
/**
 * @param  noteString
 * @return the {@code true} if delete operation success, and {@code false} delete operation don't success
 */
    public boolean deleteNote(String noteString){
            for(Note note: this.getLinkedListNotes()){
                if(note.getNote().equals(noteString)){
                    this.getLinkedListNotes().remove(note);
                    return true;
                }
            }
            return false;
    }
/**
 * Method change {@code String} value in {@code Note} where ID == idIdentifier
 *
 * @param  idIdentifier
 * @param  newNote
 * @return the {@code true} if delete operation success, and {@code false} delete operation don't success
 */
    public boolean setNote(int idIdentifier, String newNote){
        if(idIdentifier<0){
            return false;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getId()==idIdentifier){
                    note.setNote(newNote);
                    return true;
                }
            }
            return false;
        }
    }
/**
 * Method change {@code String} value in {@code Note} where {@code String} value == stringNoteIdentifier
 *
 * @param  stringNoteIdentifier
 * @param  newNote
 * @return the {@code true} if delete operation success, and {@code false} delete operation don't success
 */
    public boolean setNote(String stringNoteIdentifier, String newNote){
        for(Note note: this.getLinkedListNotes()){
            if(note.getNote().equals(stringNoteIdentifier)){
                note.setNote(newNote);
                return true;
            }
        }
        return false;
    }
/**
 * @param  idIdentifier
 * @return the {@code Note} object if {@code NoteBook} object has {@code Note} object witch ID == idIdentifier,
 * or {@code null} if {@code NoteBook} object has no any {@code Note} object witch ID == idIdentifier
 */
    public Note getNote(int idIdentifier){
        if(idIdentifier<0){
            return null;
        } else {
            for(Note note: this.getLinkedListNotes()){
                if(note.getId()==idIdentifier){
                    return note;
                }
            }
            return null;
        }
    }
/**
 * @param  stringNoteIdentifier
 * @return the {@code Note} object if {@code NoteBook} object has {@code Note} object witch String value == stringNoteIdentifier,
 * or {@code null} if {@code NoteBook} object has no any {@code Note} object String value == stringNoteIdentifier
 */
    public Note getNote(String stringNoteIdentifier){
        for(Note note: this.getLinkedListNotes()){
            if(note.getNote().equals(stringNoteIdentifier)){
                return note;
            }
        }
        return null;
    }
}
