package javase01.t06.main;

import javase01.t06.logic.Note;
import javase01.t06.logic.NoteBook;
import java.util.List;

public class Main {
    public static void main(String [] args){
        NoteBook notebook = new NoteBook();
        notebook.addNote("String0");
        notebook.addNote("String1");
        notebook.addNote("String2");
        notebook.addNote("String3");
        notebook.addNote("String4");
        notebook.addNote("String5");
        notebook.addNote("String6");
        notebook.addNote("String7");
        notebook.addNote("String8");
        notebook.addNote("String9");
        notebook.addNote("String10");
        notebook.addNote("String11");
        notebook.addNote("String12");


        List<Note> ln = notebook.getListNotes();

        for(Note note:notebook.getListNotes()){
            System.out.println(note.getNote()+ "\t" + note.getID());
        }

        if(notebook.deleteNote(3)){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        if(notebook.deleteNote("String5")){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        if(notebook.deleteNote("String5")){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        notebook.setNote(6, "newString6");
        notebook.setNote("String9", "newString9");



        for(Note note:notebook.getListNotes()){
            System.out.println(note.getNote()+ "\t" + note.getID());
        }


        System.out.println("---------------------------");
        System.out.println(notebook.getNote(6).getNote());
        System.out.println(notebook.getNote("String11").getNote());



    }
}
